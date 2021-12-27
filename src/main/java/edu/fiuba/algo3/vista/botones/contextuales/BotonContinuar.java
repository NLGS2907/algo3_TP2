package edu.fiuba.algo3.vista.botones.contextuales;

import javafx.scene.control.Button;
import edu.fiuba.algo3.controlador.botones.contextuales.HandlerContinuar;

public class BotonContinuar extends Button{
    public BotonContinuar(){
        super("Continuar");
        this.setOnAction(new HandlerContinuar());
    }
}
