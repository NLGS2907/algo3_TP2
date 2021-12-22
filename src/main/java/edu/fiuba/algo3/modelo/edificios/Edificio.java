package edu.fiuba.algo3.modelo.edificios;

import edu.fiuba.algo3.modelo.Ladron;
import edu.fiuba.algo3.modelo.NoLadron;
import edu.fiuba.algo3.modelo.Sospechoso;
import edu.fiuba.algo3.modelo.detective.Detective;

public abstract class Edificio {

    protected Ladron ladron;

    Edificio(){
        this.ladron = new NoLadron();
    }

    public Boolean encontrarLadron(){
        return this.ladron.getClass() == Sospechoso.class;
    }

    public void establecerLadron(Ladron ladron){
        this.ladron = ladron;
    }





    public String visitar(Detective detective){
        this.ladron.encontrar(detective);

        return this.desplegarPista();
    }

    protected abstract String desplegarPista();

}
