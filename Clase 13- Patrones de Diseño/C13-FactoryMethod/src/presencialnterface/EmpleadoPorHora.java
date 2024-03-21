package presencialnterface;

public class EmpleadoPorHora extends Empleado {
    private double importePorDia;
    private double retencionImpuesto;

    public EmpleadoPorHora(double importePorDia, double retencionImpuesto) {
        this.importePorDia = importePorDia;
        this.retencionImpuesto = retencionImpuesto;
    }

    @Override
    public double calcularSueldo(int dias) {
        System.out.println("salario freelance:");
        double salario= importePorDia*dias;
        return salario;
    }
}
