package edu.fiuba.algo3;

import edu.fiuba.algo3.vista.Interfaz;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Algo3 TP2");
        /*var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var botonazo = new Button();
        botonazo.setText("Soy un botón!!");
        var miHandler = new HandlerDePrueba(botonazo);
        botonazo.setOnAction(miHandler);
        var layout = new StackPane(label, botonazo);
        var scene = new Scene(layout, 640, 480);*/
        Interfaz interfaz = new Interfaz();
        stage.setScene(interfaz.getEscena());
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}