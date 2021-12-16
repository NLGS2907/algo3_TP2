package edu.fiuba.algo3.modelo;

import java.math.*;

public class DetectiveDetective extends Detective {

    DetectiveDetective(){
        super();
        this.velocidad = 1100;
    }

    @Override
    public String visitarEdificio(Edificio edificio, int horas){
        this.reloj.avanzarTiempo(horas);
        return edificio.desplegarPista();
    }

    public void viajar(int distancia){
        this.reloj.avanzarTiempo((int) Math.round(distancia/this.velocidad));
    }

    public void viajarACiudadConLadron(int distancia){
        this.cantidadDeCuchillazos = this.cantidadDeCuchillazos.acuchillar(this.reloj);
        this.reloj.avanzarTiempo((int) Math.round(distancia/this.velocidad));
    }

    @Override
    public Detective incrementarArresto() {
        this.cantidadDeArrestos++;
        if (cantidadDeArrestos == 5) {
            return new DetectiveInvestigador();
        }
        return this;
    }
}
