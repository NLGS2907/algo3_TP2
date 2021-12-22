package edu.fiuba.algo3.modelo.detective;

import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.Ladron;
import edu.fiuba.algo3.modelo.reloj.Fecha;
import edu.fiuba.algo3.modelo.reloj.Reloj;
import edu.fiuba.algo3.modelo.cuchillazo.Cuchillazo;
import edu.fiuba.algo3.modelo.cuchillazo.SinAcuchillar;
import edu.fiuba.algo3.modelo.edificios.Edificio;

public abstract class Detective {
    protected Reloj reloj;
    protected Cuchillazo cantidadDeCuchillazos;
    protected OrdenDeArresto ordenDeArresto;
    protected int cantidadDeArrestos;
    protected float velocidad;

    Detective(){
        this.reloj = new Reloj();
        this.cantidadDeCuchillazos = new SinAcuchillar();
        this.ordenDeArresto = new OrdenInvalida();
        this.cantidadDeArrestos = 0;
    }

    public boolean verificarFechaLimite(){
        return( this.reloj.verificarFechaLimite() );
    }

    public void visitarEdificio(Edificio edificio, int horas){
        this.reloj.avanzarTiempo(horas);
        edificio.visitar(this, horas);
    }

    public Fecha obtenerFecha(){
        return this.reloj.obtenerFecha();
    }
    
    public void emitirOrdenDeArresto(Computadora computadora) {
        this.reloj.avanzarTiempo(3);
        this.ordenDeArresto = computadora.emitirOrdenDeArresto();
    }

    public Detective arrestarladron(Ladron ladron){
        if(this.ordenDeArresto.esPara(ladron)){
            this.incrementarArresto();
        }
        return this;
    }

    public abstract void viajar(int distancia);

    public abstract void viajarACiudadConLadron(int distancia);

    public abstract Detective incrementarArresto();

    public String leerPista(String nombreCiudad, String tipoEdificio){
        return "a";
        //return ContenedorDePistas.getInstrance().lerrPistaCon(nombreCiudad, tipoEdificio, this.dificultad);
    }

    //public void asignarOrdenDeArresto(OrdenDeArresto ordenDeArresto) {
        //this.ordenDeArresto = ordenDeArresto;
    //}

    public int obtenerContador() {
        return this.cantidadDeArrestos;
    }
}
