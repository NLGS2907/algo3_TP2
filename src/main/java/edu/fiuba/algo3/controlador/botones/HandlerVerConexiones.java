package edu.fiuba.algo3.controlador.botones;

import edu.fiuba.algo3.vista.contenedores.CuadroDialogo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerVerConexiones implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("VER ha sido apretado!");
        CuadroDialogo.obtenerInstancia().mostrarMensaje("");
    }
}
