package edu.fiuba.algo3.modelo;

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
        this.reloj.avanzarTiempo((int)distancia/900);
    }
}
