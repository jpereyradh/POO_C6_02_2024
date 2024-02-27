package presencial;

public class SocioPileta extends Socio {
    private Double costoPileta;
    private Boolean estaHabilitado;

    public SocioPileta(String nombre, Integer numeroSocio, Double cuotaMensual, String actividad, Double costoPileta) {
        super(nombre, numeroSocio, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
        this.estaHabilitado = false; //--> indicando que cuando se instance un objeto "socioPileta" va a inicializarse en false la variable.
    }

    public SocioPileta(String nombre, Integer numeroSocio, Double cuotaMensual, String actividad, Double costoPileta, Boolean estaHabilitado) {
        super(nombre, numeroSocio, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
        this.estaHabilitado = estaHabilitado;
    }
    //firma del metodo --> nos garantiza que sea ese metodo y no otro. es un contrato de java.
    //sobrecargar el metodo--> es el mismo metodo con parametros diferentes. osea realiza actividades diferentes.
    //sobre escritura del metodo --> invocando una anotacion que se conoce como overrride

    @Override //--> firma del metodo
    public Double calcularCostoMensual() {
        if (costoPileta > 0 && estaHabilitado) {

            System.out.println("valor cuota mensual : ");
            System.out.println("Socio Aceptado");
            return super.calcularCostoMensual() + costoPileta;
        } else {
            System.out.println("No cumple");
            System.out.println("Debe estar habilitado y pagar la cuota extra");
            return super.calcularCostoMensual();
        }


    }}


