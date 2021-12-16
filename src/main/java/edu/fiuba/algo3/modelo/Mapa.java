package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Map;

public class Mapa {

    private static Mapa instancia = null;

    private ArrayList<Ciudad> ciudades;
    private Map<String, Map<String, Integer>> distancias;

    private Mapa() {
        MapReader mapReader = new MapReader("src/main/java/edu/fiuba/algo3/config/ciudades.json");
        this.distancias = mapReader.cargarDistancias();
        this.ciudades = mapReader.cargarCiudades();
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

    //void crearRutaDelLadron() {
    //    // Implementar
    //}

    //Ciudad ciudadInicial() {
    //    return ciudades.get(0); // Cambiar
    //}

    int calcularDistanciaEntre(Ciudad ciudadOrigen, Ciudad ciudadDestino) {
        return distancias.get(ciudadOrigen.obtenerNombre()).get(ciudadDestino.obtenerNombre());
    }

    int calcularDistanciaEntre(String ciudadOrigen, String ciudadDestino) {
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
