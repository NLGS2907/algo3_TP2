package edu.fiuba.algo3.modelo.detective;

import edu.fiuba.algo3.modelo.edificios.Edificio;

public class DetectiveSargento extends Detective {

    public DetectiveSargento(){
        super();
        this.velocidad = 1500;
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
        return this;
    }

}
