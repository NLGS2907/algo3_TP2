package edu.fiuba.algo3.modelo.pistas;

import edu.fiuba.algo3.modelo.ladron.Caracteristica;
import edu.fiuba.algo3.modelo.ladron.Ladron;
import edu.fiuba.algo3.modelo.excepciones.TipoDeCaracteristicaInexistente;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CalculadorPistaLadron {

    private ArrayList<AbstractMap.SimpleEntry<Caracteristica, Boolean>> atributosLadron;
    private Random random;
    private double probabilidadPistaLadron;

    CalculadorPistaLadron() {
        this.random = new Random(System.nanoTime());
        this.probabilidadPistaLadron = 0.30;
    }

    public String calcularPistaLadron () {

        if (random.nextFloat() < probabilidadPistaLadron) {

            if (atributosLadron.stream().filter(element -> !(element.getValue())).count() == 0) {
                atributosLadron.stream().forEach(element -> element.setValue(false));
            }

            AbstractMap.SimpleEntry atributoEntry = atributosLadron.stream().filter(element -> !(element.getValue())).findFirst().get();
            atributoEntry.setValue(true);
            Caracteristica atributo = (Caracteristica) atributoEntry.getKey();

            if (atributo.obtenerTipo().equals("Sexo")) {
                return "El sospechoso era de sexo " + atributo.obtenerValor();
            } else if (atributo.obtenerTipo().equals("Hobby")) {
                return "Se dice que al sospechoso le gusta " + atributo.obtenerValor();
            } else if (atributo.obtenerTipo().equals("Cabello")) {
                return "El cabello del sospechoso era " + atributo.obtenerValor();
            } else if (atributo.obtenerTipo().equals("Seña")) {
                return "El sujeto tenía " + atributo.obtenerValor();
            } else if (atributo.obtenerTipo().equals("Vehiculo")) {
                return "Un mendigo vio al sospechoso andando en un " + atributo.obtenerValor();
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
