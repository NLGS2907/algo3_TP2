package edu.fiuba.algo3.vista.menus;

import edu.fiuba.algo3.vista.cajas.CajaBotonesYEstado;
import edu.fiuba.algo3.vista.cajas.CajaLugarYFecha;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class MenuPrincipal implements Menu {

    public Scene getEscena() {

        StackPane layout = new StackPane(new HBox(20, new CajaLugarYFecha(), new CajaBotonesYEstado()));

        return new Scene(layout);
    }
}
