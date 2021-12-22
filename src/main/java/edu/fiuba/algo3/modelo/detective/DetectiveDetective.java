package edu.fiuba.algo3.modelo.detective;

import edu.fiuba.algo3.modelo.edificios.Edificio;

public class DetectiveDetective extends Detective {

    public DetectiveDetective(){
        super();
        this.velocidad = 1100;
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
