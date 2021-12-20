package edu.fiuba.algo3.modelo.detective;

import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.edificios.*;
import edu.fiuba.algo3.modelo.reloj.Fecha;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DetectiveTest {

    @Test
    public void test01DetectiveVisitaUnBancoYSeDespliegaUnaPista() {
        Edificio banco = new Banco();
        Detective detective = new DetectiveNovato();
        assertEquals("Cambio dolares por pesos mexicanos", detective.visitarEdificio(banco, 1));
    }

    @Test
    public void test02DetectiveVisitaUnBancoYElTiempoTranscurreCorrectamente() {
        Edificio banco = new Banco();
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
    public void test04DetectiveNovatoComienzaEnMontrealVisitaBancoYBlibloteca(){
        Detective detective = new DetectiveNovato();
        Ciudad montreal = new Ciudad("Montreal");
        Edificio banco = new Banco();
        Edificio biblioteca = new Biblioteca();
        montreal.agregarEdificio(banco);
        montreal.agregarEdificio(biblioteca);
        montreal.visitarEdificio(detective, banco);
        montreal.visitarEdificio(detective, biblioteca);
        Fecha fecha = new Fecha(1, 10);
        assertTrue(detective.obtenerFecha().esIgualA(fecha));
    }

    @Test
    public void test05DetectiveVisitaUnBancoYElTiempoTranscurreCorrectamente() {
        Edificio banco = new Banco();
        Detective detective = new DetectiveNovato();
        Fecha fecha = new Fecha(2,  11);
        detective.visitarEdificio(banco, 20);
        assertTrue(detective.obtenerFecha().esIgualA(fecha));
    }

    @Test
    public void test06VisitarAeropuertoTresVecesLa(){
        boolean enCurso = true;
        Detective detective = new DetectiveNovato();
        Ciudad montreal = new Ciudad("Montreal");
        Edificio aeropuerto = new Aeropuerto();
        Edificio puerto = new Puerto();
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
    public void test09DetectiveEntraEnEdificioConLadronSinOrdenDeArresto(){
        Banco bancoConLadron = new Banco();
        Ladron ladron = new Ladron();
        OrdenDeArresto orden = new OrdenValida(ladron);
        bancoConLadron.establecerLadron(true);

        Detective detective = new DetectiveNovato();


        detective.visitarEdificio(bancoConLadron, 1);

        assertFalse(orden.getClass() == OrdenValida.class);
    }

    @Test
    public void test10DetectiveObtieneOrdenDecapturaEntraEnEdificioYAtrapaLadron()
    {
        Computadora computadora = new Computadora();
        Ladron ladron1 = new Ladron();
        ladron1.establecerSexo("Masculino");
        ladron1.establecerSenia("Anillo");
        Ladron ladron2 = new Ladron();
        ladron2.establecerSexo("Masculino");
        ladron2.establecerCabello("Rojo");
        ladron2.establecerSenia("Anillo");

        BaseDeDatos baseDeDatos = new BaseDeDatos();
        baseDeDatos.agregarLadron(ladron2);

        Banco bancoConLadron = new Banco();
        bancoConLadron.establecerLadron(true);

        Detective detective = new DetectiveNovato();
        boolean ladronArrestado = false;

        Fecha fecha = new Fecha(1, 11);

        detective.emitirOrdenDeArresto(computadora);

        detective.visitarEdificio(bancoConLadron, 1);
        detective.arrestarladron(ladron1);
        assertTrue(detective.obtenerFecha().esIgualA(fecha));
        assertTrue(detective.obtenerContador() == 1);
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

    @Test
    public void test12DetectivoHace6ArrestosYInvestigaYAtrapaSospechoso() {
        Detective detective = new DetectiveNovato();
        for (int i = 0; i < 6; i++) {
            detective = detective.incrementarArresto();
        }

        assertSame(DetectiveDetective.class, detective.getClass());

        Ciudad ciudadOrigen = new Ciudad("Mexico");
        Ciudad ciudadDestino = new Ciudad("Montreal");

        Ciudad ciudadActual = ciudadOrigen;

        ciudadActual.realizarViaje(ciudadDestino, detective);

        Banco bancoConLadron = new Banco();
        bancoConLadron.establecerLadron(true);
        boolean ladronArrestado = false;
        Ladron ladron = new Ladron();
        ladron.establecerSexo("Masculino");
        ladron.establecerSenia("Anillo");

        BaseDeDatos baseDeDatos = new BaseDeDatos();
        baseDeDatos.agregarLadron(ladron);

        detective.emitirOrdenDeArresto(baseDeDatos, ladron);

        detective.visitarEdificio(bancoConLadron, 1);
        ladronArrestado = detective.arrestarladron();

        Fecha fecha = new Fecha (1,  14);

        assertTrue(detective.obtenerFecha().esIgualA(fecha));
        assertTrue(ladronArrestado);
    }
}
