package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.vista.handlers.botones.HandlerInvestigar;
import edu.fiuba.algo3.vista.imagenes.botones.ImagenInvestigar;
import javafx.scene.control.Button;

public class BotonInvestigar extends Button {

    public BotonInvestigar() {
        super();
        this.setOnAction(new HandlerInvestigar());
        this.setGraphic(new ImagenInvestigar());
    }
}
