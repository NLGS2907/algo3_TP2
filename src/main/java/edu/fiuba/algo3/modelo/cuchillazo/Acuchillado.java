package edu.fiuba.algo3.modelo.cuchillazo;

import edu.fiuba.algo3.modelo.Reloj;

public class Acuchillado implements Cuchillazo {
    public Cuchillazo acuchillar(Reloj reloj){
        reloj.avanzarTiempo(1);
        return this;
    }
}
