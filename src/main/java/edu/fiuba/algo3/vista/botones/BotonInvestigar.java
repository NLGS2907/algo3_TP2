package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.vista.handlers.HandlerInvestigar;
import javafx.scene.control.Button;

public class BotonInvestigar extends Button {

    public BotonInvestigar() {
        super("INVESTIGAR");
        this.setOnAction(new HandlerInvestigar());
    }
}
