package presencial;

public class Main {
    public static void main(String[] args) {
        Usuario usuario= new Usuario("Jorgito");
        Seguidor seguidor= new Seguidor("Juancito");
        Seguidor seguidor2= new Seguidor("farid");
        usuario.agregarSeguidor(seguidor);
        usuario.agregarSeguidor(seguidor2);
        usuario.subirFoto(10);

        System.out.println("cantidad de notificaciones: "+seguidor.getCantidadDeNotificacion());
        System.out.println("cantidad de notificaciones: "+seguidor2.getCantidadDeNotificacion());

    }
}
