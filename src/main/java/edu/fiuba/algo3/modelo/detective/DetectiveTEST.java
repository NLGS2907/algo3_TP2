package edu.fiuba.algo3.modelo.detective;

import edu.fiuba.algo3.modelo.ladron.Ladron;
import edu.fiuba.algo3.modelo.reloj.RelojTEST;

public class DetectiveTEST extends DetectiveNovato {
    public DetectiveTEST(){
        super();
        this.reloj = new RelojTEST();
    }

    @Override
    public Detective arrestarladron(Ladron ladron) {
        if (this.ordenDeArresto.esPara(ladron)) {
            this.incrementarArresto();
        }
        return this;
    }

}
