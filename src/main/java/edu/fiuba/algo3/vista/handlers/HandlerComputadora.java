package edu.fiuba.algo3.vista.handlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerComputadora implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("COMPUTADORA ha sido apretado!");
    }
}
