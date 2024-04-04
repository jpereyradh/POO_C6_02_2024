package mod2;

import presencial.SujetoObservador;

import java.util.Observable;
import java.util.Observer;

public class Seguidor implements Observer {
    private String nombre;
    private int cantidadDeNotificacion=0;

    public Seguidor(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDeNotificacion() {
        System.out.println("La cantidad de notificaciones es: ");
        return cantidadDeNotificacion;
    }

    @Override
    public void update(Observable o, Object arg) {
        String mensaje= (String)arg;
        System.out.println(nombre+ " fue notificado: "+mensaje);
        cantidadDeNotificacion++;
            }
}
