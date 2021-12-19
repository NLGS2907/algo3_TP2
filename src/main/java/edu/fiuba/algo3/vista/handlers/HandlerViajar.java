package edu.fiuba.algo3.vista.handlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerViajar implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("VIAJAR ha sido apretado!");
    }
}
