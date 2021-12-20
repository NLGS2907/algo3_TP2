package edu.fiuba.algo3.modelo.detective;

import edu.fiuba.algo3.modelo.*;
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

    public String visitarEdificio(Edificio edificio, int horas){
        this.reloj.avanzarTiempo(horas);
        return edificio.desplegarPista();
    }

    public Fecha obtenerFecha(){
        return this.reloj.obtenerFecha();
    }
    
    public OrdenDeArresto emitirOrdenDeArresto(Computadora computadora) {
        this.reloj.avanzarTiempo(3);
        this.ordenDeArresto = computadora.emitirOrdenDeArresto();
        return this.ordenDeArresto;
    }

    public Detective arrestarladron(Ladron ladron){
        if(this.ordenDeArresto.esPara(ladron)){
            return this.incrementarArresto();
        }
        return this;
    }

    public abstract void viajar(int distancia);

    public abstract void viajarACiudadConLadron(int distancia);

    public abstract Detective incrementarArresto();

    public void asignarOrdenDeArresto(OrdenDeArresto ordenDeArresto) {
        this.ordenDeArresto = ordenDeArresto;
    }

    public int obtenerContador() {
        return this.cantidadDeArrestos;
    }
}
