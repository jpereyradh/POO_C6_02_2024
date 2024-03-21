package presencialnterface;

public class EmpleadoRelacionDeDependencia extends Empleado {
    private double sueldoMensual;

    public EmpleadoRelacionDeDependencia(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo(int dias) {
        System.out.println("salario en relacion de dependencia:");
        double salarioProporcional= sueldoMensual/30;
        double salario= salarioProporcional*dias;
        return salario;
    }
}
