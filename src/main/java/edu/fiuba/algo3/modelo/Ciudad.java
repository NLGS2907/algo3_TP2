package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Ciudad {

    private String nombre;
    private ArrayList<Edificio> edificios;
    private ArrayList<Ciudad> ciudadesAdyacentes;
    private int contadorVisitas;

    Ciudad(String nombre){
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

    public void visitarEdificio(Detective detective, int numeroEdificio){
        if(this.contadorVisitas < 3){
            this.contadorVisitas++;
        }
        detective.visitarEdificio(edificios.get(numeroEdificio), this.contadorVisitas);
    }

    public Ciudad realizarViaje(Detective detective) {

        // Interfaz de elejir ciudad a la cual viajar
        // Botones de ciudades a las que viajar
        // Boton de volver (No hace nada)

        // Caso donde viaja a una ciudad
            // Obtener la ciudad a la que se queire vajar (destino).
            //Mapa.obtenerInstancia().realizarViaje(this, destino, detective);
            //return destino;

        // Caso donde no se viaja
            return this;
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
