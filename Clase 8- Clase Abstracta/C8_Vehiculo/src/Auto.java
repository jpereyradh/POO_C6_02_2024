public class Auto extends Vehiculo{
    private Boolean tieneCombustible;
    private int cantidadButacas;

    public Auto(String nombre, String marca, Boolean tieneCombustible, int cantidadButacas) {
        super(nombre, marca);
        this.tieneCombustible = tieneCombustible;
        this.cantidadButacas = cantidadButacas;
    }

    @Override
    public void conducir() {
        if(tieneCombustible==true){
            System.out.println("Vehiculo apto para conducir");
        }else{
            System.out.println("Vehiculo no apto");
        }

    }


    @Override
    public String conducir(Boolean apto) {
        return null;
    }

    @Override
    public Boolean transportarPasajeros() {
        if(cantidadButacas<=4) {
            return true;
        }else{
            return false;
        }
    }
}
