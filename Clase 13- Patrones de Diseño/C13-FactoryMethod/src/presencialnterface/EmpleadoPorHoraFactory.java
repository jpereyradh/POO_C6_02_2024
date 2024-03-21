package presencialnterface;

import presencialnterface.EmpleadoPorHora;

public class EmpleadoPorHoraFactory implements EmpleadoFactory{
    @Override
    public Empleado crearEmpleado(String tipo) {
        if("EMP-PH".equalsIgnoreCase(tipo)){
            return new EmpleadoPorHora(7,14);

    }else{
        throw new IllegalArgumentException("no coincide");
        }
    }
}
