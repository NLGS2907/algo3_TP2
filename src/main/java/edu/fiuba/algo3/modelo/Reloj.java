package edu.fiuba.algo3.modelo;
import java.time.LocalDateTime;


public class Reloj {

    private LocalDateTime fecha;

    Reloj(){
        this.fecha = LocalDateTime.of(2021, 1, 1, 7, 0);
    }

    public void avanzarTiempo(int horas){
        LocalDateTime auxiliar = this.fecha.plusHours(0);
        this.fecha = this.fecha.plusHours(horas);
        if(23 == this.fecha.getHour() || this.fecha.getDayOfMonth() != auxiliar.getDayOfMonth()) {
            this.fecha = this.fecha.plusHours(8);
        }
    }

    public LocalDateTime obtenerFecha() {
        return this.fecha;
    }

}
