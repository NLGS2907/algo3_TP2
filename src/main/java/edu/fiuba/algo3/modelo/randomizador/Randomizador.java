package edu.fiuba.algo3.modelo.randomizador;

import java.util.Random;

public abstract class Randomizador {

    protected Random random;

    public Randomizador() {
        random = new Random(System.nanoTime());
    }
    public abstract String generarDificultad();
}
