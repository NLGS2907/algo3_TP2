package edu.fiuba.algo3.vista.cajas;

import edu.fiuba.algo3.modelo.Reloj;
import edu.fiuba.algo3.vista.contenedores.LocacionYFecha;
import edu.fiuba.algo3.vista.imagenes.ImagenTeclado;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

public class CajaLugarYFecha extends VBox {

    public CajaLugarYFecha() {
        super(30);
        String lugar = "Cuartel General";
        String tiempo = new Reloj().obtenerFecha().toString();
        this.getChildren().addAll(new LocacionYFecha(lugar, tiempo), new ImagenTeclado());
        this.setPadding(new Insets(20));
        this.setAlignment(Pos.CENTER_LEFT);
    }
}
