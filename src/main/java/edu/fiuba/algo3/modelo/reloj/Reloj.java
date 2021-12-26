package edu.fiuba.algo3.modelo.reloj;
import edu.fiuba.algo3.modelo.Juego;

import java.time.LocalDateTime;
import java.util.Observable;

public class Reloj extends Observable {

    private Fecha fecha;
    private final Fecha fechaLimite;

    public Reloj(){
        this.fecha = new Fecha(4, 7);
        this.fechaLimite = new Fecha(10, 17);
    }

    public void avanzarTiempo(int horas){
        Fecha auxiliar = this.fecha.masHoras(0);
        this.fecha = this.fecha.masHoras(horas);
        if(auxiliar.conHora(22).esAntesDe(this.fecha)) {
            this.fecha = this.fecha.masHoras(8);
        }
        if(!verificarFechaLimite()){

            Juego.obtenerInstancia().tiempoAgotado();
            notifyObservers();
        }
    }

    public boolean verificarFechaLimite(){
        return this.fecha.esAntesDe(fechaLimite);
    }

    public Fecha obtenerFecha() {
        return this.fecha;
    }

    public String mostrarFecha() {
        return this.fecha.mostrar();
    }

}
