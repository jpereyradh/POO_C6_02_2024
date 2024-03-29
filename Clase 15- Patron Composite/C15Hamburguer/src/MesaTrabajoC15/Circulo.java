package MesaTrabajoC15;

public class Circulo implements Figura{
    private double radio;
    //private static final double PI=3.14287389789234789;
    @Override
    public double calcularArea() {
        return Math.pow(radio,2)*Math.PI;
    }
}
