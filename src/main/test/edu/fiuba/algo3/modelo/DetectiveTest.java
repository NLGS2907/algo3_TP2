package edu.fiuba.algo3.modelo;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        Ciudad montreal = new Ciudad("Montreal");
        Mapa mapa = new Mapa(montreal);
        Detective detective = new DetectiveNovato();
        Ciudad mexico = new Ciudad("Mexico");
        LocalDateTime fecha = LocalDateTime.of(2021, 1, 1,  11, 0);
        mapa.realizarViaje(mexico, detective);
        assertEquals(mapa.ciudadActual(), "Mexico");
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
        assertEquals(enCurso, false);
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
    public void test09DetectiveConRangoInvestigadorViajaDeMontrealAMexico(){
        Detective detective = new DetectiveInvestigador();
        Ciudad ciudadOrigen = new Ciudad("Montreal");
        Ciudad ciudadDestino = new Ciudad("Mexico");
        Mapa mapa = new Mapa(ciudadOrigen);
        mapa.cargarMapa();
        mapa.realizarViaje(ciudadDestino, detective);

        LocalDateTime fecha = LocalDateTime.of(2021, 1, 1,  10, 0);
        assertEquals(mapa.ciudadActual(), "Mexico");
        assertTrue(detective.obtenerFecha().equals(fecha));



    }
}
