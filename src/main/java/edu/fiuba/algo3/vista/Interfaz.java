package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.vista.escenas.Escena;
import edu.fiuba.algo3.vista.escenas.EscenaInicial;
import javafx.scene.Scene;

public class Interfaz {

    private Escena escenaActual;

    public Interfaz() {
        this.escenaActual = new EscenaInicial();
    }

    public Scene getEscena() {
        return escenaActual.getEscena();
    }

    public void setEscena(Escena nuevaEscena) {
        this.escenaActual = nuevaEscena;
    }
}
