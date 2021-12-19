package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.detective.Detective;
import edu.fiuba.algo3.modelo.detective.DetectiveNovato;
import edu.fiuba.algo3.modelo.edificios.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CiudadTest {

    @Test
    public void test01ElContadorDeVisitasNoPasaDeTres() {
        Detective detective = new DetectiveNovato();
        Ciudad buenosAires = new Ciudad("Buenos Aires");
        Edificio biblioteca = new Biblioteca();
        buenosAires.agregarEdificio((biblioteca));

        for (int i = 0; i < 10; i++) {
            buenosAires.visitarEdificio(detective, 0);
        }

        assertEquals(3, buenosAires.obtenerVisitas());
    }
}
