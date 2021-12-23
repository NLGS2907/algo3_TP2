package edu.fiuba.algo3.vista.handlers.botones;

import edu.fiuba.algo3.vista.contenedores.CuadroDialogo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerInvestigar implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("INVESTIGAR ha sido apretado!");

        CuadroDialogo.obtenerInstancia().mostrarCiudad();
    }
}
