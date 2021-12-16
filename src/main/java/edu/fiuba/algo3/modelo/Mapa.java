package edu.fiuba.algo3.modelo;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class Mapa {

    private Ciudad ciudadActual;
    private ArrayList<Ciudad> ciudades;
    private Map<String, Map<String, Integer>> distancias;

    Mapa(Ciudad ciudad) { // Cambiar tests
        this.ciudadActual = ciudad; // Cambiar

        MapReader mapReader = new MapReader("src/main/java/edu/fiuba/algo3/config/ciudades.json");
        this.distancias = mapReader.cargarDistancias();
        this.ciudades = mapReader.cargarCiudades();
    }

    public void realizarViaje(Ciudad destino, Detective detective) {
        int distancia = this.calcularDistanciaEntre(ciudadActual, destino);
        detective.viajar(distancia);
        this.ciudadActual = destino;
    }

    public void cargarMapa() {}
    private int calcularDistancia(Ciudad ciudad){
        return 3725;
    }

    public String ciudadActual() {
        return this.ciudadActual.obtenerNombre();
    }

    void crearRutaDelLadron() {
        // Implementar
    }

    int calcularDistanciaEntre(Ciudad ciudadOrigen, Ciudad ciudadDestino) {
        return distancias.get(ciudadOrigen.obtenerNombre()).get(ciudadDestino.obtenerNombre());
    }

    int calcularDistanciaEntre(String ciudadOrigen, String ciudadDestino) {
        return distancias.get(ciudadOrigen).get(ciudadDestino);
    }
}
