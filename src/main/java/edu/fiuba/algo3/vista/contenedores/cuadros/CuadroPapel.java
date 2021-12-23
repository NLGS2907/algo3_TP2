package edu.fiuba.algo3.vista.contenedores.cuadros;

import edu.fiuba.algo3.vista.bordes.BordePapel;
import javafx.scene.layout.Border;

public class CuadroPapel extends CuadroPersonalizable {

    public Border getTipoBorde() {
        return new Border(new BordePapel());
    }
}
