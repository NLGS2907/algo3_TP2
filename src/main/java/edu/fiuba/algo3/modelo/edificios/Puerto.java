package edu.fiuba.algo3.modelo.edificios;

import edu.fiuba.algo3.modelo.detective.Detective;

public class Puerto extends Edificio {

    public Puerto(){
        super();
    }

    @Override
    protected String desplegarPista(){
        return "Se lo vio en un barco con bandera de color verde, blanca y roja";
    }
}
