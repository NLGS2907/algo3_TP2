package edu.fiuba.algo3.vista.cajas;

import edu.fiuba.algo3.modelo.ladron.Caracteristica;
import edu.fiuba.algo3.vista.botones.contextuales.BotonElegirCaracteristica;
import edu.fiuba.algo3.vista.etiquetas.Etiqueta;
import javafx.scene.layout.HBox;

public class CajaCargarCaracteristica extends HBox {
    public CajaCargarCaracteristica(Caracteristica caracteristica){
        super(5);
        //System.out.println(caracteristica.obtenerTipo());
        this.getChildren().setAll(new Etiqueta(caracteristica.obtenerTipo()), new BotonElegirCaracteristica(caracteristica));
    }
}
