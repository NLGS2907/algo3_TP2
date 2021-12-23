package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controlador.botones.HandlerViajar;
import edu.fiuba.algo3.vista.imagenes.botones.ImagenViajar;
import javafx.scene.control.Button;

public class BotonViajar extends Button {

    public BotonViajar() {
        super();
        this.setOnAction(new HandlerViajar());
        this.setGraphic(new ImagenViajar());
    }
}
