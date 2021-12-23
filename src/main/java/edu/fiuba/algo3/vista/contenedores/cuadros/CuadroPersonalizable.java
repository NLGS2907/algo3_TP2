package edu.fiuba.algo3.vista.contenedores.cuadros;

import edu.fiuba.algo3.vista.etiquetas.Etiqueta;
import javafx.geometry.Pos;
import javafx.scene.layout.Border;
import javafx.scene.layout.VBox;

public abstract class CuadroPersonalizable extends VBox {

    public abstract Border getTipoBorde();

    public CuadroPersonalizable() {
        super(0);
        this.setBorder(this.getTipoBorde());
    }

    public void agregarEtiqueta(Etiqueta etiqueta) {
        this.getChildren().add(etiqueta);
    }

    public void agregarEtiquetas(Etiqueta... etiquetas) {
        this.getChildren().addAll(etiquetas);
    }
}
