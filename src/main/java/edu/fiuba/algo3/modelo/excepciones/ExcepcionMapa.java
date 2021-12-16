package edu.fiuba.algo3.modelo.excepciones;

public class ExcepcionMapa extends RuntimeException {

    public ExcepcionMapa(){
        super("Viaje no existente\n");
    }
}
