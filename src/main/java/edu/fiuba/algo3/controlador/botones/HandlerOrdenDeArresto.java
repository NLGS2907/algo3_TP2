package edu.fiuba.algo3.controlador.botones;

import edu.fiuba.algo3.modelo.Edificio;
import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.computadora.ordenesDeArresto.OrdenDeArresto;
import edu.fiuba.algo3.vista.cajas.CajaLugarYFecha;
import edu.fiuba.algo3.vista.contenedores.CuadroDialogo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerOrdenDeArresto implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionevent){
        OrdenDeArresto ordenDeArresto = Juego.obtenerInstancia().emitirOrdenDeArresto();
        CajaLugarYFecha.obtenerInstancia().mostrarLugarYTiempo();
        if(Juego.obtenerInstancia().estadoMision() == "En curso") {
            CuadroDialogo.obtenerInstancia().mostrarEstadoOrdenDeArresto(ordenDeArresto);
        }
    }
}