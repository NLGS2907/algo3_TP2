package edu.fiuba.algo3.modelo.pistas;

import java.util.Map;

public class ContenedorDePistas {

    private Map<String, PistasDeCiudad> pistas;

    public ContenedorDePistas(Map<String, PistasDeCiudad> pistas) {
        this.pistas = pistas;
    }

    public String leerPista(String dificultad, String ciudad, String tipoDeEdificio) {
        return pistas.get(dificultad).leerPista(ciudad, tipoDeEdificio);
    }
}
