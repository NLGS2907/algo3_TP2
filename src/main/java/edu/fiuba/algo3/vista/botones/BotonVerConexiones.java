package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.vista.handlers.botones.HandlerVerConexiones;
import javafx.scene.control.Button;

public class BotonVerConexiones extends Button {

    public BotonVerConexiones() {
        super("VER");
        this.setOnAction(new HandlerVerConexiones());
    }
}
