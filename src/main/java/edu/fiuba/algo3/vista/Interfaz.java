package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.vista.menus.Menu;
import edu.fiuba.algo3.vista.menus.MenuPrincipal;
import javafx.scene.Scene;

public class Interfaz {

    private Menu menuActual;

    public Interfaz() {
        this.menuActual = new MenuPrincipal();
    }

    public Scene getEscena() {
        return menuActual.getEscena();
    }

    public Menu getMenu() {
        return this.menuActual;
    }

    public void setMenu(Menu nuevoMenu) {
        this.menuActual = nuevoMenu;
    }
}
