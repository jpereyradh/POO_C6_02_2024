package presencial;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("******Bienvenidos al sistema Censo******");
        System.out.println("Ingrese su nombre: ");
        String nombre= scanner.nextLine();
        char inicial= primeraLetra(nombre);
        char ultimo= ultimaLetra(nombre);
        System.out.println("Fecha de Nacimiento: ");
        String fecha= scanner.nextLine();
        System.out.println("Ingrese su Edad: ");
        int edad= scanner.nextInt();
        System.out.println("Ingrese su altura: ");
        Double altura= scanner.nextDouble();
        scanner.close();
        System.out.println("Los datos ingresados son: ");
        System.out.println(nombre+", "+edad+", "+altura+" ,"+fecha);
        System.out.println("Inicial: "+inicial);
        System.out.println("ultima letra: "+ultimo);

    }
    public static char primeraLetra(String nombre){
        return nombre.charAt(0);
    }
    //generar un metodo que permita conocer el ultimo caracter
     // EJ : J O R G I T O = 7
         //  0 1 2 3 4 5 6 = -1
    public static char ultimaLetra(String nombre){
        return nombre.charAt(nombre.length()-1);
    }
}