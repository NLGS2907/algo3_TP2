package edu.fiuba.algo3.modelo.reloj;

import java.time.LocalDateTime;

public class Fecha {

    private LocalDateTime fechaReal;

    public Fecha(int diaDelMes, int horaDelDia, int minuto) {
        this.fechaReal = LocalDateTime.of(2021, 1, diaDelMes, horaDelDia, minuto);
    }

    public Fecha(Fecha fechaOriginal) {
        this.fechaReal = fechaOriginal.fechaReal.plusHours(0);
    }

    public Fecha masHoras(int horas) {
        Fecha fecha = new Fecha(this);
        fecha.fechaReal = fecha.fechaReal.plusHours(horas);
        return fecha;
    }

    public Fecha conHora(int nuevaHora) {
        Fecha fecha = new Fecha(this);
        fecha.fechaReal = fecha.fechaReal.withHour(nuevaHora);
        return fecha;
    }

    public boolean esIgualA(Fecha otraFecha) {
        return this.fechaReal.isEqual(otraFecha.fechaReal);
    }

    public boolean esAntesDe(Fecha otrafecha) {
        return this.fechaReal.isBefore(otrafecha.fechaReal);
    }

    public String mostrar() {
        return "Prueba";
    }

    public LocalDateTime getFechaReal(){
        return this.fechaReal;
    }
}
