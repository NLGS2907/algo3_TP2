package edu.fiuba.algo3.vista.contenedores.cuadros;

import edu.fiuba.algo3.vista.etiquetas.Etiqueta;
import edu.fiuba.algo3.vista.botones.contextuales.BotonContinuar;
import javafx.scene.layout.VBox;

public class MenuHerida extends VBox{
    public MenuHerida(String mensaje){
        super(18);
        this.getChildren().add(new Etiqueta(mensaje));
        this.getChildren().add(new BotonContinuar());
    }
}
