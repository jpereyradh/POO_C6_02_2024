package presencial;

public class Socio {
    private String nombre;
    private Integer numeroSocio;
    private Double cuotaMensual;
    private String actividad;

    //constructor: el metodo que nos permite instanciar (crear) el objeto en cuestion
    //click derecho + generate


    public Socio(String nombre, Integer numeroSocio, Double cuotaMensual, String actividad) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }
    public Double calcularCostoMensual(/*parametros: tipo y nombre*/){
        return cuotaMensual+(0.05*cuotaMensual);
    }

}
