package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.pistas.ContenedorDePistas;
import edu.fiuba.algo3.modelo.pistas.LectorDePistas;

public class Main {
    public static void main(String[] args) {
        //App.main(args);
        System.out.print("------- Comienzo PlayGround -------\n");


        LectorDePistas lector = new LectorDePistas("src/main/java/edu/fiuba/algo3/config/pistas.json");


        ContenedorDePistas contenedor = lector.cargarPistas();

        int i = 5;

        System.out.println(contenedor.leerPista("Media", "Montreal", "Biblioteca"));
        //Ciudad ciudad = new Ciudad("Messi");
        //Mapa mapa = new Mapa(ciudad);



        //System.out.println(reader.calcularDistanciaEntre("Montreal", "New York"));
        //System.out.println(reader.calcularDistanciaEntre("Montreal", "Buenos Aires"));
        //System.out.println(reader.calcularDistanciaEntre("Montreal", "Mexico"));

        //System.out.println(reader.calcularDistanciaEntre("Buenos Aires", "Montreal"));







        //mapa.cargarMapa();

        //Ciudad ciudad1 = new Ciudad("Tokyo");
        //Ciudad ciudad2 = new Ciudad("Buenos Aires");

        //System.out.println(mapa.calcularDistanciaEntre(ciudad1, ciudad2));

//        try {
//            FileReader reader = new FileReader("ciudades.json");
//            JSONParser mapParser = new JSONParser();
//            org.json.simple.JSONObject jsonObject = (JSONObject) mapParser.parse(reader);
//
//            org.json.simple.JSONObject ciudadesJSON = (JSONObject) jsonObject.get("distanciasCiudades");
//            org.json.simple.JSONObject nyJSON = (JSONObject) ciudadesJSON.get("New York");
//            System.out.println(nyJSON.get("Rio de Janeiro"));
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }


//        JSONObject lectorDeCiudades = new JSONObject();
//        JSONArray ciudadesArray = lectorDeCiudades.getJSONArray("ciudades");
//        for(int i = 0; i < ciudadesArray.length(); i++){
//            System.out.println(ciudadesArray.getJSONObject(i).toString());
//        }
//        try {
//            FileReader reader = new FileReader("ciudades.json");
//            //JSON parser object to parse read file
//            JSONParser jsonParser = new JSONParser();
//
//            //Read JSON file
//            Object obj = jsonParser.parse(reader);
//
//            JSONArray employeeList = (JSONArray) obj;
//            System.out.println(employeeList);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }


    }
}