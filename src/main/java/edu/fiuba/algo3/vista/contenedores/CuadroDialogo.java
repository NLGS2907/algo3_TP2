package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.modelo.Ciudad;
import edu.fiuba.algo3.modelo.Edificio;
import edu.fiuba.algo3.modelo.Juego;
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
        this.agregarEtiqueta(new AnimacionTexto(mensaje, 12).getEtiqueta());
        this.setAlignment(Pos.TOP_LEFT);
        this.setPrefSize(400, 350);
        return instancia;
    }

    public CuadroDialogo desplegarPosiblesViajes(){
        ArrayList<Ciudad> ciudades = Juego.obtenerInstancia().ciudadActual().obtenerCiudadesAdyacentes();
        this.getChildren().setAll(new BotonesViajes(ciudades));
        return instancia;
    }

    public CuadroDialogo mostrarCiudad(){
        ArrayList<Edificio> edificios = Juego.obtenerInstancia().ciudadActual().obtenerEdificios();
        this.getChildren().setAll(new BotonesEdificio(edificios));
        return instancia;
    }

}
