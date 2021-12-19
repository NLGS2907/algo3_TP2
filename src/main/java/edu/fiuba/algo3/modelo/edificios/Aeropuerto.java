package edu.fiuba.algo3.modelo.edificios;

public class Aeropuerto extends Edificio {

    public Aeropuerto(){
        super();
    }

    @Override
    public String desplegarPista(){
        encontrarLadron();
        return "El color de la bandera tenia verde, rojo y blanco";
    }
}
