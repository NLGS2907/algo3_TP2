package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.excepciones.ExcepcionLadron;

public abstract class EdificioGenerico implements Edificio{

    protected boolean tieneLadron;

    EdificioGenerico(){
        tieneLadron = false;
    }

    protected void encontrarLadron(){
        if(this.tieneLadron){
            throw new ExcepcionLadron();
        }
    }

    public abstract String desplegarPista();

    public boolean estaElLadron(){
        return this.tieneLadron;
    }

    public void establecerLadron(boolean hayLadron){
        this.tieneLadron = hayLadron;
    }
    
}
