package Examenes;

public class Final extends Examen implements Comparable<Final>{
    private int notaOral;
    private String descripcion;

    public Final(Alumno alumno, String titulo, String enunciado, int nota, int notaOral, String descripcion) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcion = descripcion;
    }
    public boolean esMayorQue(Final otroFinal){
        double promedioThis= (double) (nota+notaOral)/2;
        double promedioOtro= (double) (otroFinal.notaOral+otroFinal.nota)/2;
        return promedioThis>promedioOtro;
    }

    @Override
    public int compareTo(Final otroFinal) {
        double promedioThis= (double) (nota+notaOral)/2;
        double promedioOtro= (double) (otroFinal.notaOral+otroFinal.nota)/2;
        if(promedioThis==promedioOtro){
            return 0;
        } else if (promedioThis>promedioOtro) {
            return 1;

        }
        return -1;
    }
}
