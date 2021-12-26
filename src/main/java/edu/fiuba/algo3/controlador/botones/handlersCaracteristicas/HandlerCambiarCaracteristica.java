package edu.fiuba.algo3.controlador.botones.handlersCaracteristicas;

import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.ladron.Caracteristica;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

public abstract class HandlerCambiarCaracteristica implements EventHandler<ActionEvent> {
    protected Caracteristica caracteristica;
    protected ArrayList<String> valoresPosibles;

    HandlerCambiarCaracteristica(Caracteristica caracteristica){
        this.caracteristica = caracteristica;
        valoresPosibles = new ArrayList<String>();
        this.valoresPosibles.add("");
    }

    //@Override
    //public void handle(ActionEvent actionEvent){


    //}
}
