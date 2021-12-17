package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.excepciones.ExcepcionLadron;

public abstract class Edificio {

    protected boolean tieneLadron;

    Edificio(){
        tieneLadron = false;
    }

    public Boolean encontrarLadron(){
        return this.tieneLadron;
    }

    public abstract String desplegarPista();

    public void establecerLadron(boolean hayLadron){
        this.tieneLadron = hayLadron;
    }
    
}
