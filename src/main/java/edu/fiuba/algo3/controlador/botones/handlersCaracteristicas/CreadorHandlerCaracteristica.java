package edu.fiuba.algo3.controlador.botones.handlersCaracteristicas;

import edu.fiuba.algo3.modelo.excepciones.TipoDeCaracteristicaInexistente;
import edu.fiuba.algo3.modelo.ladron.Caracteristica;
import edu.fiuba.algo3.vista.etiquetas.Etiqueta;
import javafx.geometry.Pos;

public class CreadorHandlerCaracteristica {
    private static CreadorHandlerCaracteristica instancia = null;

    private CreadorHandlerCaracteristica() {
        super();

    }

    public static void crearCreadorHandlerCaracteristica() {
        if (instancia == null) {
            instancia = new CreadorHandlerCaracteristica();
        }
    }

    public static CreadorHandlerCaracteristica obtenerInstancia() {
        if (instancia == null) {
            crearCreadorHandlerCaracteristica();
        }
        return instancia;
    }

    public HandlerCambiarCaracteristica crearHandler(Caracteristica caracteristica){
        //System.out.println(caracteristica.obtenerTipo());
        if(caracteristica.obtenerTipo().equals("Sexo"))
            return new HandlerCambiarSexo(caracteristica);
        else if(caracteristica.obtenerTipo().equals("Hobby"))
            return new HandlerCambiarHobby(caracteristica);
        else if(caracteristica.obtenerTipo().equals("Cabello"))
            return new HandlerCambiarCabello(caracteristica);
        else if(caracteristica.obtenerTipo().equals("Seña"))
            return new HandlerCambiarSenia(caracteristica);
        else if(caracteristica.obtenerTipo().equals("Vehiculo"))
            return new HandlerCambiarVehiculo(caracteristica);
        else throw new TipoDeCaracteristicaInexistente("Caracteristica de tipo inválido.");
    }

}
