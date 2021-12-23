package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.computadora.Computadora;
import edu.fiuba.algo3.modelo.detective.Detective;
import edu.fiuba.algo3.modelo.detective.DetectiveNovato;

public class Juego {

    private Detective detective;
    private Ciudad ciudadActual;
    private Computadora computadora;

    Juego(){
        this.detective = new DetectiveNovato();
        this.computadora = new Computadora();
    }

    public String visitarEdificio(Edificio edificio){
        return this.ciudadActual.visitarEdificio(this.detective, edificio);
    }

    public void viajar(Ciudad destino){
        this.ciudadActual = this.ciudadActual.realizarViaje(destino, this.detective);
    }

    public void emitirOrdenDeArresto(){
        this.detective.emitirOrdenDeArresto(this.computadora);
    }

    public void empezarNuevaMision(){
        this.ciudadActual = Mapa.obtenerInstancia().crearRutaDelLadron(detective.determinarLongitudMision());
    }

    ////// TESTS //////

    public void establecerCiudadActual(Ciudad ciudad){
        this.ciudadActual = ciudad;
    }

    public Ciudad ciudadActual(){
        return this.ciudadActual;
    }

    public Detective obtenerDetective(){
        return this.detective;
    }
}
