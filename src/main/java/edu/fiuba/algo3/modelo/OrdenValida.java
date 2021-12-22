package edu.fiuba.algo3.modelo;

public class OrdenValida implements OrdenDeArresto {

    private Ladron ladron;

    public OrdenValida(Ladron ladron){
        this.ladron = ladron;
    }

    public boolean esPara(Ladron ladron){
        return this.ladron.esIgualA(ladron);
    }
}
