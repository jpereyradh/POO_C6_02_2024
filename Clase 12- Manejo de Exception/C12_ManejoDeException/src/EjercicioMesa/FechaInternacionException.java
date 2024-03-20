package EjercicioMesa;

public class FechaInternacionException extends  Exception{

    public FechaInternacionException() {
        super("La fecha de internacion no puede ser posterior a la fecha de hoy");
    }
}
