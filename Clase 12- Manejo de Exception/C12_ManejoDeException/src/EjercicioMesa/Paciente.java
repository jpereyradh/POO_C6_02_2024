package EjercicioMesa;

import java.time.LocalDate;

public class Paciente {
    private String nombre;
    private String apellido;
    private String cedula;
    private String historiaClinica;
    private LocalDate fechaInternacion;
    private LocalDate fechaAlta;

    public Paciente(String nombre, String apellido, String cedula, String historiaClinica, LocalDate fechaInternacion) throws FechaInternacionException {
        if (fechaInternacion.isAfter(LocalDate.now())) {
            throw new FechaInternacionException();
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.historiaClinica = historiaClinica;
        this.fechaInternacion = fechaInternacion;
    }
    public void darDeAlta(LocalDate fechaAlta) throws FechaAltaException{
        if(fechaAlta.isBefore(fechaInternacion)){
            throw new FechaAltaException("No se puede dar de alta con la fecha erronea");
        }
        this.fechaAlta= fechaAlta;

    }
}
