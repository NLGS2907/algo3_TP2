package edu.fiuba.algo3.modelo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ComputadoraTest {

    
    public void test01BuscarLadronMasculinoEnUnaListaConOtros2()
    {
        Ladron ladron1 = new Ladron();
        ladron1.establecerSexo("Masculino");
        Ladron ladron2 = new Ladron();
        ladron2.establecerSexo("Masculino");
        ladron2.establecerCabello("Rojo");
        Ladron ladron3 = new Ladron();
        ladron3.establecerSexo("Masculino");
        ladron3.establecerHobby("Tenis");
        Ladron ladron4 = new Ladron();
        ladron4.establecerSexo("Femenino");
        ladron4.establecerHobby("Tenis");

        Computadora computadora = new Computadora();
        computadora.agregarLadron(ladron2);
        computadora.agregarLadron(ladron3);
        computadora.agregarLadron(ladron4);

        assertFalse(computadora.buscarLadron(ladron1));
    }

    @Test
    public void test02BuscarLadronMasculinoConAnilloEnUnaListaConOtros3LadronesMasculinos()
    {
        Ladron ladron1 = new Ladron();
        ladron1.establecerSexo("Masculino");
        ladron1.establecerSenia("Anillo");
        Ladron ladron2 = new Ladron();
        ladron2.establecerSexo("Masculino");
        ladron2.establecerCabello("Rojo");
        ladron2.establecerSenia("Anillo");
        Ladron ladron3 = new Ladron();
        ladron3.establecerSexo("Masculino");
        ladron3.establecerSenia("Joyas");
        ladron3.establecerVehiculo("Descapotable");
        Ladron ladron4 = new Ladron();
        ladron4.establecerSexo("Masculino");
        ladron4.establecerHobby("Tenis");
        ladron4.establecerSenia("Cicatriz");

        Computadora computadora = new Computadora();
        computadora.agregarLadron(ladron2);
        computadora.agregarLadron(ladron3);
        computadora.agregarLadron(ladron4);

        assertTrue(computadora.buscarLadron(ladron1));
    }

    @Test
    public void test03BuscarLadronMasculinoConAnilloYRubioEnUnaListaConOtros3LadronesMasculinos()
    {
        Ladron ladron1 = new Ladron();
        ladron1.establecerSexo("Masculino");
        ladron1.establecerSenia("Anillo");
        ladron1.establecerCabello("Rubio");
        Ladron ladron2 = new Ladron();
        ladron2.establecerSexo("Masculino");
        ladron2.establecerCabello("Rojo");
        ladron2.establecerSenia("Anillo");
        Ladron ladron3 = new Ladron();
        ladron3.establecerSexo("Masculino");
        ladron3.establecerSenia("Joyas");
        ladron3.establecerVehiculo("Descapotable");
        Ladron ladron4 = new Ladron();
        ladron4.establecerSexo("Masculino");
        ladron4.establecerHobby("Tenis");
        ladron4.establecerSenia("Cicatriz");

        Computadora computadora = new Computadora();
        computadora.agregarLadron(ladron2);
        computadora.agregarLadron(ladron3);
        computadora.agregarLadron(ladron4);

        assertFalse(computadora.buscarLadron(ladron1));
    }
    
}