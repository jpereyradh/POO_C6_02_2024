package mod2;



public class Cliente {
    public static void main(String[] args) {

        Usuario usuario= new Usuario("Jorgito");
        Seguidor seguidor= new Seguidor("Juancito");
        Seguidor seguidor2= new Seguidor("Leonardo");
        usuario.addObserver(seguidor);
        usuario.addObserver(seguidor2);
        usuario.subirFoto();

    }
}
