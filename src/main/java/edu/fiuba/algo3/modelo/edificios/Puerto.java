package edu.fiuba.algo3.modelo.edificios;

public class Puerto extends Edificio {

    public Puerto(){
        super();
    }

    @Override
    public String desplegarPista(){
        encontrarLadron();
        return "Se lo vio en un barco con bandera de color verde, blanca y roja";
    }
}
