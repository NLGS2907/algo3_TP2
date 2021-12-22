package edu.fiuba.algo3.vista.animaciones;

import edu.fiuba.algo3.vista.etiquetas.Etiqueta;
import javafx.animation.AnimationTimer;

public class AnimacionTexto extends AnimationTimer {

    String textoOriginal;
    int indiceActual;
    Etiqueta etiqueta;

    public AnimacionTexto(String texto, int tamanio) {
        this.textoOriginal = texto;
        this.indiceActual = 0;
        this.etiqueta = new Etiqueta(this.textoOriginal, tamanio);
        start();
    }

    private boolean terminoAnimacion() {
        return this.indiceActual > this.textoOriginal.length();
    }

    @Override
    public void handle(long now) {
        if (this.terminoAnimacion()) {
            stop();
            return;
        }
        String textoAMostrar = this.textoOriginal.substring(0, this.indiceActual);
        this.etiqueta.setText(textoAMostrar);
        this.indiceActual++;
    }

    public Etiqueta getEtiqueta() {
        return this.etiqueta;
    }
}
