package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Computadora {
    
    private ArrayList<Ladron> listaLadrones;

    public Computadora(){
        this.listaLadrones = new ArrayList<Ladron>();
    }

    private boolean buscarLadronIdentico(Ladron ladronBuscado)
    {
        long cantidadSospechosos =  this.listaLadrones.stream().filter(elemento->elemento.esIgualA(ladronBuscado)).count();
        return cantidadSospechosos > 0;
    }

    public boolean buscarLadron(Ladron ladronBuscado)
    {
        //long cantidadSospechosos =  this.listaLadrones.stream().filter(elemento->elemento.esSimilar(ladronBuscado)).count();
        Stream<Ladron> listaFiltrada =  this.listaLadrones.stream().filter(elemento->elemento.esSimilarA(ladronBuscado));
        // espacio para mostrar los distintos ladrones
        
        long cantidadSospechosos = listaFiltrada.count();
        return cantidadSospechosos == 1;
    }

    public void agregarLadron (Ladron ladronBuscado)
    {
        if(!buscarLadronIdentico(ladronBuscado))
            this.listaLadrones.add(ladronBuscado);
    }
}
