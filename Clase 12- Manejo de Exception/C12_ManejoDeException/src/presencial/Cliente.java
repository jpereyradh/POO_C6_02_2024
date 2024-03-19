package presencial;

public class Cliente {
    private String nombre, apellido;
    private String cedula;
    private Double saldoEnCuenta;
    private Double deuda;
    private Double limite;

    public Cliente(String nombre, String apellido, String cedula, Double limite) {


        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.limite = limite;
        this.deuda = 0.0;
        this.saldoEnCuenta = 0.0;
    }

    public void comprar(double importe) throws ClienteException{ //asegurar que se va a lanzar la exception
        if(saldoEnCuenta+importe>limite){
            //aca deberiamos arrojar una exception
            throw new ClienteException("Supero el limite establecido por el comercio");

        }
        saldoEnCuenta+=importe;
        System.out.println("Compra exitosa");
    }
    public void saldarDeuda(double importe) throws ClienteException{
        if(deuda<=0){
            throw new ClienteException("No hay deuda que saldar");
        }if(importe <=0){
            throw new ClienteException("El importe debe ser mayor a 0");
        }if(importe>deuda){
            throw new ClienteException("El importe es mayor a la deuda, procederemos a descontar");
        }
        deuda-=importe;
        System.out.println("deuda saldada");

    }
}
