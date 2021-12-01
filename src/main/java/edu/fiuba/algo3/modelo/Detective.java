package edu.fiuba.algo3.modelo;


import java.time.LocalDateTime;

public abstract class Detective {
    protected Reloj reloj;

    Detective(){
        this.reloj = new Reloj();
    }

    public boolean verificarFechaLimite(){
        return( this.reloj.verificarFechaLimite() );
    }

    public abstract String visitarEdificio(Edificio edificio, int horas);

    public LocalDateTime obtenerFecha(){
        return reloj.obtenerFecha();
    }

    public abstract void viajar(int distancia);
}
