package edu.fiuba.algo3.modelo;

public class Banco extends EdificioGenerico {

    Banco(){
        super();
    }

    @Override
    public String desplegarPista() {
        encontrarLadron();
        return "Cambio dolares por pesos mexicanos";
    }
}
