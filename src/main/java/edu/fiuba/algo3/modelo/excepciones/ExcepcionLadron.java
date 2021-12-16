package edu.fiuba.algo3.modelo.excepciones;

public class ExcepcionLadron extends RuntimeException{

    public ExcepcionLadron(){
        super("El Ladron está en el Edificio");
    }
}
