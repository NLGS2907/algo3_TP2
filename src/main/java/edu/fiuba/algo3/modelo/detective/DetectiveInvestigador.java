package edu.fiuba.algo3.modelo.detective;

import edu.fiuba.algo3.modelo.edificios.Edificio;
import edu.fiuba.algo3.modelo.randomizador.RandomizadorInvestigador;

public class DetectiveInvestigador extends Detective {

    public DetectiveInvestigador(){
        super();
        this.velocidad = 1300;
        this.randomizador = new RandomizadorInvestigador();
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
        if (cantidadDeArrestos == 10) {
            return new DetectiveSargento();
        }
        return this;
    }
}
