package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.animaciones.AnimacionTexto;
import edu.fiuba.algo3.vista.contenedores.cuadros.CuadroPapel;
import edu.fiuba.algo3.vista.imagenes.ImagenTecladoVacio;
import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundSize;

public class MaquinaDeEscribir extends CuadroPapel {

    public MaquinaDeEscribir() {
        this.agregarEtiqueta(new AnimacionTexto("Novato, ingrese su nombre:\n", 10).getEtiqueta());
        this.setAlignment(Pos.BOTTOM_CENTER);
        BackgroundSize tamanioFondo = new BackgroundSize(500, 500, false, false, false, false);
        BackgroundImage imagenFondo = new BackgroundImage(new ImagenTecladoVacio(),
                null, null, BackgroundPosition.CENTER, tamanioFondo);
        this.setBackground(new Background(imagenFondo));
    }
}
