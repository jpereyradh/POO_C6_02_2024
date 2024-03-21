package presencialnterface;

public abstract class Empleado {
    private String apellido, nombre;
    private  int legajo;


    public abstract double calcularSueldo(int dias);
}
