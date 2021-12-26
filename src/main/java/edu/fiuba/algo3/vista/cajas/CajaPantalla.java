package edu.fiuba.algo3.vista.cajas;

import javafx.scene.layout.HBox;

import java.util.Observable;
import java.util.Observer;

public class CajaPantalla extends HBox{

    public CajaPantalla() {
        super(0);
        this.getChildren().setAll(CajaLugarYFecha.obtenerInstancia().mostrarLugarYTiempo(), new CajaBotonesYDialogo());
    }

}
