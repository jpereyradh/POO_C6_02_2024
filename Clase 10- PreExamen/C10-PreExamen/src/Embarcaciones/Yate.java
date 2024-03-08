package Embarcaciones;

public class Yate extends Embarcacion implements Comparable<Yate> {
    private int cantidadDeCamarote;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantidadDeCamarote) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadDeCamarote = cantidadDeCamarote;
    }

    public boolean tieneMasLujo(Yate otroYate){
        return this.cantidadDeCamarote>otroYate.cantidadDeCamarote;
    }

    @Override
    public int compareTo(Yate otroYate) {
        return 0;
    }
}
