package edu.fiuba.algo3.vista.cajas;

import edu.fiuba.algo3.modelo.Reloj;
import edu.fiuba.algo3.vista.contenedores.LocacionYFecha;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class CajaLugarYFecha extends VBox {

    public CajaLugarYFecha() {
        super(20);
        String lugar = "Cuartel General";
        String tiempo = new Reloj().obtenerFecha().toString();
        Label escenaLugar = new Label("[ Acá iría una imagen del lugar ]");
        this.getChildren().addAll(new LocacionYFecha(lugar, tiempo), escenaLugar);
        this.setPadding(new Insets(20));
    }
}
