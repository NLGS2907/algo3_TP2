package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.bordes.BordeCaja;
import edu.fiuba.algo3.vista.etiquetas.Etiqueta;
import javafx.geometry.Pos;
import javafx.scene.layout.Border;
import javafx.scene.layout.VBox;

public class CajaGenerica extends VBox {

    public CajaGenerica() {
        this(Pos.TOP_CENTER);
    }

    public CajaGenerica(Pos alineacion) {
        super(0);
        this.setAlignment(alineacion);
        this.setBorder(new Border(new BordeCaja()));
    }

    public void agregarEtiqueta(Etiqueta etiqueta) {
        this.getChildren().add(etiqueta);
    }

    public void agregarEtiquetas(Etiqueta... etiquetas) {
        this.getChildren().addAll(etiquetas);
    }
}
