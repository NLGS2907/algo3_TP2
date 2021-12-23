package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.reloj.Fecha;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JuegoTest {

    @Test
    public void test01ViajarDeMexicoARioDeJaneiroYSeActualizaLaCiudadCorrectamente(){
        Juego juego = new Juego();
        Ciudad mexico = Mapa.obtenerInstancia().obtenerCiudad("Mexico");
        Ciudad rioDeJaneiro = Mapa.obtenerInstancia().obtenerCiudad("Rio de Janeiro");
        rioDeJaneiro.establecerRutaDelLadron("Default");
        juego.establecerCiudadActual(mexico);
        juego.viajar(rioDeJaneiro);
        assertSame(juego.ciudadActual(), rioDeJaneiro);
    }

    @Test
    public void test02ViajarDeMexicoARioDeJaneiroYElTiempoPasaCorrectamente(){
        Juego juego = new Juego();

        Ciudad mexico = Mapa.obtenerInstancia().obtenerCiudad("Mexico");
        Ciudad rioDeJaneiro = Mapa.obtenerInstancia().obtenerCiudad("Rio de Janeiro");
        rioDeJaneiro.establecerRutaDelLadron("Default");
        juego.establecerCiudadActual(mexico);
        Fecha fecha = new Fecha (1,  17);

        juego.viajar(rioDeJaneiro);

        assertTrue(juego.obtenerDetective().obtenerFecha().esIgualA(fecha));
    }

}