package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.detective.Detective;
import edu.fiuba.algo3.modelo.edificios.Edificio;

import java.util.ArrayList;

public class Ciudad {

    private String nombre;
    private ArrayList<Edificio> edificios;
    private ArrayList<Ciudad> ciudadesAdyacentes;
    private int contadorVisitas;

    public Ciudad(String nombre){
        this.edificios = new ArrayList<>();
        this.ciudadesAdyacentes = new ArrayList<>();
        this.contadorVisitas = 0;
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public int obtenerVisitas() {
        return this.contadorVisitas;
    }

    public void visitarEdificio(Detective detective, Edificio edificio){
        if(this.contadorVisitas < 3){
            this.contadorVisitas++;
        }
        detective.visitarEdificio(edificio, this.contadorVisitas);
    }


    public void agregarEdificio(Edificio edificio){
        this.edificios.add(edificio);
    }

    void agregarRutaDeVuelo(Ciudad ciudad) {
        ciudadesAdyacentes.add(ciudad);
    }

    ////// TEST //////
    public Ciudad realizarViaje(Ciudad destino, Detective detective) {
        Mapa.obtenerInstancia().realizarViaje(this, destino, detective);
        return destino;
    }
}
