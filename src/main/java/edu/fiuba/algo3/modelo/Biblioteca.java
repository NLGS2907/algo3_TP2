package edu.fiuba.algo3.modelo;

public class Biblioteca extends Edificio {

    Biblioteca(){
        super();
    }

    @Override
    public String desplegarPista(){
        encontrarLadron();
        return "Estuvo buscando informacion sobre los Mayas";
    }
}
