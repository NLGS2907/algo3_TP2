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
    private ArrayList<SimpleEntry<Caracteristica, Boolean>> atributosLadron;
    private Random random;

    //private ArrayList<Caracteristica> caracteristicas;<boolean usada, Caracteristica caracteristica>

    private ContenedorDePistas(Map<String, PistasDeCiudad> pistas) {
        this.pistas = pistas;
        this.random = new Random(System.nanoTime());
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
        String pistaLadron = calcularPistaLadron();
        return pistaEdificio + pistaLadron;
    }

    private String calcularPistaLadron () {

        if(atributosLadron.stream().filter(element -> !(element.getValue())).count() == 0){
            atributosLadron.stream().forEach(element -> element.setValue(true));
            return "";
        }

        SimpleEntry atributoEntry = atributosLadron.stream().filter(element -> !(element.getValue())).findFirst().get();
        atributoEntry.setValue(true);
        Caracteristica atributo = (Caracteristica) atributoEntry.getKey();

        if (atributo.obtenerTipo().equals("Sexo")) {
            return "El sospechoso era de sexo " + atributo.obtenerValor();
        } else if (atributo.obtenerTipo().equals("Hobby")) {
            return "Se dice que al sospechoso le gusta" + atributo.obtenerValor();
        } else if (atributo.obtenerTipo().equals("Cabello")) {
            return "El cabello del sospechoso era" + atributo.obtenerValor();
        } else if (atributo.obtenerTipo().equals("Seña")) {
            return "El sujeto tenía" + atributo.obtenerValor();
        } else if (atributo.obtenerTipo().equals("Vehiculo")) {
            return "Un mendigo vio al sospechoso andando en un" + atributo.obtenerValor();
        } else {
            throw new TipoDeCaracteristicaInexistente("El ladron tiene una caracteristica invalida");
        }
    }

    public void cargarAtributos(Ladron ladron) {
        this.atributosLadron = new ArrayList<>();

        this.atributosLadron.add(new SimpleEntry(ladron.obtenerSexo(), false));
        this.atributosLadron.add(new SimpleEntry(ladron.obtenerHobby(), false));
        this.atributosLadron.add(new SimpleEntry(ladron.obtenerCabello(), false));
        this.atributosLadron.add(new SimpleEntry(ladron.obtenerSenia(), false));
        this.atributosLadron.add(new SimpleEntry(ladron.obtenerVehiculo(), false));

        Collections.shuffle(this.atributosLadron);
    }

    ////// TEST //////
    public static ContenedorDePistas obtenerInstanciaTEST() throws ContenedorNoExiste {
        if (instancia == null) {
            LectorDePistas lector = new LectorDePistas("src/main/java/edu/fiuba/algo3/config/pistas.json");
            lector.cargarPistas();

            Ladron ladron= new Sospechoso();
            instancia.cargarAtributos(ladron);
        }
        return instancia;
    }

}
