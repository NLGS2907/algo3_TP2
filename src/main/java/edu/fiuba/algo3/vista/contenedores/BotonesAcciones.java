package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.vista.botones.BotonComputadora;
import edu.fiuba.algo3.vista.botones.BotonInvestigar;
import edu.fiuba.algo3.vista.botones.BotonVerConexiones;
import edu.fiuba.algo3.vista.botones.BotonViajar;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;

public class BotonesAcciones extends HBox {

    public BotonesAcciones() {
        super(10);
        this.getChildren().addAll(
                new BotonVerConexiones(),
                new BotonViajar(),
                new BotonInvestigar(),
                new BotonComputadora()
        );
        this.setAlignment(Pos.BOTTOM_CENTER);
    }
}
