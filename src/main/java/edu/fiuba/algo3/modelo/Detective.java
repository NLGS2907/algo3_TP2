package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.cuchillazo.Cuchillazo;
import edu.fiuba.algo3.modelo.cuchillazo.SinAcuchillar;

import java.time.LocalDateTime;

public abstract class Detective {
    protected Reloj reloj;
    protected Cuchillazo cantidadDeCuchillazos;

    Detective(){
        this.reloj = new Reloj();
        this.cantidadDeCuchillazos = new SinAcuchillar();
    }

    public boolean verificarFechaLimite(){
        return( this.reloj.verificarFechaLimite() );
    }

    public abstract String visitarEdificio(Edificio edificio, int horas);

    public LocalDateTime obtenerFecha(){
        return reloj.obtenerFecha();
    }

    public abstract void viajar(int distancia);

    public abstract void viajarACiudadConLadron(int distancia);
}
