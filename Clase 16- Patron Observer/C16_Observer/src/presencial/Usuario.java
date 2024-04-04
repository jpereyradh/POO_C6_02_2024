package presencial;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements SujetoObservable {
    private String nombre;
    private List<SujetoObservador> seguidores= new ArrayList<>();

    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    public void agregarSeguidor(SujetoObservador seguidor){
        seguidores.add(seguidor);
    }
    public void eliminarSeguidor(SujetoObservador sujeto){
        seguidores.remove(sujeto);
    }
    public void subirFoto(int n){
        int cantidad=0;
        for (int i = 0; i <n ; i++) {
            String mensaje= nombre+" subio una foto: "+" numero de foto: "+i;
            actualizar(mensaje);
        }


    }

    @Override
    public void actualizar(String mensaje) {
        for (SujetoObservador seguidor : seguidores) {
            seguidor.notificar(mensaje);

        }

    }
}
