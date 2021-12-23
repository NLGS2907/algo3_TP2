package edu.fiuba.algo3.vista.menus;

import edu.fiuba.algo3.vista.menus.about.MenuAcercaDe;
import javafx.scene.control.MenuBar;

public class BarraMenus extends MenuBar {

    public BarraMenus() {
        super();
        this.getMenus().addAll(new MenuAcercaDe());
    }
}
