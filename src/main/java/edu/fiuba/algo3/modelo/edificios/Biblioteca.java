package edu.fiuba.algo3.modelo.edificios;

public class Biblioteca extends Edificio {

    public Biblioteca(){
        super();
    }

    @Override
    public String desplegarPista(){
        encontrarLadron();
        return "Estuvo buscando informacion sobre los Mayas";
    }
}
