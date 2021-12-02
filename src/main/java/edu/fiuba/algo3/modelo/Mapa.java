package edu.fiuba.algo3.modelo;

public class Mapa {

    private Ciudad ciudadActual;

    Mapa(Ciudad ciudad){
        this.ciudadActual = ciudad;
    }

    public void realizarViaje(Ciudad destino, Detective detective) {
        int distancia = this.calcularDistancia(destino);
        detective.viajar(distancia);
        this.ciudadActual = destino;
    }

    private int calcularDistancia(Ciudad ciudad){
        return 3725;
    }

    public String ciudadActual() {
        return this.ciudadActual.obtenerNombre();
    }
}
