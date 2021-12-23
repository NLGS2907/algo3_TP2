package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.animaciones.AnimacionTexto;
import edu.fiuba.algo3.vista.contenedores.cuadros.CuadroNegro;
import edu.fiuba.algo3.vista.etiquetas.Etiqueta;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class MensajeAbout extends CuadroNegro {

    public MensajeAbout(String mensajeAMostrar) {
        this(mensajeAMostrar, 12);
    }

    public MensajeAbout(String mensajeAMostrar, int tamanoFuente) {
        super();
        Etiqueta mensajeAbout = new AnimacionTexto(mensajeAMostrar, tamanoFuente).getEtiqueta();
        this.agregar(mensajeAbout);
        this.setAlignment(Pos.TOP_LEFT);
        this.setPadding(new Insets(15));
    }
}
