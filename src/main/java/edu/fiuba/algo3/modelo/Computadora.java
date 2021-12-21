package edu.fiuba.algo3.modelo;

public class Computadora {

    private BaseDeDatos baseDeDatos;
    private Ladron ladron;

    public Computadora(){
        this.baseDeDatos = new BaseDeDatos();
        this.ladron = new Sospechoso();
    }

    public void establecerSexo(String sexo){
        this.ladron.establecerSexo(sexo);
    }

    public void establecerHobby(String hobby){
        this.ladron.establecerHobby(hobby);
    }

    public void establecerPelo(String pelo){
        this.ladron.establecerCabello(pelo);
    }

    public void establecerSeña(String senia){
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
