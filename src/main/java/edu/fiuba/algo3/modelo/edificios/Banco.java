package edu.fiuba.algo3.modelo.edificios;

public class Banco extends Edificio {

    public Banco(){
        super();
    }

    @Override
    public String desplegarPista() {
        encontrarLadron();
        return "Cambio dolares por pesos mexicanos";
    }
}
