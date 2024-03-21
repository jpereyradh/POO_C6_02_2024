package presencialnterface;

public interface EmpleadoFactory { //static hace que el metodo sea de la clase y no del objeto
 // si fuese una interface el metodo deberia haber sido abstracto, Empleado crearEmpleado(String tipo);
     Empleado crearEmpleado(String tipo);


}
