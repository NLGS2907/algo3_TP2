package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.vista.botones.contextuales.BotonComenzarMision;
import edu.fiuba.algo3.vista.etiquetas.Etiqueta;
import javafx.scene.layout.VBox;

public class MenuComenzarNuevaMision extends VBox {
    public MenuComenzarNuevaMision(String mensaje){
        super(15);
        String rango = Juego.obtenerInstancia().obtenerDetective().rango();
        int arrestos = Juego.obtenerInstancia().obtenerDetective().obtenerContador();
        String informeDeProgreso = "Tu rango es " + rango + " y tienes " + arrestos + " arrestos registrados.";
        this.getChildren().add(new Etiqueta(mensaje));
        this.getChildren().add(new Etiqueta(informeDeProgreso));

        this.getChildren().add(new BotonComenzarMision());
    }
}
