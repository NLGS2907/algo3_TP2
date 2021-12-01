package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ciudad {

    private String nombre;
    private ArrayList<Edificio> edificios;
    private int contadorVisitas;

    Ciudad(String nombre){
        this.edificios = new ArrayList<Edificio>();
        this.contadorVisitas = 0;
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public void visitarEdificio(Detective detective, int numeroEdificio){
        if(this.contadorVisitas < 3){
            this.contadorVisitas++;
        }
        detective.visitarEdificio(edificios.get(numeroEdificio), this.contadorVisitas);
    }

    public void agregarEdificio(Edificio edificio){
        this.edificios.add(edificio);
    }
}
