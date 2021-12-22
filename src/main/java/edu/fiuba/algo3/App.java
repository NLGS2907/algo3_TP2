package edu.fiuba.algo3;

import edu.fiuba.algo3.vista.Interfaz;
import edu.fiuba.algo3.vista.imagenes.IconoAlgoThief;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("-=  AlgoThief  =-");
        Interfaz interfaz = new Interfaz();
        stage.setScene(interfaz.getEscena());
        stage.setResizable(false);
        stage.getIcons().add(new IconoAlgoThief());
        stage.sizeToScene();
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
