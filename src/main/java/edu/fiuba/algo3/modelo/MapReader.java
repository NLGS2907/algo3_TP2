package edu.fiuba.algo3.modelo;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapReader {

    final private String filePath;

    MapReader(String filePath) {
        this.filePath = filePath;
    }

    Map<String, Map<String, Integer>> cargarDistancias() {
        final Map<String, Map<String, Integer>> distancias = new HashMap<>();
        try {
            FileReader reader = new FileReader(this.filePath);
            JSONParser mapParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) mapParser.parse(reader);

            JSONObject ciudadesOrigenJSON = (JSONObject) jsonObject.get("distanciasCiudades");

            ciudadesOrigenJSON.keySet().forEach(ciudadOrigen -> {
                JSONObject ciudadDestinoJSON = (JSONObject) ciudadesOrigenJSON.get(ciudadOrigen);

                Map<String, Integer> ciudadMap = new HashMap<>();
                ciudadDestinoJSON.keySet().forEach(ciudadDestino -> {
                    ciudadMap.put(ciudadDestino.toString(), Integer.parseInt(ciudadDestinoJSON.get(ciudadDestino).toString()));
                });
                distancias.put(ciudadOrigen.toString(), ciudadMap);
            });
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return distancias;
    }

    ArrayList<Ciudad> cargarCiudades() {
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        try {
            FileReader reader = new FileReader(this.filePath);
            JSONParser mapParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) mapParser.parse(reader);

            JSONObject ciudadesOrigenJSON = (JSONObject) jsonObject.get("distanciasCiudades");

            ciudadesOrigenJSON.keySet().forEach(ciudadOrigen -> {
                Ciudad origen = new Ciudad(ciudadOrigen.toString());
                ciudades.add(origen);
            });

            for (Ciudad origen : ciudades) {
                JSONObject ciudadOrigenJSON = (JSONObject) ciudadesOrigenJSON.get(origen.obtenerNombre());
                for (Ciudad destino : ciudades) {
                    if (ciudadOrigenJSON.get(destino.obtenerNombre()) != null) {
                        origen.agregarRutaDeVuelo(destino);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return ciudades;
    }
}