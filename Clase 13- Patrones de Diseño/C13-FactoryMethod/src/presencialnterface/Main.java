package presencialnterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("***********Calculadora de Salario************");
        System.out.println("Ingrese el tipo de empleado a calcular: ");
        String tipo= scanner.nextLine();
        System.out.println("Cuantos dias trabajo dicho empleado: ?");
        int dias= scanner.nextInt();

        try{
            if(tipo.equalsIgnoreCase("EMP-RD")){
                EmpleadoFactory factoryRD= new EmpleadoRelacionDependenciaFactory();
                Empleado empleadoRD= factoryRD.crearEmpleado(tipo);
                System.out.println("Salario a liquidar: "+empleadoRD.calcularSueldo(dias));


            } else if ("EMP-PH".equalsIgnoreCase(tipo)) {
                EmpleadoFactory factoryPH= new EmpleadoPorHoraFactory();
                Empleado empleadoPH= factoryPH.crearEmpleado(tipo);
                System.out.println("Salario a liquidar: "+empleadoPH.calcularSueldo(dias));
            }else{
                throw new IllegalArgumentException("exception");
            }
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }


        scanner.close();
    }
}
