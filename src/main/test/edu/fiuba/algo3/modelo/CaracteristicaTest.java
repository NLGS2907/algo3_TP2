package edu.fiuba.algo3.modelo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CaracteristicaTest {
    
    @Test
    public void test01Comparar2CaracteristicasConDistintoTipo()
    {
        Caracteristica caracteristica1 = new Caracteristica("Tipo 1");
        Caracteristica caracteristica2 = new Caracteristica("Tipo 2");

        assertFalse(caracteristica1.compararManeraExacta(caracteristica2));
        assertFalse(caracteristica1.esUna(caracteristica2));
    }

    @Test
    public void test02Comparar2CaracteristicasConMismoTipoYDistintoValor()
    {
        Caracteristica caracteristica1 = new Caracteristica("Tipo 1","Valor 1");
        Caracteristica caracteristica2 = new Caracteristica("Tipo 1","Valor 2");

        assertFalse(caracteristica1.compararManeraExacta(caracteristica2));
        assertFalse(caracteristica1.esUna(caracteristica2));
    }

    @Test
    public void test03Comparar2CaracteristicasConMismoTipoYDistintoValorUnoDeEllosNulo()
    {
        Caracteristica caracteristica1 = new Caracteristica("Tipo 1","Valor 1");
        Caracteristica caracteristica2 = new Caracteristica("Tipo 1");

        assertFalse(caracteristica1.compararManeraExacta(caracteristica2));
        assertTrue(caracteristica1.esUna(caracteristica2));
        assertFalse(caracteristica2.esUna(caracteristica1));
    }

    @Test
    public void test04Comparar3CaracteristicasConMismoTipoYMismoValor()
    {
        Caracteristica caracteristica1 = new Caracteristica("Tipo 1","Valor 1");
        Caracteristica caracteristica2 = new Caracteristica("Tipo 1","Valor 1");
        Caracteristica caracteristica3 = new Caracteristica("tIPO 1","vAlOr 1");

        assertTrue(caracteristica1.compararManeraExacta(caracteristica2));
        assertTrue(caracteristica1.esUna(caracteristica2));
        assertTrue(caracteristica1.compararManeraExacta(caracteristica3));
    }

}
