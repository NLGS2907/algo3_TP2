package edu.fiuba.algo3.modelo.edificios;

import edu.fiuba.algo3.modelo.excepciones.ExcepcionLadron;

public abstract class Edificio {

    protected boolean tieneLadron;

    Edificio(){
        tieneLadron = false;
    }

    protected void encontrarLadron(){
        if(this.tieneLadron){
            throw new ExcepcionLadron();
        }
    }

    public abstract String desplegarPista();

    public void establecerLadron(boolean hayLadron){
        this.tieneLadron = hayLadron;
    }
    
}
