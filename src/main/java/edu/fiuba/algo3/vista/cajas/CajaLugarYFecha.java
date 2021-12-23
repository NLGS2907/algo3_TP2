package edu.fiuba.algo3.vista.cajas;

import edu.fiuba.algo3.vista.contenedores.LocacionYFecha;
import edu.fiuba.algo3.vista.imagenes.ImagenTeclado;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

public class CajaLugarYFecha extends VBox {

    public CajaLugarYFecha(String lugar, String tiempo) {
        super(5);
        this.getChildren().addAll(new LocacionYFecha(lugar, tiempo), new ImagenTeclado());
        this.setPadding(new Insets(1.5));
        this.setAlignment(Pos.CENTER_LEFT);
    }
}
