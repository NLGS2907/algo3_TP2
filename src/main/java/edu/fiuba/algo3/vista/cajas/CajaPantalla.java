package edu.fiuba.algo3.vista.cajas;

import javafx.scene.layout.HBox;

public class CajaPantalla extends HBox {

    public CajaPantalla() {
        super(20);
        String lugar = "Cuartel General";
        String tiempo = "Lunes, 8:00 AM";
        this.getChildren().addAll(new CajaLugarYFecha(lugar, tiempo), new CajaBotonesYEstado());
    }
}
