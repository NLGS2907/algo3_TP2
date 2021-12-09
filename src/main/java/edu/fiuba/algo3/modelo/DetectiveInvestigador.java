package edu.fiuba.algo3.modelo;

import java.math.*;

public class DetectiveInvestigador extends Detective {

    DetectiveInvestigador(){
        super();
    }

    @Override
    public String visitarEdificio(Edificio edificio, int horas){
        this.reloj.avanzarTiempo(horas);
        return edificio.desplegarPista();
    }

    public void viajar(int distancia){
        this.reloj.avanzarTiempo((int) Math.round(distancia/1300.0));
    }

    public void viajarACiudadConLadron(int distancia){
        this.cantidadDeCuchillazos = this.cantidadDeCuchillazos.acuchillar(this.reloj);
        this.reloj.avanzarTiempo((int) Math.round(distancia/1300.0));
    }
}
