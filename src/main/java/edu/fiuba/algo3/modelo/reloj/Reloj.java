package edu.fiuba.algo3.modelo.reloj;
import java.time.LocalDateTime;

public class Reloj {

    private Fecha fecha;
    private final Fecha fechaLimite;

    public Reloj(){
        this.fecha = new Fecha(1, 7);
        this.fechaLimite = new Fecha(7, 17);
    }

    public void avanzarTiempo(int horas){
        Fecha auxiliar = this.fecha.masHoras(0);
        this.fecha = this.fecha.masHoras(horas);
        if(auxiliar.conHora(22).esAntesDe(this.fecha)) {
            this.fecha = this.fecha.masHoras(8);
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
