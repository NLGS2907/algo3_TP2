package edu.fiuba.algo3.vista.botones.acciones;

import edu.fiuba.algo3.controlador.botones.acciones.HandlerComputadora;
import edu.fiuba.algo3.vista.botones.BotonBlanco;
import edu.fiuba.algo3.vista.imagenes.botones.ImagenComputadora;

public class BotonComputadora extends BotonBlanco {

    public BotonComputadora() {
        super();
        this.setOnAction(new HandlerComputadora());
        this.setGraphic(new ImagenComputadora());
    }
}
