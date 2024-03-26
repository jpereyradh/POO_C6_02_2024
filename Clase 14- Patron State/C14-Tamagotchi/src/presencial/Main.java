package presencial;

public class Main {
    public static void main(String[] args) {
        Tamagotchi tamagotchi= new Tamagotchi(); //se comenzo hambriento
        System.out.println("estado inicial: "+tamagotchi.getEstadoActual());
        tamagotchi.darDeComer();
        System.out.println("Estado actual: "+tamagotchi.getEstadoActual()); //se puso feliz


        System.out.println("********************** prueba de beber******************");
        tamagotchi.darBeber();
        System.out.println("estado: "+tamagotchi.getEstadoActual());
        tamagotchi.darBeber();
        System.out.println("estado: "+tamagotchi.getEstadoActual());
        tamagotchi.darBeber();
        System.out.println("estado: "+tamagotchi.getEstadoActual());
    }
}
