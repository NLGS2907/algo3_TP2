package edu.fiuba.algo3.modelo.edificios;

import edu.fiuba.algo3.modelo.detective.Detective;

public class Biblioteca extends Edificio {

    public Biblioteca(){
        super();
    }

    @Override
    protected String desplegarPista(){
        return "Estuvo buscando informacion sobre los Mayas";
    }
}
