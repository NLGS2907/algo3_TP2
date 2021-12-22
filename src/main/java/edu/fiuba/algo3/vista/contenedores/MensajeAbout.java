package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.animaciones.AnimacionTexto;
import edu.fiuba.algo3.vista.etiquetas.Etiqueta;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class MensajeAbout extends CajaGenerica {

    public MensajeAbout(String mensajeAMostrar) {
        this(mensajeAMostrar, 12);
    }

    public MensajeAbout(String mensajeAMostrar, int tamanoFuente) {
        super(Pos.TOP_LEFT);
        Etiqueta mensajeAbout = new AnimacionTexto(mensajeAMostrar, tamanoFuente).getEtiqueta();
        this.agregarEtiqueta(mensajeAbout);
        this.setPadding(new Insets(15));
    }
}
