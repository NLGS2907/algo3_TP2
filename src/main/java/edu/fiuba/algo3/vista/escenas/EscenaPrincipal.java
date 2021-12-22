package edu.fiuba.algo3.vista.escenas;

import edu.fiuba.algo3.vista.cajas.CajaGeneral;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

public class EscenaPrincipal implements Escena {

    public Scene getEscena() {
        StackPane layout = new StackPane(new CajaGeneral());
        return new Scene(layout);
    }
}
