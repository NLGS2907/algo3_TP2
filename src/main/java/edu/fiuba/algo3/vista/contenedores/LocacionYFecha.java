package edu.fiuba.algo3.vista.contenedores;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class LocacionYFecha extends VBox {

    public LocacionYFecha(String nombreLugar, String descripcionTiempo) {
        super(1);
        Label lugar = new Label(nombreLugar);
        Label tiempo = new Label(descripcionTiempo);
        this.getChildren().addAll(lugar, tiempo);
    }
}
