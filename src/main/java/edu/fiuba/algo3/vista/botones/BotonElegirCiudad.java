package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.vista.handlers.botones.HandlerElegirCiudad;
import edu.fiuba.algo3.vista.imagenes.botones.ImagenComputadora;
import javafx.scene.control.Button;
import edu.fiuba.algo3.modelo.Ciudad;

public class BotonElegirCiudad extends Button {
    public BotonElegirCiudad(Ciudad ciudad) {
        super(ciudad.obtenerNombre());
        this.setOnAction(new HandlerElegirCiudad(ciudad));
        this.setGraphic(new ImagenComputadora());
    }
}
