package edu.fiuba.algo3.modelo;
import java.time.LocalDateTime;

public class Reloj {

    private LocalDateTime fecha;
    private final LocalDateTime fechaLimite;

    public Reloj(){
        this.fecha = LocalDateTime.of(2021, 1, 1, 7, 0);
        this.fechaLimite = LocalDateTime.of(2021, 1, 7, 17, 0);
    }

    public void avanzarTiempo(int horas){
        LocalDateTime auxiliar = this.fecha.plusHours(0);
        this.fecha = this.fecha.plusHours(horas);
        if(auxiliar.withHour(22).isBefore(this.fecha)) {
            this.fecha = this.fecha.plusHours(8);
        }
    }

    public boolean verificarFechaLimite(){
        return( this.fecha.isBefore(fechaLimite) );
    }

    public LocalDateTime obtenerFecha() {
        return this.fecha;
    }

}
