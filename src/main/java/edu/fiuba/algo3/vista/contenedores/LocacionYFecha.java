package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.etiquetas.Etiqueta;

public class LocacionYFecha extends CajaGenerica {

    public LocacionYFecha(String nombreLugar, String descripcionTiempo) {
        super();
        Etiqueta lugar = new Etiqueta(nombreLugar, 16);
        Etiqueta tiempo = new Etiqueta(descripcionTiempo, 14);
        this.agregarEtiquetas(lugar, tiempo);
    }
}
