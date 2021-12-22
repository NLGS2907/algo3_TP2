package edu.fiuba.algo3.modelo.detective;

import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.edificios.*;
import edu.fiuba.algo3.modelo.Ladron;
import edu.fiuba.algo3.modelo.reloj.Fecha;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DetectiveTest {
/*
    @Test
    public void test01DetectiveVisitaUnEdificioYSeDespliegaUnaPista() {
        Edificio puerto = new Edificio("Puerto", "Transporte");
        Detective detective = new DetectiveNovato();
        assertEquals("Cambio dolares por pesos mexicanos", detective.visitarEdificio(Edificio, 1));
    }*/

    @Test
    public void test02DetectiveVisitaUnEdificioYElTiempoTranscurreCorrectamente() {
        Edificio banco = new Edificio("Banco", "Financiero");
        Detective detective = new DetectiveNovato();
        Fecha fecha = new Fecha (1,  8);
        detective.visitarEdificio(banco, 1);
        assertTrue(detective.obtenerFecha().esIgualA(fecha));
    }

    @Test
    public void test03DetectiveViajaDeMontrealAMexico(){
        Mapa mapa = Mapa.obtenerInstancia();
        Detective detective = new DetectiveNovato();

        Ciudad montreal = mapa.obtenerCiudad("Montreal");
        Ciudad mexico = mapa.obtenerCiudad("Mexico");
        Ciudad ciudadActual = montreal;

        Fecha fecha =  new Fecha (1,  11);
        ciudadActual = ciudadActual.realizarViaje(mexico, detective);
        assertEquals(ciudadActual.obtenerNombre(), "Mexico");
        assertTrue(detective.obtenerFecha().esIgualA(fecha));
    }

    @Test
    public void test04DetectiveNovatoComienzaEnMontrealVisitaEdificioYBlibloteca(){
        Detective detective = new DetectiveNovato();
        Ciudad montreal = new Ciudad("Montreal");
        Ciudad siguiente = new Ciudad("Nombre");
        montreal.asignarSiguiente(siguiente);
        Edificio puerto = new Edificio("Puerto", "Transporte");
        Edificio biblioteca = new Edificio("Biblioteca", "Biblioteca");
        montreal.agregarEdificio(puerto);
        montreal.agregarEdificio(biblioteca);
        montreal.visitarEdificio(detective, puerto);
        montreal.visitarEdificio(detective, biblioteca);
        Fecha fecha = new Fecha(1, 10);
        assertTrue(detective.obtenerFecha().esIgualA(fecha));
    }

    @Test
    public void test05DetectiveVisitaUnEdificioYElTiempoTranscurreCorrectamente() {
        Edificio bolsa = new Edificio("Bolsa", "Financiero");
        Detective detective = new DetectiveNovato();
        Fecha fecha = new Fecha(2,  11);
        detective.visitarEdificio(bolsa, 20);
        assertTrue(detective.obtenerFecha().esIgualA(fecha));
    }

    @Test
    public void test06VisitarAeropuertoTresVecesLa(){
        boolean enCurso = true;
        Detective detective = new DetectiveNovato();
        Ciudad montreal = new Ciudad("Montreal");
        Ciudad siguiente = new Ciudad("Nombre");
        montreal.asignarSiguiente(siguiente);
        Edificio aeropuerto = new Edificio("Aeropuerto", "Transporte");
        Edificio puerto = new Edificio("Puerto", "Transporte");
        montreal.agregarEdificio(aeropuerto);
        montreal.agregarEdificio(puerto);

        for(int i = 0; i < 3; i++){
            montreal.visitarEdificio(detective, aeropuerto);
            enCurso = detective.verificarFechaLimite();
        }

        for(int i = 0; i < 55; i++) {
            montreal.visitarEdificio(detective, puerto);
            enCurso = detective.verificarFechaLimite();
        }
        assertFalse(enCurso);
    }

    @Test
    public void test07DetectiveRecibeUnCuhillazoYDuerme(){
        Detective detective = new DetectiveNovato();
        int distancia = 12600;
        Fecha fecha = new Fecha (2,  7);
        detective.viajarACiudadConLadron(distancia);
        assertTrue(detective.obtenerFecha().esIgualA(fecha));
    }

    @Test
    public void test08DetectiveRecibeDosCuchillazos(){
        Detective detective = new DetectiveNovato();
        int distancia = 900;
        Fecha fecha = new Fecha (1,  12);
        detective.viajarACiudadConLadron(distancia);
        detective.viajarACiudadConLadron(distancia);
        assertTrue(detective.obtenerFecha().esIgualA(fecha));
    }

    @Test
    public void test09DetectiveEntraEnEdificioConLadronSinOrdenDeArrestoYNoLoArresta(){
        Edificio bolsaConLadron = new Edificio("Bolsa", "Financierio");
        Ladron ladron = new Sospechoso();
        bolsaConLadron.establecerLadron(ladron);

        Detective detective = new DetectiveNovato();


        detective.visitarEdificio(bolsaConLadron, 1);

        assertEquals(0, detective.cantidadDeArrestos);
    }

    @Test
    public void test10DetectiveObtieneOrdenDecapturaEntraEnEdificioYAtrapaLadron()
    {
        Computadora computadora = new Computadora();
        Ladron ladron1 = new Sospechoso();
        ladron1.establecerSexo("Masculino");
        ladron1.establecerSenia("Anillo");
        Ladron ladron2 = new Sospechoso();
        ladron2.establecerSexo("Masculino");
        ladron2.establecerCabello("Rojo");
        ladron2.establecerSenia("Anillo");



        computadora.agregarLadron(ladron2);

        Edificio bancoConLadron = new Edificio("Banco", "Financiero");
        bancoConLadron.establecerLadron(ladron2);

        Detective detective = new DetectiveNovato();

        Fecha fecha = new Fecha(1, 11);

        detective.emitirOrdenDeArresto(computadora);

        detective.visitarEdificio(bancoConLadron, 1);
        assertTrue(detective.obtenerFecha().esIgualA(fecha));
        assertEquals(detective.obtenerContador(),1);
    }
  
    @Test
    public void test11DetectiveConRangoInvestigadorViajaDeMontrealAMexico(){
        Detective detective = new DetectiveInvestigador();
        Ciudad ciudadOrigen = new Ciudad("Montreal");
        Ciudad ciudadDestino = new Ciudad("Mexico");
        Ciudad ciudadActual = ciudadOrigen;

        ciudadActual = ciudadActual.realizarViaje(ciudadDestino, detective);

        Fecha fecha = new Fecha (1,  10);
        assertEquals(ciudadActual.obtenerNombre(), "Mexico");
        assertTrue(detective.obtenerFecha().esIgualA(fecha));
    }

  /*  @Test
    public void test12DetectivoHace6ArrestosInvestigaYAtrapaSospechoso() {
        Detective detective = new DetectiveNovato();
        for (int i = 0; i < 6; i++) {
            detective = detective.incrementarArresto();
        }

        assertSame(DetectiveDetective.class, detective.getClass());

        Ciudad ciudadOrigen = new Ciudad("Mexico");
        Ciudad ciudadDestino = new Ciudad("Montreal");

        Ciudad ciudadActual = ciudadOrigen;

        ciudadActual.realizarViaje(ciudadDestino, detective);

        Edificio EdificioConLadron = new Edificio();
        EdificioConLadron.establecerLadron(true);
        boolean ladronArrestado = false;
        Ladron ladron = new Sospechoso();
        ladron.establecerSexo("Masculino");
        ladron.establecerSenia("Anillo");

        BaseDeDatos baseDeDatos = new BaseDeDatos();
        baseDeDatos.agregarLadron(ladron);

        detective.emitirOrdenDeArresto(baseDeDatos, ladron);

        detective.visitarEdificio(EdificioConLadron, 1);
        ladronArrestado = detective.arrestarladron();

        Fecha fecha = new Fecha (1,  14);

        assertTrue(detective.obtenerFecha().esIgualA(fecha));
        assertTrue(ladronArrestado);
    }
*/

}
