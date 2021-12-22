package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.excepciones.ExcepcionMapa;
import edu.fiuba.algo3.modelo.detective.Detective;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class Mapa {

    private static Mapa instancia = null;

    private ArrayList<Ciudad> ciudades;
    private Map<String, Map<String, Integer>> distancias;
    private Map<String,ArrayList<String>> adyacencias;

    private Mapa() {
        MapReader mapReader = new MapReader("src/main/java/edu/fiuba/algo3/config/ciudades.json");
        this.distancias = mapReader.cargarDistancias();
        this.ciudades = mapReader.cargarCiudades();
        this.adyacencias = mapReader.cargarAdyacencias();
    }

    private static void crearMapa() {
        if (instancia == null) {
            instancia = new Mapa();
        }
    }

    public static Mapa obtenerInstancia() {
        if (instancia == null) {
            crearMapa();
        }
        return instancia;
    }

    public void realizarViaje(Ciudad origen, Ciudad destino, Detective detective) {
        int distancia = this.calcularDistanciaEntre(origen, destino);
        detective.viajar(distancia);
    }

    public Ciudad crearRutaDelLadron(int longitud) {
        for (Ciudad ciudad : ciudades) {
            ciudad.establecerRutaDelLadron("Default");
        }

        Ciudad ciudadSiguiente = this.obtenerCiudadRandom();
        ciudadSiguiente.establecerRutaDelLadron("Final");
        Ciudad ciudadactual = null;

        for (int i = 0; i < longitud; i++) {
            ciudadactual = obtenerCiudadRandom();
            ciudadactual.establecerRutaDelLadron(ciudadSiguiente.obtenerNombre());
            ciudadSiguiente = ciudadactual;
        }

        return ciudadactual;
    }

    private Ciudad obtenerCiudadRandom() {
        Random random = new Random(System.nanoTime());
        Ciudad ciudadRandom = ciudades.get(random.nextInt(ciudades.size()));

        while (!ciudadRandom.obtenerRutaDelLadron().equals("Default")) {
            ciudadRandom = ciudades.get(random.nextInt(ciudades.size()));
        }
        return ciudadRandom;
    }

    int calcularDistanciaEntre(Ciudad ciudadOrigen, Ciudad ciudadDestino) throws ExcepcionMapa {
        if (distancias.get(ciudadOrigen.obtenerNombre()).get(ciudadDestino.obtenerNombre()) == null) {
            throw new ExcepcionMapa("Ruta inexistente");
        }
        return distancias.get(ciudadOrigen.obtenerNombre()).get(ciudadDestino.obtenerNombre());
    }

    public int calcularDistanciaEntre(String ciudadOrigen, String ciudadDestino) {
        if (distancias.get(ciudadOrigen).get(ciudadDestino) == null) {
            throw new ExcepcionMapa("Ruta inexistente");
        }
        return distancias.get(ciudadOrigen).get(ciudadDestino);
    }

    ////// TEST //////
    public Ciudad obtenerCiudad(String nombre) {
        Ciudad ciudadBuscada = null;
        for (Ciudad ciudad : ciudades) {
            if (ciudad.obtenerNombre().equals(nombre)) {
                ciudadBuscada = ciudad;
            }
        }
        return ciudadBuscada;
    }
}
