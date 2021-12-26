package edu.fiuba.algo3.controlador.botones;

import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.vista.cajas.CajaLugarYFecha;
import edu.fiuba.algo3.vista.contenedores.CuadroDialogo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerComenzarMision implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("comenzarmision ha sido apretado!");
        Juego.obtenerInstancia().empezarNuevaMision();
        CajaLugarYFecha.obtenerInstancia().mostrarLugarYTiempo();
        CuadroDialogo.obtenerInstancia().getChildren().clear();
    }
}
