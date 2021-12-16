package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import edu.fiuba.algo3.modelo.excepciones.ExcepcionLadron;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

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
        LocalDateTime fecha = LocalDateTime.of(2021, 1, 1,  8, 0);
        detective.visitarEdificio(banco, 1);
        assertTrue(detective.obtenerFecha().equals(fecha));
    }

    @Test
    public void test03DetectiveViajaDeMontrealAMexico(){
        Mapa mapa = Mapa.obtenerInstancia();
        Detective detective = new DetectiveNovato();

        Ciudad montreal = mapa.obtenerCiudad("Montreal");
        Ciudad mexico = mapa.obtenerCiudad("Mexico");
        Ciudad ciudadActual = montreal;

        LocalDateTime fecha = LocalDateTime.of(2021, 1, 1,  11, 0);
        ciudadActual = ciudadActual.realizarViaje(mexico, detective);
        assertEquals(ciudadActual.obtenerNombre(), "Mexico");
        assertTrue(detective.obtenerFecha().equals(fecha));
    }

    @Test
    public void test04DetectiveNovatoComienzaEnMontrealVisitaBancoYBlibloteca(){
        Detective detective = new DetectiveNovato();
        Ciudad montreal = new Ciudad("Montreal");
        Edificio banco = new Banco();
        Edificio biblioteca = new Biblioteca();
        montreal.agregarEdificio(banco);
        montreal.agregarEdificio(biblioteca);
        montreal.visitarEdificio(detective, 0);
        montreal.visitarEdificio(detective, 1);
        LocalDateTime fecha = LocalDateTime.of(2021, 1, 1,  10, 0);
        assertTrue(detective.obtenerFecha().equals(fecha));
    }

    @Test
    public void test05DetectiveVisitaUnBancoYElTiempoTranscurreCorrectamente() {
        Edificio banco = new Banco();
        Detective detective = new DetectiveNovato();
        LocalDateTime fecha = LocalDateTime.of(2021, 1, 2,  11, 0);
        detective.visitarEdificio(banco, 20);
        assertTrue(detective.obtenerFecha().equals(fecha));
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
            montreal.visitarEdificio(detective, 0);
            enCurso = detective.verificarFechaLimite();
        }

        for(int i = 0; i < 55; i++) {
            montreal.visitarEdificio(detective, 1);
            enCurso = detective.verificarFechaLimite();
        }
        assertFalse(enCurso);
    }

    @Test
    public void test07DetectiveRecibeUnCuhillazoYDuerme(){
        Detective detective = new DetectiveNovato();
        int distancia = 12600;
        LocalDateTime fecha = LocalDateTime.of(2021, 1, 2,  7, 0);
        detective.viajarACiudadConLadron(distancia);
        assertTrue(detective.obtenerFecha().equals(fecha));
    }

    @Test
    public void test08DetectiveRecibeDosCuchillazos(){
        Detective detective = new DetectiveNovato();
        int distancia = 900;
        LocalDateTime fecha = LocalDateTime.of(2021, 1, 1,  12, 0);
        detective.viajarACiudadConLadron(distancia);
        detective.viajarACiudadConLadron(distancia);
        assertTrue(detective.obtenerFecha().equals(fecha));
    }

    @Test
    public void test09DetectiveEntraEnEdificioConLadronSinOrdenDeArresto(){
        Banco bancoConLadron = new Banco();
        bancoConLadron.establecerLadron(true);

        Detective detective = new DetectiveNovato();
        boolean ladronArrestado = true;

        try{
            detective.visitarEdificio(bancoConLadron, 1);
        }catch(ExcepcionLadron ex){
            ladronArrestado = detective.arrestarladron();
        }

        assertFalse(ladronArrestado);
    }

    @Test
    public void test10DetectiveObtieneOrdenDecapturaEntraEnEdificioYAtrapaLadron()
    {
        Ladron ladron1 = new Ladron();
        ladron1.establecerSexo("Masculino");
        ladron1.establecerSenia("Anillo");
        Ladron ladron2 = new Ladron();
        ladron2.establecerSexo("Masculino");
        ladron2.establecerCabello("Rojo");
        ladron2.establecerSenia("Anillo");

        Computadora computadora = new Computadora();
        computadora.agregarLadron(ladron2);

        Banco bancoConLadron = new Banco();
        bancoConLadron.establecerLadron(true);

        Detective detective = new DetectiveNovato();
        boolean ladronArrestado = false;

        LocalDateTime fecha = LocalDateTime.of(2021, 1, 1,  11, 0);

        detective.emitirOrdenDeArresto(computadora, ladron1);

        try{
            detective.visitarEdificio(bancoConLadron, 1);
        }catch(ExcepcionLadron ex){
            ladronArrestado = detective.arrestarladron();
        }

        assertTrue(detective.obtenerFecha().equals(fecha));
        assertTrue(ladronArrestado);
    }
  
    @Test
    public void test11DetectiveConRangoInvestigadorViajaDeMontrealAMexico(){
        Detective detective = new DetectiveInvestigador();
        Ciudad ciudadOrigen = new Ciudad("Montreal");
        Ciudad ciudadDestino = new Ciudad("Mexico");
        Ciudad ciudadActual = ciudadOrigen;

        ciudadActual = ciudadActual.realizarViaje(ciudadDestino, detective);

        LocalDateTime fecha = LocalDateTime.of(2021, 1, 1,  10, 0);
        assertEquals(ciudadActual.obtenerNombre(), "Mexico");
        assertTrue(detective.obtenerFecha().equals(fecha));
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

        Computadora computadora = new Computadora();
        computadora.agregarLadron(ladron);

        detective.emitirOrdenDeArresto(computadora, ladron);

        try{
            detective.visitarEdificio(bancoConLadron, 1);
        }catch(ExcepcionLadron ex){
            ladronArrestado = detective.arrestarladron();
        }

        LocalDateTime fecha = LocalDateTime.of(2021, 1, 1,  14, 0);

        assertTrue(detective.obtenerFecha().equals(fecha));
        assertTrue(ladronArrestado);
    }
}
