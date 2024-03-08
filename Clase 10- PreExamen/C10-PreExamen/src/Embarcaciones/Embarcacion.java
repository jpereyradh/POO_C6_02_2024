package Embarcaciones;

public class Embarcacion {
    private Capitan capitan;
    private double precioBase;
    private  double valorAdicional;
    private int anioFabricacion;
    private  double eslora;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }
}
