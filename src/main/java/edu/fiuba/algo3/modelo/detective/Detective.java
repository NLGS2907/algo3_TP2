package edu.fiuba.algo3.modelo.detective;

import edu.fiuba.algo3.modelo.computadora.Computadora;
import edu.fiuba.algo3.modelo.ladron.Ladron;
import edu.fiuba.algo3.modelo.computadora.ordenesDeArresto.OrdenDeArresto;
import edu.fiuba.algo3.modelo.computadora.ordenesDeArresto.OrdenInvalida;
import edu.fiuba.algo3.modelo.pistas.ContenedorDePistas;
import edu.fiuba.algo3.modelo.detective.randomizador.Randomizador;
import edu.fiuba.algo3.modelo.reloj.Fecha;
import edu.fiuba.algo3.modelo.reloj.Reloj;
import edu.fiuba.algo3.modelo.detective.cuchillazo.Cuchillazo;
import edu.fiuba.algo3.modelo.detective.cuchillazo.SinAcuchillar;
import edu.fiuba.algo3.modelo.Edificio;

import java.util.Observable;

public abstract class Detective extends Observable {
    protected Reloj reloj;
    protected Cuchillazo cantidadDeCuchillazos;
    protected OrdenDeArresto ordenDeArresto;
    protected int cantidadDeArrestos;
    protected float velocidad;
    protected Randomizador randomizador;

    Detective(){
        this.reloj = new Reloj();
        this.cantidadDeCuchillazos = new SinAcuchillar();
        this.ordenDeArresto = new OrdenInvalida();
    }

    public boolean verificarFechaLimite(){
        return( this.reloj.verificarFechaLimite() );
    }

    public void visitarEdificio(Edificio edificio, int horas){
        this.reloj.avanzarTiempo(horas);
        edificio.visitar(this);
    }

    public Fecha obtenerFecha(){
        return this.reloj.obtenerFecha();
    }
    
    public OrdenDeArresto emitirOrdenDeArresto(Computadora computadora) {
        this.ordenDeArresto = computadora.emitirOrdenDeArresto();
        this.reloj.avanzarTiempo(3);
        return this.ordenDeArresto;
    }

    public Detective arrestarladron(Ladron ladron){
        if(this.ordenDeArresto.esPara(ladron)){
            this.incrementarArresto();
            notifyObservers();
        }
        return this;
    }

    public abstract void viajar(int distancia);

    public void viajarACiudadConLadron(int distancia){
        this.cantidadDeCuchillazos = this.cantidadDeCuchillazos.acuchillar(this.reloj);
        this.reloj.avanzarTiempo((int) Math.round(distancia/this.velocidad));
    }

    private void sufrirCuchillazo(float probabilidad){
        if(probabilidad < 0.1)
            this.cantidadDeCuchillazos = this.cantidadDeCuchillazos.acuchillar(this.reloj);
    }

    private void sufrirBalazo(float probabilidad){
        if(probabilidad < 0.1)
            this.reloj.avanzarTiempo(4);
    }

    public void recibirAtaque(){
        float probabilidad = this.randomizador.generarProbabilidad();
        if(probabilidad < 0.3)
            this.sufrirBalazo(probabilidad);
        else this.sufrirCuchillazo(probabilidad);
    }

    public abstract Detective incrementarArresto();

    public String leerPista(String nombreCiudad, String tipoEdificio){
        return ContenedorDePistas.obtenerInstancia().leerPista(randomizador.generarDificultad(), nombreCiudad, tipoEdificio);
    }

    public int determinarLongitudMision(){
        if(this.cantidadDeArrestos < 5){
            return 3;
        } else if(this.cantidadDeArrestos < 10){
            return 5;
        } else return 7;
    }

    public int obtenerContador() {
        return this.cantidadDeArrestos;
    }
}
