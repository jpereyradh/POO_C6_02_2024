package Embarcaciones;

public class Velero extends Embarcacion{
    private int cantidadMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }
    public Boolean esGrande(){
        return cantidadMastiles>4;
    }
}
