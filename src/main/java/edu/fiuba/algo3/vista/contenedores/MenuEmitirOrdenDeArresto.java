package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.modelo.Edificio;
import edu.fiuba.algo3.modelo.computadora.Computadora;
import edu.fiuba.algo3.modelo.ladron.Caracteristica;
import edu.fiuba.algo3.vista.botones.BotonElegirEdificio;
import edu.fiuba.algo3.vista.botones.BotonEmitirOrdenDeArresto;
import edu.fiuba.algo3.vista.cajas.CajaCargarCaracteristica;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class MenuEmitirOrdenDeArresto extends VBox {
    public MenuEmitirOrdenDeArresto(Computadora computadora) {
        super(15);

        ArrayList<Caracteristica> caracteristicas = computadora.caracteristicasGuardadas();

        for (Caracteristica caracteristica : caracteristicas) {
            //if(!caracteristica.obtenerTipo().equals("Nombre"))
            this.getChildren().add(new CajaCargarCaracteristica(caracteristica));
        }

        this.getChildren().add(new BotonEmitirOrdenDeArresto());

        this.setAlignment(Pos.BOTTOM_CENTER);
    }
}
