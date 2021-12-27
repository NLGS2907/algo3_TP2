package edu.fiuba.algo3.vista.botones.contextuales;

import edu.fiuba.algo3.controlador.botones.contextuales.HandlerComenzarMision;
import javafx.scene.control.Button;

public class BotonComenzarMision extends Button {
    public BotonComenzarMision(){
        super("Comenzar nueva mision");
        this.setOnAction(new HandlerComenzarMision());
    }
}
