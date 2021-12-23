package edu.fiuba.algo3.vista.bordes;

import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderImage;
import javafx.scene.layout.BorderRepeat;
import javafx.scene.layout.BorderWidths;

public class BordePapel extends BorderImage {

    public BordePapel() {
        super(new Image("file:media/img/segmentoPapel.png"),
                null,
                new Insets(10),
                new BorderWidths(1, 1, 0, 0),
                true,
                null, BorderRepeat.REPEAT);
    }
}
