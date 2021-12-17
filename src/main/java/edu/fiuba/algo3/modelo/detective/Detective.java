package edu.fiuba.algo3.modelo.detective;

import edu.fiuba.algo3.modelo.Computadora;
import edu.fiuba.algo3.modelo.Ladron;
import edu.fiuba.algo3.modelo.reloj.Fecha;
import edu.fiuba.algo3.modelo.reloj.Reloj;
import edu.fiuba.algo3.modelo.cuchillazo.Cuchillazo;
import edu.fiuba.algo3.modelo.cuchillazo.SinAcuchillar;
import edu.fiuba.algo3.modelo.edificios.Edificio;

public abstract class Detective {
    protected Reloj reloj;
    protected Cuchillazo cantidadDeCuchillazos;
    protected boolean ordenDeArresto;
    protected int cantidadDeArrestos;
    protected float velocidad;

    Detective(){
        this.reloj = new Reloj();
        this.cantidadDeCuchillazos = new SinAcuchillar();
        this.ordenDeArresto = false;
        this.cantidadDeArrestos = 0;
    }

    public boolean verificarFechaLimite(){
        return( this.reloj.verificarFechaLimite() );
    }

    public abstract String visitarEdificio(Edificio edificio, int horas);

    public Fecha obtenerFecha(){
        return this.reloj.obtenerFecha();
    }
    
    public boolean emitirOrdenDeArresto(Computadora baseDeDatos, Ladron ladronImaginado){
        this.reloj.avanzarTiempo(3);
        this.ordenDeArresto = baseDeDatos.buscarLadron(ladronImaginado);
        return this.ordenDeArresto;
    }

    public boolean arrestarladron(){
        return this.ordenDeArresto;
    }

    public abstract void viajar(int distancia);

    public abstract void viajarACiudadConLadron(int distancia);

    public abstract Detective incrementarArresto();
}
