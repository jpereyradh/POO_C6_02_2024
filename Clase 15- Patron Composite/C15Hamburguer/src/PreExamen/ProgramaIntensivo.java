package PreExamen;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica{
    private List<OfertaAcademica> cursos= new ArrayList<>();
    private double porcentajeBonificacion;

    public ProgramaIntensivo(String nombre, String descripcion, double porcentajeBonificacion) {
        super(nombre, descripcion);
        this.porcentajeBonificacion = porcentajeBonificacion;
    }
    public void agregarCurso(OfertaAcademica curso){
        cursos.add(curso);
    }

    @Override
    public double calcularPrecio() {
        double totalCurso=0;
        for (OfertaAcademica curso : cursos) {
            totalCurso+=curso.calcularPrecio();
        }
        return totalCurso*(1-porcentajeBonificacion/100);
    }
}
