package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.cuchillazo.Cuchillazo;
import edu.fiuba.algo3.modelo.cuchillazo.SinAcuchillar;

import java.time.LocalDateTime;

public abstract class Detective {
    protected Reloj reloj;
    protected Cuchillazo cantidadDeCuchillazos;
    protected boolean ordenDeArresto;

    Detective(){
        this.reloj = new Reloj();
        this.cantidadDeCuchillazos = new SinAcuchillar();
        this.ordenDeArresto = false;
    }

    public boolean verificarFechaLimite(){
        return( this.reloj.verificarFechaLimite() );
    }

    public abstract String visitarEdificio(Edificio edificio, int horas);

    public LocalDateTime obtenerFecha(){
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
}
