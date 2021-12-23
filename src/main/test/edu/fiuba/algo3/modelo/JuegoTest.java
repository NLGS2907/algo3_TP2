package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.reloj.Fecha;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JuegoTest {

    @Test
    public void test01ViajarDeMexicoARioDeJaneiroYSeActualizaLaCiudadCorrectamente(){
        Juego.obtenerInstancia().resetear();

        Ciudad mexico = Mapa.obtenerInstancia().obtenerCiudad("Mexico");
        Ciudad rioDeJaneiro = Mapa.obtenerInstancia().obtenerCiudad("Rio de Janeiro");
        rioDeJaneiro.establecerRutaDelLadron("Default");
        Juego.obtenerInstancia().establecerCiudadActual(mexico);

        Juego.obtenerInstancia().viajar(rioDeJaneiro);

        assertSame(Juego.obtenerInstancia().ciudadActual(), rioDeJaneiro);
    }

    @Test
    public void test02ViajarDeMexicoARioDeJaneiroYElTiempoPasaCorrectamente(){
        Juego.obtenerInstancia().resetear();

        Ciudad mexico = Mapa.obtenerInstancia().obtenerCiudad("Mexico");
        Ciudad rioDeJaneiro = Mapa.obtenerInstancia().obtenerCiudad("Rio de Janeiro");
        rioDeJaneiro.establecerRutaDelLadron("Default");
        Juego.obtenerInstancia().establecerCiudadActual(mexico);
        Fecha fecha = new Fecha (1,  17);

        Juego.obtenerInstancia().viajar(rioDeJaneiro);

        assertTrue(Juego.obtenerInstancia().obtenerDetective().obtenerFecha().esIgualA(fecha));
    }

}