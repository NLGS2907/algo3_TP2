package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.vista.bordes.BordeBlanco;
import edu.fiuba.algo3.vista.bordes.BordeNegro;
import javafx.scene.layout.BorderImage;

public class BotonBlanco extends BotonDeColor {

    public BotonBlanco() {
        super("", true);
    }

    public BotonBlanco(String titulo) {
        super(titulo, true);
    }

    public BotonBlanco(String titulo, boolean conBorde) {
        super(titulo, conBorde);
    }

    @Override
    public String getColorFondo() {
        return "transparent";
    }

    @Override
    public String getColorFill() {
        return "#000000";
    }

    @Override
    public BorderImage getTipoBorde() {
        return new BordeBlanco(7);
    }
}
