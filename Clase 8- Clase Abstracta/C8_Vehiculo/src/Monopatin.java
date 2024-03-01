public class Monopatin extends Vehiculo {
    private Boolean tieneBateria;

    public Monopatin(String nombre, String marca, Boolean tieneBateria) {
        super(nombre, marca);
        this.tieneBateria = tieneBateria;
    }

    @Override
    public void conducir() {

    }

    @Override
    public String conducir(Boolean apto) {
        return null;
    }
}
