package presencialnterface;

import presencialnterface.EmpleadoRelacionDeDependencia;

public class EmpleadoRelacionDependenciaFactory implements EmpleadoFactory{
    @Override
    public Empleado crearEmpleado(String tipo) {
        if("EMP-RD".equalsIgnoreCase(tipo)){
            return new EmpleadoRelacionDeDependencia(1000);
    }else{
        throw new IllegalArgumentException("no coincide ningun tipo");
        }
    }
}
