package edu.fiuba.algo3.modelo;

public class Aeropuerto extends EdificioGenerico {

    Aeropuerto(){
        super();
    }

    @Override
    public String desplegarPista(){
        encontrarLadron();
        return "El color de la bandera tenia verde, rojo y blanco";
    }
}
