package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.vista.escenas.Escena;
import edu.fiuba.algo3.vista.escenas.EscenaPrincipal;
import javafx.scene.Scene;

public class Interfaz {

    private Escena escenaActual;

    public Interfaz() {
        this.escenaActual = new EscenaPrincipal();
    }

    public Scene getEscena() {
        return escenaActual.getEscena();
    }

    public Escena getMenu() {
        return this.escenaActual;
    }

    public void setMenu(Escena nuevaEscena) {
        this.escenaActual = nuevaEscena;
    }
}
