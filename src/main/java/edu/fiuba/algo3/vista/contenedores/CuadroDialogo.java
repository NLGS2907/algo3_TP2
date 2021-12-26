package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.modelo.Ciudad;
import edu.fiuba.algo3.modelo.Edificio;
import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.computadora.Computadora;
import edu.fiuba.algo3.modelo.computadora.ordenesDeArresto.OrdenDeArresto;
import edu.fiuba.algo3.modelo.computadora.ordenesDeArresto.OrdenValida;
import edu.fiuba.algo3.modelo.estado.EstadoMision;
import edu.fiuba.algo3.modelo.ladron.Caracteristica;
import edu.fiuba.algo3.vista.animaciones.AnimacionTexto;
import edu.fiuba.algo3.vista.contenedores.cuadros.CuadroNegro;
import edu.fiuba.algo3.vista.etiquetas.Etiqueta;
import javafx.geometry.Pos;

import java.util.ArrayList;

public class CuadroDialogo extends CuadroNegro {

    private static CuadroDialogo instancia = null;
    private Etiqueta mensaje;

    private CuadroDialogo() {
        super();
        this.setPrefSize(400, 350);
        this.setAlignment(Pos.TOP_LEFT);
    }

    public static void crearCuadroDialogo() {
        if (instancia == null) {
            instancia = new CuadroDialogo();
        }
    }

    public static CuadroDialogo obtenerInstancia() {
        if (instancia == null) {
            crearCuadroDialogo();
        }
        return instancia;
    }

    public CuadroDialogo mostrarMensaje(String mensaje) {
        this.actualizarTodo(new AnimacionTexto(mensaje, 12).getEtiqueta());
        return instancia;
    }

    public CuadroDialogo desplegarPosiblesViajes(){
        ArrayList<Ciudad> ciudades = Juego.obtenerInstancia().ciudadActual().obtenerCiudadesAdyacentes();
        this.actualizarTodo(new BotonesViajes(ciudades));
        return instancia;
    }

    public CuadroDialogo mostrarCiudad(){
        ArrayList<Edificio> edificios = Juego.obtenerInstancia().ciudadActual().obtenerEdificios();
        this.actualizarTodo(new BotonesEdificio(edificios));
        return instancia;
    }

    public CuadroDialogo mostrarComputadora(){
        Computadora computadora = Juego.obtenerInstancia().obtenerComputadora();
        this.actualizarTodo(new MenuEmitirOrdenDeArresto(computadora));
        return instancia;
    }

    public CuadroDialogo mostrarEstadoOrdenDeArresto(OrdenDeArresto ordenDeArresto){
        if(ordenDeArresto.getClass() == OrdenValida.class)
            mostrarMensaje("Se emitió exitosamente una orden de arresto para la\n" +
                    " captura de " + ((OrdenValida) ordenDeArresto).obtenerNombreSospechoso() + ".");
        else mostrarMensaje("No se pudo emitir una orden de arresto porque o \nno hay ningún sospechoso en la base de datos que\n" +
                                " cumpla con las características elegidas, o hay 2 o\n más que las cumplen.");
        return instancia;
    }

    public CuadroDialogo update(){
        String estadoMision = Juego.obtenerInstancia().estadoMision();

        if(estadoMision == "Tiempo agotado"){
            String mensaje;
            //this.mostrarMensaje("Se acabó el tiempo.");
            this.actualizarTodo(new MenuComenzarNuevaMision("Se acabó el tiempo."));
        }

        if(estadoMision == "Ladron atrapado"){
            this.mostrarMensaje("atrapa3");
        }

        if(estadoMision == "Ladron escapo"){
            this.mostrarMensaje("escapo");
        }

        if(estadoMision == "Sin mision"){
            this.mostrarMensaje("sin mision");
        }

        return instancia;
    }
}
