package edu.fiuba.algo3.vista.handlers.botones;

import edu.fiuba.algo3.vista.contenedores.CuadroDialogo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerViajar implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        CuadroDialogo.obtenerInstancia().desplegarPosiblesViajes();
        System.out.println("VIAJAR ha sido apretado!");
    }
}
