package MesaTrabajo;

public class Main {
    public static void main(String[] args) {
        Nave nave= new Nave(10,20,'N',1.5);
        System.out.println("Posición inicial: "+nave.toString());

        nave.irA(15,25,'S');
        System.out.println("Nueva posición: "+nave.toString());
    }
}
