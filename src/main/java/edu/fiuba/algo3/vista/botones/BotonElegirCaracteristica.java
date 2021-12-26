package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controlador.botones.handlersCaracteristicas.CreadorHandlerCaracteristica;
import edu.fiuba.algo3.controlador.botones.handlersCaracteristicas.HandlerCambiarCaracteristica;
import edu.fiuba.algo3.modelo.ladron.Caracteristica;
import javafx.scene.control.Button;

public class BotonElegirCaracteristica extends Button {
    public BotonElegirCaracteristica(Caracteristica caracteristica){
        super(caracteristica.obtenerValor());
        this.setOnAction(CreadorHandlerCaracteristica.obtenerInstancia().crearHandler(caracteristica));

        //this.setOnAction(new HandlerCambiarCaracteristica(caracteristica));
    }
}
