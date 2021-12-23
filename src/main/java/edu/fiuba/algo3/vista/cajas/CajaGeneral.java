package edu.fiuba.algo3.vista.cajas;

import edu.fiuba.algo3.vista.menus.BarraMenus;
import javafx.scene.layout.VBox;

public class CajaGeneral extends VBox {

    public CajaGeneral() {
        super();
        this.getChildren().addAll(new BarraMenus(), new CajaPantalla());
    }
}
