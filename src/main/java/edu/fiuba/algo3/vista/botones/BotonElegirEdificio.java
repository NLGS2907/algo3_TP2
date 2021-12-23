package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controlador.botones.HandlerElegirEdificio;
import javafx.scene.control.Button;
import edu.fiuba.algo3.modelo.Edificio;

public class BotonElegirEdificio extends Button {
    public BotonElegirEdificio(Edificio edificio) {
        super(edificio.obtenerTipo());
        this.setOnAction(new HandlerElegirEdificio(edificio));
    }
}
