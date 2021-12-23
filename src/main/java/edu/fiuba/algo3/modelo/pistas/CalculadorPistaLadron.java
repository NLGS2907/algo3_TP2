package edu.fiuba.algo3.modelo.pistas;

import edu.fiuba.algo3.modelo.LectorDePistasLadron;
import edu.fiuba.algo3.modelo.ladron.Caracteristica;
import edu.fiuba.algo3.modelo.ladron.Ladron;
import edu.fiuba.algo3.modelo.excepciones.TipoDeCaracteristicaInexistente;

import java.util.*;

public class CalculadorPistaLadron {

    private ArrayList<AbstractMap.SimpleEntry<Caracteristica, Boolean>> atributosLadron;
    private Random random;
    private double probabilidadPistaLadron;
    private Map<String, String> pistasLadron;

    CalculadorPistaLadron() {
        this.random = new Random(System.nanoTime());
        this.probabilidadPistaLadron = 0.30;
        LectorDePistasLadron lector = new LectorDePistasLadron("src/main/java/edu/fiuba/algo3/config/pistasLadron.json");
        this.pistasLadron = lector.cargarPistasLadron();
    }

    public String calcularPistaLadron () {

        if (random.nextFloat() < probabilidadPistaLadron) {

            if (atributosLadron.stream().filter(element -> !(element.getValue())).count() == 0) {
                atributosLadron.stream().forEach(element -> element.setValue(false));
            }

            AbstractMap.SimpleEntry atributoEntry = atributosLadron.stream().filter(element -> !(element.getValue())).findFirst().get();
            atributoEntry.setValue(true);
            Caracteristica atributo = (Caracteristica) atributoEntry.getKey();

            if (pistasLadron.get(atributo.obtenerTipo()) != null) {
                return pistasLadron.get(atributo.obtenerTipo()) + atributo.obtenerTipo();
            } else {
                throw new TipoDeCaracteristicaInexistente("El ladron tiene una caracteristica invalida");
            }

        } else {
            return "";
        }
    }

    public void cargarAtributos(Ladron ladron) {
        this.atributosLadron = new ArrayList<>();

        this.atributosLadron.add(new AbstractMap.SimpleEntry(ladron.obtenerSexo(), false));
        this.atributosLadron.add(new AbstractMap.SimpleEntry(ladron.obtenerHobby(), false));
        this.atributosLadron.add(new AbstractMap.SimpleEntry(ladron.obtenerCabello(), false));
        this.atributosLadron.add(new AbstractMap.SimpleEntry(ladron.obtenerSenia(), false));
        this.atributosLadron.add(new AbstractMap.SimpleEntry(ladron.obtenerVehiculo(), false));

        Collections.shuffle(this.atributosLadron);
    }
}
