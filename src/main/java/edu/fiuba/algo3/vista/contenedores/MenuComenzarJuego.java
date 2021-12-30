package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.pistas.ContenedorDeTesoros;
import edu.fiuba.algo3.vista.animaciones.AnimacionTexto;
import edu.fiuba.algo3.vista.botones.contextuales.BotonContinuar;
import javafx.scene.layout.VBox;

public class MenuComenzarJuego extends VBox {
    public MenuComenzarJuego(){
        super(5);
        String ciudad = Juego.obtenerInstancia().ciudadActual().obtenerNombre();
        String tesoro = ContenedorDeTesoros.obtenerInstancia().leerTesoro(ciudad);
        String informeMision = "Un sospechoso no identificado robó " + tesoro + " de la ciudad " + ciudad + ".\nInvestigue el caso!";
        String definitivo = "Bienvenido a AlgoThief recluta!" + "\n" + informeMision;
        this.getChildren().addAll(new AnimacionTexto(definitivo).getEtiqueta(), new BotonContinuar());
    }
}