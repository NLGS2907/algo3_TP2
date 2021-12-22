package edu.fiuba.algo3.modelo.edificios;

import edu.fiuba.algo3.modelo.detective.Detective;

public class Aeropuerto extends Edificio {

    public Aeropuerto(){
        super();
    }

    @Override
    protected String desplegarPista(){
        return "El color de la bandera tenia verde, rojo y blanco";
    }
}
