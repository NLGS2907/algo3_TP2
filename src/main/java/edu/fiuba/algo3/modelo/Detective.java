package edu.fiuba.algo3.modelo;


import java.time.LocalDateTime;

public abstract class Detective {
    protected Reloj reloj;

    Detective(){
        this.reloj = new Reloj();
    }

    public abstract String visitarEdificio(Edificio edificio, int horas);

    public LocalDateTime obtenerFecha(){
        return reloj.obtenerFecha();
    }
}
