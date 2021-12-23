package edu.fiuba.algo3.vista.handlers.botones;

import edu.fiuba.algo3.modelo.Ciudad;
import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.vista.cajas.CajaLugarYFecha;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerElegirCiudad implements EventHandler<ActionEvent> {
    private Ciudad ciudad;

    public HandlerElegirCiudad(Ciudad ciudad){
        this.ciudad = ciudad;
    }

    @Override
    public void handle(ActionEvent actionevent){
        Juego.obtenerInstancia().viajar(ciudad);
        CajaLugarYFecha.obtenerInstancia().mostrarLugarYTiempo();

    }
}
