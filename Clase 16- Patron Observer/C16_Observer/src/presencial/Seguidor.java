package presencial;

public class Seguidor implements SujetoObservador {
    private String nombre;
    private int cantidadDeNotificacion=0;

    public Seguidor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println(nombre+ " fue notificado: "+mensaje);
        cantidadDeNotificacion++;
    }

    public int getCantidadDeNotificacion() {
        System.out.println("La cantidad de notificaciones es: ");
        return cantidadDeNotificacion;
    }
}
