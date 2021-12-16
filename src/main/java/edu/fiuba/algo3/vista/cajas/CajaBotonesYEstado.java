package edu.fiuba.algo3.vista.cajas;

import edu.fiuba.algo3.vista.contenedores.BotonesAcciones;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class CajaBotonesYEstado extends VBox {

    public CajaBotonesYEstado() {
        super(20);
        Label estado = new Label("[ Acá irían los diálogos y otros eventos ]");
        this.getChildren().addAll(estado, new BotonesAcciones());
        this.setPadding(new Insets(20));
    }
}
