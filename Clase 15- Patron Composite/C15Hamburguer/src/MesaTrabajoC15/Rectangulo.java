package MesaTrabajoC15;

public class Rectangulo implements Figura{
    private double alto, largo;
    @Override
    public double calcularArea() {
        return alto*largo;
    }
}
