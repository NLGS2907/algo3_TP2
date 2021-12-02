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

    public void viajarACiudadConLadron(int distancia){
        int horasDeRecuperacion;
        if(this.contadorDeCuchillazos == 0)
            horasDeRecuperacion = 2;
        else horasDeRecuperacion = 1;
        this.reloj.avanzarTiempo((int)distancia/900);
        this.reloj.avanzarTiempo(horasDeRecuperacion);
        this.contadorDeCuchillazos++;
    }
}
