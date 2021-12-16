package edu.fiuba.algo3.vista.menus;

import edu.fiuba.algo3.modelo.Reloj;
import edu.fiuba.algo3.vista.cajas.CajaBotonesYEstado;
import edu.fiuba.algo3.vista.cajas.CajaLugarYFecha;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class MenuPrincipal implements Menu {

    public Scene getEscena() {

        String lugar = "Cuartel General";
        String tiempo = new Reloj().obtenerFecha().toString();
        StackPane layout = new StackPane(new HBox(20, new CajaLugarYFecha(lugar, tiempo), new CajaBotonesYEstado()));

        return new Scene(layout);
    }
}
