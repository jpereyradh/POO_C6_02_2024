package PreExamen;

public class Curso extends OfertaAcademica {
    private int cargaHorariaMensual;
    private int duracionMeses;
    private double valorHora;

    public Curso(String nombre, String descripcion, int cargaHorariaMensual, int duracionMeses, double valorHora) {
        super(nombre, descripcion);
        this.cargaHorariaMensual = cargaHorariaMensual;
        this.duracionMeses = duracionMeses;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPrecio() {
        return cargaHorariaMensual*duracionMeses*valorHora;
    }
}
