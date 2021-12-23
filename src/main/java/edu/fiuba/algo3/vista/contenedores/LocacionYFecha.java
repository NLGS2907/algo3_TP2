package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.animaciones.AnimacionTexto;
import edu.fiuba.algo3.vista.contenedores.cuadros.CuadroNegro;
import edu.fiuba.algo3.vista.etiquetas.Etiqueta;
import javafx.geometry.Pos;

public class LocacionYFecha extends CuadroNegro {

    public LocacionYFecha(String nombreLugar, String descripcionTiempo) {
        super();
        Etiqueta lugar = new AnimacionTexto(nombreLugar, 16).getEtiqueta();
        Etiqueta tiempo = new AnimacionTexto(descripcionTiempo, 14).getEtiqueta();
        this.agregarEtiquetas(lugar, tiempo);
        this.setAlignment(Pos.TOP_CENTER);
    }
}
