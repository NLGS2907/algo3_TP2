package edu.fiuba.algo3.controlador.menus;

import edu.fiuba.algo3.vista.SubEscenario;
import edu.fiuba.algo3.vista.contenedores.MensajeAbout;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerFuente implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        MensajeAbout mensajeAbout = new MensajeAbout("FUENTE UTILIZADA:\n" +
                                                     "'Minecraftia-Regular', por Andrew Tyler");
        SubEscenario subEscenario = new SubEscenario("Créditos de Fuente", mensajeAbout);
        subEscenario.setOnHidden(e -> {
            mensajeAbout.terminarAnimacion(); // Para que no siga actualizándose ni reproduciendo sonidos.
        });
        subEscenario.show();
    }
}
