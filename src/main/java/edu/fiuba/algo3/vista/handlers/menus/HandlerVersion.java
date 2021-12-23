package edu.fiuba.algo3.vista.handlers.menus;

public class HandlerVersion extends HandlerSubEscena {

    @Override
    public String getTitulo() {
        return "Versión";
    }

    @Override
    public String getInfo() {
        return "VERSIÓN DEL JUEGO:\n" +
                "Actualmente estás jugando la versión:\n" +
                "v0.0.1 (alpha)";
    }
}
