package edu.fiuba.algo3.vista.cajas;

import edu.fiuba.algo3.vista.contenedores.BotonesAcciones;
import edu.fiuba.algo3.vista.contenedores.CuadroDialogo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

public class CajaBotonesYDialogo extends VBox {

    public CajaBotonesYDialogo() {
        super(5);
        this.getChildren().addAll(new CuadroDialogo("Hola, soy una pruebaHola, soy una pruebaHola, soy una pruebaHola, soy una prueba\nHola, soy una pruebaHola, soy una pruebaHola, soy una pruebaHola, soy una pruebaHola, soy una pruebaHola, soy una prueba\nHola, soy una prueba\nHola, soy una prueba\nHola, soy una prueba\nHola, soy una prueba\nHola, soy una prueba\nHola, soy una prueba\nHola, soy una prueba\nHola, soy una prueba\nHola, soy una prueba\nHola, soy una prueba\nHola, soy una prueba\nHola, soy una prueba\nHola, soy una prueba\nHola, soy una prueba\nHola, soy una prueba"), new BotonesAcciones());
        this.setPadding(new Insets(1.5));
        this.setAlignment(Pos.CENTER_RIGHT);
    }
}
