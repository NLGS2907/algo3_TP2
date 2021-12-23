package edu.fiuba.algo3.modelo.pistas;

import edu.fiuba.algo3.modelo.Caracteristica;
import edu.fiuba.algo3.modelo.Ladron;
import edu.fiuba.algo3.modelo.Sospechoso;
import edu.fiuba.algo3.modelo.excepciones.ContenedorNoExiste;
import edu.fiuba.algo3.modelo.excepciones.TipoDeCaracteristicaInexistente;

import java.util.*;
import java.util.AbstractMap.SimpleEntry;

public class ContenedorDePistas {

    private static ContenedorDePistas instancia = null;

    private Map<String, PistasDeCiudad> pistas;
    private CalculadorPistaLadron calculadorPistaLadron;

    private ContenedorDePistas(Map<String, PistasDeCiudad> pistas) {
        this.pistas = pistas;
        this.calculadorPistaLadron = new CalculadorPistaLadron();
    }

    public static void crearContenedorDePistas(Map<String, PistasDeCiudad> pistas) {
        if (instancia == null) {
            instancia = new ContenedorDePistas(pistas);
        }
    }

    public static ContenedorDePistas obtenerInstancia() throws ContenedorNoExiste {
        if (instancia == null) {
            LectorDePistas lector = new LectorDePistas("src/main/java/edu/fiuba/algo3/config/pistas.json");
            lector.cargarPistas();
        }
        return instancia;
    }

    public String leerPista(String dificultad, String ciudad, String tipoDeEdificio) {
        String pistaEdificio =  pistas.get(dificultad).leerPista(ciudad, tipoDeEdificio);
        return pistaEdificio; /*+ instancia.calculadorPistaLadron.calcularPistaLadron();*/
    }

    public void cargarPistasLadron(Ladron ladron) {
        this.calculadorPistaLadron.cargarAtributos(ladron);
    }

    ////// TEST //////
    public static ContenedorDePistas obtenerInstanciaTEST() throws ContenedorNoExiste {
        if (instancia == null) {
            LectorDePistas lector = new LectorDePistas("src/main/java/edu/fiuba/algo3/config/pistas.json");
            lector.cargarPistas();

            Ladron ladron= new Sospechoso();
            instancia.calculadorPistaLadron.cargarAtributos(ladron);
        }
        return instancia;
    }

}
