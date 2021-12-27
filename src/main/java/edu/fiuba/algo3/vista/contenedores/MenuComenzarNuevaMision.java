package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.botones.contextuales.BotonComenzarMision;
import edu.fiuba.algo3.vista.etiquetas.Etiqueta;
import javafx.scene.layout.VBox;

public class MenuComenzarNuevaMision extends VBox {
    public MenuComenzarNuevaMision(String mensaje){
        super(15);
        this.getChildren().add(new Etiqueta(mensaje));
        this.getChildren().add(new BotonComenzarMision());
    }
}
