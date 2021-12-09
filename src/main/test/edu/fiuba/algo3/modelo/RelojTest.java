package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.time.LocalDateTime;

public class RelojTest {

    @Test
    public void test01RelojAvanzaSeisHoras() {
        Reloj reloj = new Reloj();
        LocalDateTime fechaEsperada = LocalDateTime.of(2021, 1, 1, 13, 0);

        reloj.avanzarTiempo(6);

        assertTrue(reloj.verificarFechaLimite());
        assertEquals(fechaEsperada, reloj.obtenerFecha());
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
        LocalDateTime unDiaDespues = LocalDateTime.of(2021, 1, 2, 15, 0);
        LocalDateTime unMesDespues = LocalDateTime.of(2021,2,1,15,0);
        LocalDateTime unAnioDespues = LocalDateTime.of(2022, 1, 1, 15, 0);

        reloj1.avanzarTiempo(24);
        reloj2.avanzarTiempo(744); // 31 (dias) x 24 (horas) = 744
        reloj3.avanzarTiempo((8760)); // 365 (dias) x 24 (horas) = 8760

        assertEquals(unDiaDespues, reloj1.obtenerFecha());
        assertEquals(unMesDespues, reloj2.obtenerFecha());
        assertEquals(unAnioDespues, reloj3.obtenerFecha());
    }
}
