package edu.fiuba.algo3.vista.bordes;

import javafx.scene.image.Image;
import javafx.scene.layout.BorderImage;
import javafx.scene.layout.BorderWidths;

public class BordeCaja extends BorderImage {

    public BordeCaja() {
        super(new Image("file:media/img/pantallaNegra.png"),
                new BorderWidths(10),
                null,
                new BorderWidths(10),
                true,
                null, null);
    }
}