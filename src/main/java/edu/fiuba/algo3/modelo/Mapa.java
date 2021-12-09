package edu.fiuba.algo3.modelo;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;

public class Mapa {

    private Ciudad ciudadActual;
    private ArrayList<Ciudad> ciudades;
    int[][] adyacencias = {{0, 1, 1, 0, 0},
                            {1, 0, 0, 1, 1},
                            {1, 0, 0, 0, 1},
                            {0, 1, 0, 0, 1},
                            {0, 1, 1, 1, 0}}; // Hardcodeado , leer del Json.
    Mapa(Ciudad ciudad) { // Cambiar tests
        this.ciudadActual = ciudad;
        this.ciudades = new ArrayList<>();
    }

    public void realizarViaje(Ciudad destino, Detective detective) {
        int distancia = this.calcularDistanciaEntre(ciudadActual, destino);
        detective.viajar(distancia);
        this.ciudadActual = destino;
    }

    private int calcularDistancia(Ciudad ciudad){
        return 3725;
    }

    public String ciudadActual() {
        return this.ciudadActual.obtenerNombre();
    }

    public void cargarMapa() {
        try {
            FileReader reader = new FileReader("src/main/java/edu/fiuba/algo3/modelo/config/ciudades.json");
            JSONParser mapParser = new JSONParser();

            JSONObject jsonObject = (JSONObject) mapParser.parse(reader);
            JSONArray ciudadesArray = (JSONArray) jsonObject.get("ciudades");

            ciudadesArray.forEach(item -> {
                //System.out.println(item.toString());
                ciudades.add(new Ciudad(item.toString()));
            });

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Cargar adyacencias.
    }

    void crearRutaDelLadron() {
        // Implementar
    }

    int calcularDistanciaEntre(Ciudad ciudadOrigen, Ciudad ciudadDestino) {
        Integer distancia = 0;

        try {
            FileReader reader = new FileReader("src/main/java/edu/fiuba/algo3/modelo/config/ciudades.json");
            JSONParser mapParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) mapParser.parse(reader);

            JSONObject ciudadesJSON = (JSONObject) jsonObject.get("distanciasCiudades");
            JSONObject ciudadOrigenJSON= (JSONObject) ciudadesJSON.get(ciudadOrigen.obtenerNombre());
            distancia = Integer.parseInt(ciudadOrigenJSON.get(ciudadDestino.obtenerNombre()).toString());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return distancia;
    }
}
