package MesaTrabajoC15;

public class Triangulo implements Figura{
    private double base, altura;
    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }
}
