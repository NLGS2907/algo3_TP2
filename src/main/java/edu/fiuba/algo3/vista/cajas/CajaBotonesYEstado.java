package edu.fiuba.algo3.vista.cajas;

import edu.fiuba.algo3.vista.contenedores.BotonesAcciones;
import edu.fiuba.algo3.vista.imagenes.PantallaEnNegro;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

public class CajaBotonesYEstado extends VBox {

    public CajaBotonesYEstado() {
        super(20);
        this.getChildren().addAll(new PantallaEnNegro(), new BotonesAcciones());
        this.setPadding(new Insets(20));
        this.setAlignment(Pos.CENTER_RIGHT);
    }
}
