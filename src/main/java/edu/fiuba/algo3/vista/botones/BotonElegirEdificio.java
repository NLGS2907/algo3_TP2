package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.vista.handlers.botones.HandlerElegirEdificio;
import edu.fiuba.algo3.vista.imagenes.botones.ImagenComputadora;
import javafx.scene.control.Button;
import edu.fiuba.algo3.modelo.Edificio;

public class BotonElegirEdificio extends Button {
    public BotonElegirEdificio(Edificio edificio) {
        super(edificio.obtenerTipo());
        this.setOnAction(new HandlerElegirEdificio(edificio));
        this.setGraphic(new ImagenComputadora());
    }
}
