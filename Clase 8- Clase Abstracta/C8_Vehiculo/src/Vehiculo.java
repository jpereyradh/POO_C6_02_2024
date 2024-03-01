public abstract class Vehiculo {
    private String nombre;
    private String marca;
    private Integer cantDePasajeros;

    public Vehiculo(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }

    public abstract void conducir();
    public abstract String conducir(Boolean apto);
    public Boolean transportarPasajeros(){
        return cantDePasajeros>1;
    }
}
