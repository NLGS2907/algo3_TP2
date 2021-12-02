package edu.fiuba.algo3.modelo;

import java.time.LocalDateTime;

public abstract class Detective {
    protected Reloj reloj;
    protected int contadorDeCuchillazos;

    Detective(){
        this.reloj = new Reloj();
        this.contadorDeCuchillazos = 0;
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
