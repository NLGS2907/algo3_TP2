package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.vista.handlers.HandlerComputadora;
import javafx.scene.control.Button;

public class BotonComputadora extends Button {

    public BotonComputadora() {
        super("COMPUTADORA");
        this.setOnAction(new HandlerComputadora());
    }
}
