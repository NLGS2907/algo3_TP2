package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controlador.botones.HandlerVerConexiones;
import edu.fiuba.algo3.vista.imagenes.botones.ImagenVer;
import javafx.scene.control.Button;

public class BotonVerConexiones extends Button {

    public BotonVerConexiones() {
        super();
        this.setOnAction(new HandlerVerConexiones());
        this.setGraphic(new ImagenVer());
    }
}
