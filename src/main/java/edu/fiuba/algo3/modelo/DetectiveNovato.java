package edu.fiuba.algo3.modelo;

import java.math.*;

public class DetectiveNovato extends Detective {

    DetectiveNovato(){
        super();
    }

    @Override
    public String visitarEdificio(Edificio edificio, int horas){
        this.reloj.avanzarTiempo(horas);
        return edificio.desplegarPista();
    }

    public void viajar(int distancia){
        this.reloj.avanzarTiempo((int) Math.round(distancia/900.0));
    }

    public void viajarACiudadConLadron(int distancia){
        this.cantidadDeCuchillazos = this.cantidadDeCuchillazos.acuchillar(this.reloj);
        this.reloj.avanzarTiempo((int) Math.round(distancia/900.0));
    }

    @Override
    public Detective incrementarArresto() {
        this.cantidadDeArrestos++;
        if (cantidadDeArrestos == 5) {
            return new DetectiveDetective();
        }
        return this;
    }
}
