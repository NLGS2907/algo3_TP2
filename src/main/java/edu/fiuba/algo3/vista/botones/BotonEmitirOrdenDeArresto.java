package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controlador.botones.HandlerComputadora;
import edu.fiuba.algo3.controlador.botones.HandlerOrdenDeArresto;
import edu.fiuba.algo3.vista.imagenes.botones.ImagenComputadora;
import edu.fiuba.algo3.vista.imagenes.botones.ImagenInvestigar;
import javafx.scene.control.Button;

public class BotonEmitirOrdenDeArresto extends Button {
    public BotonEmitirOrdenDeArresto() {
        super();
        this.setOnAction(new HandlerOrdenDeArresto());
        this.setGraphic(new ImagenInvestigar());
    }
}
