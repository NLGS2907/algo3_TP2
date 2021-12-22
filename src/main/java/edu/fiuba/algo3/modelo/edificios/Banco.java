package edu.fiuba.algo3.modelo.edificios;

import edu.fiuba.algo3.modelo.detective.Detective;

public class Banco extends Edificio {

    public Banco(){
        super();
    }

    @Override
    protected String desplegarPista(){
        return "Cambio dolares por pesos mexicanos";
    }
}
