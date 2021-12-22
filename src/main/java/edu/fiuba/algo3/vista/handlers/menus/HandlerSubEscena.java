package edu.fiuba.algo3.vista.handlers.menus;

import edu.fiuba.algo3.vista.SubEscenario;
import edu.fiuba.algo3.vista.contenedores.MensajeAbout;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public abstract class HandlerSubEscena implements EventHandler<ActionEvent> {

    public abstract String getTitulo();

    public abstract String getInfo();

    @Override
    public void handle(ActionEvent actionEvent) {
        SubEscenario subEscenario = new SubEscenario(this.getTitulo(), new MensajeAbout(this.getInfo()));
        subEscenario.show();
    }
}
