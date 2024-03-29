package PreExamen;

public abstract class OfertaAcademica {
    private String nombre;
    private  String descripcion;

    public OfertaAcademica(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularPrecio();
}
