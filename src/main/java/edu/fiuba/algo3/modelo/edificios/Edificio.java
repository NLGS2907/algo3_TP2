package edu.fiuba.algo3.modelo.edificios;

import edu.fiuba.algo3.modelo.Ciudad;
import edu.fiuba.algo3.modelo.Ladron;
import edu.fiuba.algo3.modelo.NoLadron;
import edu.fiuba.algo3.modelo.Sospechoso;
import edu.fiuba.algo3.modelo.detective.Detective;

public class Edificio {

    protected Ladron ladron;
    protected String nombre;
    protected String tipo;


    public Edificio(String nombre, String tipo){
        this.ladron = new NoLadron();
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Boolean encontrarLadron(){
        return this.ladron.getClass() == Sospechoso.class;
    }

    public void establecerLadron(Ladron ladron){
        this.ladron = ladron;
    }





    public String obtenerTipo(){
        return this.tipo;
    }

    public void visitar(Detective detective, int horas){
        this.ladron.encontrar(detective);
    }



}
