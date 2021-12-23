package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class BaseDeDatos {
    
    private ArrayList<Ladron> listaLadrones;

    public BaseDeDatos(){
        this.listaLadrones = new ArrayList<Ladron>();
    }

    private boolean buscarLadronIdentico(Ladron ladronBuscado)
    {
        long cantidadSospechosos =  this.listaLadrones.stream().filter(elemento->elemento.esIgualA(ladronBuscado)).count();
        return cantidadSospechosos > 0;
    }

    public OrdenDeArresto buscarLadron(Ladron ladronBuscado)
    {
        Stream<Ladron> listaFiltrada =  this.listaLadrones.stream().filter(elemento->elemento.esSimilarA(ladronBuscado));
        
        long cantidadSospechosos = listaFiltrada.count();
        listaFiltrada =  this.listaLadrones.stream().filter(elemento->elemento.esSimilarA(ladronBuscado));

        if(cantidadSospechosos == 1){
            return new OrdenValida(listaFiltrada.findFirst().get());
        }
        return new OrdenInvalida();
    }

    public void agregarLadron (Ladron ladronBuscado)
    {
        if(!buscarLadronIdentico(ladronBuscado))
            this.listaLadrones.add(ladronBuscado);
    }
}
