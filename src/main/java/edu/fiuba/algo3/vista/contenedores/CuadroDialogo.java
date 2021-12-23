package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.animaciones.AnimacionTexto;
import edu.fiuba.algo3.vista.contenedores.cuadros.CuadroNegro;
import javafx.geometry.Pos;

public class CuadroDialogo extends CuadroNegro {

    public CuadroDialogo(String mensaje) {
        this.agregarEtiqueta(new AnimacionTexto(mensaje, 12).getEtiqueta());
        this.setAlignment(Pos.TOP_LEFT);
        this.setPrefSize(400, 350);
    }
}
