package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.computadora.Computadora;
import edu.fiuba.algo3.modelo.computadora.ordenesDeArresto.OrdenDeArresto;
import edu.fiuba.algo3.modelo.detective.Detective;
import edu.fiuba.algo3.modelo.detective.DetectiveNovato;

import java.util.ArrayList;
import java.util.Observable;

public class Juego extends Observable {

private static Juego instancia = null;

    private Detective detective;
    private Ciudad ciudadActual;
    private Computadora computadora;
    //private

    public Juego(){
        this.detective = new DetectiveNovato();
        this.computadora = new Computadora();
    }

    private static void crearJuego() {
        if (instancia == null) {
            instancia = new Juego();
        }
    }

    public static Juego obtenerInstancia() {
        if (instancia == null) {
            crearJuego();
        }
        return instancia;
    }

    public void resetear(){
        if (instancia != null) {
            instancia.detective = new DetectiveNovato();
            instancia.computadora = new Computadora();
        }
    }

    public String visitarEdificio(Edificio edificio){
        return this.ciudadActual.visitarEdificio(this.detective, edificio);
    }

    public void viajar(Ciudad destino){
        this.ciudadActual = this.ciudadActual.realizarViaje(destino, this.detective);

    }

    public OrdenDeArresto emitirOrdenDeArresto(){
        return this.detective.emitirOrdenDeArresto(this.computadora);

    }

    public void empezarNuevaMision(){
        this.ciudadActual = Mapa.obtenerInstancia().crearRutaDelLadron(detective.determinarLongitudMision());
    }

    public Ciudad ciudadActual(){
        return this.ciudadActual;
    }

    public Detective obtenerDetective(){
        return this.detective;
    }

    public Computadora obtenerComputadora(){
        return this.computadora;
    }

    public String obtenerHorario() {
        return this.detective.obtenerFecha().mostrar();
    }

    public void estadoMision(){

    }

    private boolean seAcaboElTiempo(){
        return !this.detective.verificarFechaLimite();
    }

    ////// TESTS //////
    public void establecerCiudadActual(Ciudad ciudad){
        this.ciudadActual = ciudad;
    }

}
