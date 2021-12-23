package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.computadora.Computadora;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LectorDeTesoros {

    private String filePath;

    LectorDeTesoros(String filePath) {
        this.filePath = filePath;
    }

    public void cargarTesoros(Computadora computadora) {
        Map<String, String> tesoros = new HashMap<>();
        try {
            FileReader reader = new FileReader(this.filePath);
            JSONParser mapParser = new JSONParser();
            JSONArray tesorosArray = (JSONArray) mapParser.parse(reader);

            tesorosArray.forEach(element -> {
                JSONObject tesoro = (JSONObject) element;
            });

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
