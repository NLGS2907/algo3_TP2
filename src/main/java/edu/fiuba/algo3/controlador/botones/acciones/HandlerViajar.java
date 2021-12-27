package edu.fiuba.algo3.controlador.botones.acciones;

import edu.fiuba.algo3.vista.contenedores.CuadroDialogo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerViajar implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        CuadroDialogo.obtenerInstancia().desplegarPosiblesViajes();
    }
}
