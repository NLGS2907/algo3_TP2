package edu.fiuba.algo3.modelo;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DetectiveTest {

    @Test
    public void test01DetectiveVisitaUnBancoYSeDespliegaUnaPista() {
        Edificio edificio = new Edificio();
        Detective detective = new DetectiveNovato();
        assertEquals("Cambio los dolares por pesos mexicanos", detective.visitarEdificio(edificio, 1));
    }

    @Test
    public void test02DetectiveVisitaUnBancoYElTiempoTranscurreCorrectamente() {
        Edificio edificio = new Edificio();
        Detective detective = new DetectiveNovato();
        LocalDateTime fecha = LocalDateTime.of(2021, 1, 1,  8, 0);
        detective.visitarEdificio(edificio, 1);
        assertTrue(detective.obtenerFecha().equals(fecha));
    }



}
