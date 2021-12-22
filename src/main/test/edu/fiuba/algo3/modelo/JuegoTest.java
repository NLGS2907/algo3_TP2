package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.detective.Detective;
import edu.fiuba.algo3.modelo.detective.DetectiveNovato;
import edu.fiuba.algo3.modelo.reloj.Fecha;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JuegoTest {

    @Test
    public void test01ViajarDeMexicoARioDeJaneiroYSeActualizaLaCiudadCorrectamente(){
        Juego juego = new Juego();

        Ciudad Mexico = Mapa.obtenerInstancia().obtenerCiudad("Mexico");
        Ciudad RioDeJaneiro = Mapa.obtenerInstancia().obtenerCiudad("Rio de Janeiro");
        juego.establecerCiudadActual(Mexico);

        juego.viajar(RioDeJaneiro);

        assertSame(juego.ciudadActual(), RioDeJaneiro);
    }

    @Test
    public void test02ViajarDeMexicoARioDeJaneiroYElTiempoPasaCorrectamente(){
        Juego juego = new Juego();

        Ciudad Mexico = Mapa.obtenerInstancia().obtenerCiudad("Mexico");
        Ciudad RioDeJaneiro = Mapa.obtenerInstancia().obtenerCiudad("Rio de Janeiro");
        juego.establecerCiudadActual(Mexico);
        juego.viajar(RioDeJaneiro);
        Fecha fecha = new Fecha (1,  17);

        assertTrue(juego.obtenerDetective().obtenerFecha().esIgualA(fecha));
    }

}
