package edu.fiuba.algo3.modelo;

public class Banco extends Edificio {

    Banco(){
        super();
    }

    @Override
    public String desplegarPista() {
        encontrarLadron();
        return "Cambio dolares por pesos mexicanos";
    }
}
