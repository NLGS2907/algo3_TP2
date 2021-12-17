package edu.fiuba.algo3.modelo.reloj;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class RelojTest {

    @Test
    public void test01RelojAvanzaSeisHorasYNoPasaDeLaFechaLimite() {
        Reloj reloj = new Reloj();

        reloj.avanzarTiempo(6);

        assertTrue(reloj.verificarFechaLimite());
    }

    @Test
    public void test02Agregar8DiasSePasaDeLaFechaLimite() {
        Reloj reloj = new Reloj();

        reloj.avanzarTiempo(192); // 8 (dias) x 24 (horas) = 192

        assertFalse(reloj.verificarFechaLimite());
    }

    @Test
    public void test03AlPasarDeLasOnceSeAgreganOchoHorasSiempre() {
        Reloj reloj1 = new Reloj();
        Reloj reloj2 = new Reloj();
        Reloj reloj3 = new Reloj();
        Fecha unDiaDespues = new Fecha(2, 15, 0);
        Fecha diezDiasDespues = new Fecha(11,15,0);
        Fecha unMesDespues = new Fecha(31, 15, 0);

        reloj1.avanzarTiempo(24);
        reloj2.avanzarTiempo(240); // 10 (dias) x 24 (horas) = 240
        reloj3.avanzarTiempo(720); // 30 (dias) x 24 (horas) = 720

        assertTrue(reloj1.obtenerFecha().esIgualA(unDiaDespues));
        assertTrue(reloj1.verificarFechaLimite());
        assertTrue(reloj2.obtenerFecha().esIgualA(diezDiasDespues));
        assertFalse(reloj2.verificarFechaLimite());
        assertTrue(reloj3.obtenerFecha().esIgualA(unMesDespues));
        assertFalse(reloj3.verificarFechaLimite());
    }
}
