public class Bicicleta extends Vehiculo {
    private Boolean tieneAireLaRueda;

    public Bicicleta(String nombre, String marca, Boolean tieneAireLaRueda) {
        super(nombre, marca);
        this.tieneAireLaRueda = tieneAireLaRueda;
    }

    @Override
    public void conducir() {

    }

    @Override
    public String conducir(Boolean apto) {
        return null;
    }
}
