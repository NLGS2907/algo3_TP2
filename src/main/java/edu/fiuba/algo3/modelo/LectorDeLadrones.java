package edu.fiuba.algo3.modelo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class LectorDeLadrones {

    final private String filePath;

    LectorDeLadrones (String filePath) {
        this.filePath = filePath;
    }

    void cargarLadrones(Computadora computadora) {
        try {
            FileReader reader = new FileReader(this.filePath);
            JSONParser mapParser = new JSONParser();
            JSONArray ladronesArray = (JSONArray) mapParser.parse(reader);

            ladronesArray.forEach(element -> {
                JSONObject ladron = (JSONObject) element;

                // Cargar computadora con "element"
                //System.out.println(ladron.get("Hair"));
                //System.out.println(element);
            });

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
