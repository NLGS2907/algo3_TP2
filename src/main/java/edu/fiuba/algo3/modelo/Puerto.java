package edu.fiuba.algo3.modelo;

public class Puerto extends Edificio {

    Puerto(){
        super();
    }

    @Override
    public String desplegarPista(){
        encontrarLadron();
        return "Se lo vio en un barco con bandera de color verde, blanca y roja";
    }
}
