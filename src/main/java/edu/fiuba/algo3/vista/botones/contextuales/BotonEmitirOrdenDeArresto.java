package edu.fiuba.algo3.vista.botones.contextuales;

import edu.fiuba.algo3.controlador.botones.contextuales.HandlerOrdenDeArresto;
import edu.fiuba.algo3.vista.imagenes.botones.ImagenInvestigar;
import javafx.scene.control.Button;

public class BotonEmitirOrdenDeArresto extends Button {
    public BotonEmitirOrdenDeArresto() {
        super();
        this.setOnAction(new HandlerOrdenDeArresto());
        this.setGraphic(new ImagenInvestigar());
    }
}
