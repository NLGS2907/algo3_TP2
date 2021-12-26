package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controlador.botones.HandlerComenzarMision;
import javafx.scene.control.Button;

public class BotonComenzarMision extends Button {
    public BotonComenzarMision(){
        super("Comenzar nueva mision");
        this.setOnAction(new HandlerComenzarMision());
    }
}
