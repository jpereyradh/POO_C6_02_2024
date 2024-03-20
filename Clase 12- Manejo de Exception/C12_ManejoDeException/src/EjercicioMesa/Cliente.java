package EjercicioMesa;

import java.time.LocalDate;

public class Cliente {
    public static void main(String[] args) {
        try{
            LocalDate fechaInternacion= LocalDate.of(2024,3,19);
            Paciente paciente= new Paciente("Lorenzo","Fares","11111","historia",fechaInternacion);
            System.out.println("Paciente creado con exito");

            LocalDate fechaAlta= LocalDate.of(2024,3,10);
            paciente.darDeAlta(fechaAlta);

        }catch (FechaInternacionException e){
            System.err.println(e.getMessage());
        }catch (FechaAltaException ex){
            System.err.println(ex.getMessage());
        }

    }
}
