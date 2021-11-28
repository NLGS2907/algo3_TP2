package edu.fiuba.algo3.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import static java.util.List.of;

public class Reloj {

    private LocalDateTime fecha;

    Reloj(){
        this.fecha = LocalDateTime.of(2021, 1, 1, 7, 0);
    }

    public void avanzarTiempo(int horas){
        this.fecha = this.fecha.plusHours(horas);
    }

    public LocalDateTime obtenerFecha() {
        return this.fecha;
    }
}
