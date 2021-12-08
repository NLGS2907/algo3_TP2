package edu.fiuba.algo3.modelo.cuchillazo;

import edu.fiuba.algo3.modelo.Reloj;

public class SinAcuchillar implements Cuchillazo{
    public Cuchillazo acuchillar(Reloj reloj){
        reloj.avanzarTiempo(2);
        return new Acuchillado();
    }
}