package edu.fiuba.algo3.vista.cajas;

import edu.fiuba.algo3.vista.contenedores.LocacionYFecha;
import edu.fiuba.algo3.vista.imagenes.ImagenTeclado;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

public class CajaLugarYFecha extends VBox {
    private static CajaLugarYFecha instancia = null;

    private CajaLugarYFecha() {
        super(5);

    }

    public static CajaLugarYFecha obtenerInstancia() {
        if (instancia == null) {
            instancia = new CajaLugarYFecha();
        }
        return instancia;
    }

    public static void crearCajaLugarYFecha() {
        if (instancia == null) {
            instancia = new CajaLugarYFecha();
        }
    }

    public CajaLugarYFecha mostrarLugarYTiempo(){
        this.getChildren().setAll(LocacionYFecha.obtenerInstancia().mostrarLugarYTiempo(), new ImagenTeclado());
        this.setPadding(new Insets(1.5));
        this.setAlignment(Pos.CENTER_LEFT);
        return instancia;
    }
}
