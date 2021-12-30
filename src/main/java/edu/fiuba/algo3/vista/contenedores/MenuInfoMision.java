package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.pistas.ContenedorDeTesoros;
import edu.fiuba.algo3.vista.animaciones.AnimacionTexto;
import edu.fiuba.algo3.vista.botones.contextuales.BotonContinuar;
import javafx.scene.layout.VBox;

public class MenuInfoMision extends VBox {
    public MenuInfoMision(){
        super(5);
        String ciudad = Juego.obtenerInstancia().ciudadActual().obtenerNombre();
        String tesoro = ContenedorDeTesoros.obtenerInstancia().leerTesoro(ciudad);
        String informeMision = "Un sospechoso no identificado robó " + tesoro + " de la ciudad " + ciudad + ".\nInvestigue el caso!";
        this.getChildren().add(new AnimacionTexto(informeMision).getEtiqueta());
        this.getChildren().add(new BotonContinuar());
    }
}
