package edu.fiuba.algo3.modelo.ladron;

import edu.fiuba.algo3.modelo.detective.Detective;

import java.util.ArrayList;

public abstract class Ladron {
    
    String nombre;
    ArrayList<Caracteristica> caracteristicas;

    public Ladron(){
        this.nombre = "";
        caracteristicas = new ArrayList<Caracteristica>();
        //caracteristicas.add(new Caracteristica("Nombre"));
        caracteristicas.add(new Caracteristica("Sexo"));
        caracteristicas.add(new Caracteristica("Hobby"));
        caracteristicas.add(new Caracteristica("Cabello"));
        caracteristicas.add(new Caracteristica("Seña"));
        caracteristicas.add(new Caracteristica("Vehiculo"));
    }

    private void establecerCaracteristica(String tipo, String valor){
        Caracteristica caracteristicaAuxiliar = new Caracteristica(tipo, valor);
        caracteristicas.stream().filter(elemento -> elemento.compararTipo(caracteristicaAuxiliar)).forEach(elemento -> elemento.establecerValor(valor));
    }

    private boolean buscarCaracteristicaSimilarEnLadron(ArrayList<Caracteristica> caracteristicas, Caracteristica caracteristicaABuscar)
    {
        long cantidad = caracteristicas.stream().filter(elemento -> caracteristicaABuscar.esUna(elemento)).count();
        return cantidad > 0;
    }

    private boolean buscarCaracteristicaExactaEnLadron(ArrayList<Caracteristica> caracteristicas, Caracteristica caracteristicaABuscar)
    {
        long cantidad = caracteristicas.stream().filter(elemento -> caracteristicaABuscar.compararManeraExacta(elemento)).count();
        return cantidad > 0;
    }

    public void establecerNombre(String nombre){
        this.nombre = nombre;
    }

    public void establecerSexo(String sexo){
        establecerCaracteristica("Sexo", sexo);
    }

    public void establecerHobby(String hobby){
        establecerCaracteristica("Hobby", hobby);
    }

    public void establecerCabello(String cabello){
        establecerCaracteristica("Cabello", cabello);
    }

    public void establecerSenia(String senia){
        establecerCaracteristica("Seña", senia);
    }
    
    public void establecerVehiculo(String vehiculo){
        establecerCaracteristica("Vehiculo", vehiculo);
    }

    public ArrayList<Caracteristica> obtenerCaracteristicas(){
        return caracteristicas;
    }

    public String obtenerNombre(){
        return this.nombre;
    }

    public Caracteristica obtenerSexo(){
        Caracteristica caracteristicaAuxiliar = new Caracteristica("Sexo", "nada");
        return this.caracteristicas.stream().filter(elemento -> elemento.compararTipo(caracteristicaAuxiliar)).findFirst().get();
    }
    public Caracteristica obtenerHobby(){
        Caracteristica caracteristicaAuxiliar = new Caracteristica("Hobby", "nada");
        return this.caracteristicas.stream().filter(elemento -> elemento.compararTipo(caracteristicaAuxiliar)).findFirst().get();
    }

    public Caracteristica obtenerCabello(){
        Caracteristica caracteristicaAuxiliar = new Caracteristica("Cabello", "nada");
        return this.caracteristicas.stream().filter(elemento -> elemento.compararTipo(caracteristicaAuxiliar)).findFirst().get();
    }

    public Caracteristica obtenerSenia(){
        Caracteristica caracteristicaAuxiliar = new Caracteristica("Seña", "nada");
        return this.caracteristicas.stream().filter(elemento -> elemento.compararTipo(caracteristicaAuxiliar)).findFirst().get();
    }

    public Caracteristica obtenerVehiculo(){
        Caracteristica caracteristicaAuxiliar = new Caracteristica("Vehiculo", "nada");
        return this.caracteristicas.stream().filter(elemento -> elemento.compararTipo(caracteristicaAuxiliar)).findFirst().get();
    }


    public boolean esSimilarA(Ladron ladron){
        long cantidadMismatches = this.caracteristicas.stream().filter(elemento -> !buscarCaracteristicaSimilarEnLadron(ladron.caracteristicas,elemento)).count();
        return cantidadMismatches == 0;
    }

    public boolean esIgualA(Ladron ladron){
        long cantidadMismatches = this.caracteristicas.stream().filter(elemento -> !buscarCaracteristicaExactaEnLadron(ladron.caracteristicas,elemento)).count();
        return cantidadMismatches == 0;
    }
    
    public abstract void encontrar(Detective detective);
    
}
