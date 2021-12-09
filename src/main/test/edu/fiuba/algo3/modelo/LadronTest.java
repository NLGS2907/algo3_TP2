package edu.fiuba.algo3.modelo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LadronTest {

    @Test
    public void test01CompararUnLadronSinCaracteristicasConOtroConSexo()
    {
        Ladron ladron1 = new Ladron();
        Ladron ladron2 = new Ladron();
        ladron2.establecerSexo("Masculino");

        assertFalse(ladron1.esIgualA(ladron2));
        assertFalse(ladron1.esSimilarA(ladron2));
        assertTrue(ladron2.esSimilarA(ladron1));
    }

    @Test
    public void test02CompararDosLadronesDeDistintoSexo()
    {
        Ladron ladron1 = new Ladron();
        ladron1.establecerSexo("Femenino");
        Ladron ladron2 = new Ladron();
        ladron2.establecerSexo("Masculino");

        assertFalse(ladron1.esIgualA(ladron2));
        assertFalse(ladron1.esSimilarA(ladron2));
        assertFalse(ladron2.esSimilarA(ladron1));
    }
    
}
