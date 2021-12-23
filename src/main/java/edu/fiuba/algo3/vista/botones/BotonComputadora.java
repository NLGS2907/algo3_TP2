package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.vista.handlers.botones.HandlerComputadora;
import edu.fiuba.algo3.vista.imagenes.botones.ImagenComputadora;
import javafx.scene.control.Button;

public class BotonComputadora extends Button {

    public BotonComputadora() {
        super();
        this.setOnAction(new HandlerComputadora());
        this.setGraphic(new ImagenComputadora());
    }
}
