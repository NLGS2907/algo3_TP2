package edu.fiuba.algo3.controlador.botones.acciones;

import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.pistas.DescripcionesDeCiudades;
import edu.fiuba.algo3.vista.animaciones.AnimacionTexto;
import edu.fiuba.algo3.vista.contenedores.CuadroDialogo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerVer implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("VER ha sido apretado!");
        String descripcion = DescripcionesDeCiudades.obtenerInstancia().leerDescripcion(Juego.obtenerInstancia().ciudadActual().obtenerNombre());
        CuadroDialogo.obtenerInstancia().actualizarTodo(new AnimacionTexto(descripcion).getEtiqueta());
    }
}
