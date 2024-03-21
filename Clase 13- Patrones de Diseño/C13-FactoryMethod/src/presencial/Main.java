package presencial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("***********Calculadora de Salario************");
        System.out.println("Ingrese el tipo de empleado a calcular: ");
        String tipo= scanner.nextLine();
        try{
            Empleado empleado= EmpleadoFactory.crearEmpleado(tipo);
            System.out.println("Cuantos dias trabajo dicho empleado: ?");
            int dias= scanner.nextInt();
            System.out.println("Salario a liquidar: "+empleado.calcularSueldo(dias));
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }


        scanner.close();
    }
}
