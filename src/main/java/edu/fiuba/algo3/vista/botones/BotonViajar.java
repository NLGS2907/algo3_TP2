package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.vista.handlers.botones.HandlerViajar;
import javafx.scene.control.Button;

public class BotonViajar extends Button {

    public BotonViajar() {
        super("VIAJAR");
        this.setOnAction(new HandlerViajar());
    }
}
