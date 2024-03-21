package presencial;

public abstract class EmpleadoFactory { //static hace que el metodo sea de la clase y no del objeto
 // si fuese una interface el metodo deberia haber sido abstracto, Empleado crearEmpleado(String tipo);
    public static Empleado crearEmpleado(String tipo) throws IllegalArgumentException{
        if("EMP-RD".equals(tipo)){
            return new EmpleadoRelacionDeDependencia(1000);
        } else if ("EMP-PH".equalsIgnoreCase(tipo)) {
                return new EmpleadoPorHora(7,14);
        }else {
            throw new IllegalArgumentException("tipo de dato erroneo");
        }
    }


}
