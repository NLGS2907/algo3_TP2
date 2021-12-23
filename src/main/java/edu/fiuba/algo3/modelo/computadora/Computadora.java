package edu.fiuba.algo3.modelo.computadora;

import edu.fiuba.algo3.modelo.LectorDeLadrones;
import edu.fiuba.algo3.modelo.computadora.BaseDeDatos;
import edu.fiuba.algo3.modelo.ladron.Ladron;
import edu.fiuba.algo3.modelo.ladron.Sospechoso;
import edu.fiuba.algo3.modelo.computadora.ordenesDeArresto.OrdenDeArresto;

public class Computadora {

    private BaseDeDatos baseDeDatos;
    private Ladron ladron;

    public Computadora(){
        this.baseDeDatos = new BaseDeDatos();
        this.ladron = new Sospechoso();

        LectorDeLadrones lector = new LectorDeLadrones("src/main/java/edu/fiuba/algo3/config/ladrones.json");
        lector.cargarLadrones(this);
    }

    public void establecerSospechoso(Ladron sospechoso) {
        this.ladron = sospechoso;
    }

    public void establecerSexo(String sexo){
        this.ladron.establecerSexo(sexo);
    }

    public void establecerHobby(String hobby){
        this.ladron.establecerHobby(hobby);
    }

    public void establecerCabello(String pelo){
        this.ladron.establecerCabello(pelo);
    }

    public void establecerSenia(String senia){
        this.ladron.establecerSenia(senia);
    }

    public void establecerVehiculo(String vehiculo){
        this.ladron.establecerVehiculo(vehiculo);
    }

    public OrdenDeArresto emitirOrdenDeArresto(){
        return this.baseDeDatos.buscarLadron(this.ladron);
    }

    public void agregarLadron(Ladron ladron){
        this.baseDeDatos.agregarLadron(ladron);
    }
}
