package Examenes;

public class Parcial extends Examen{
    private int numeroUnidades;
    private int numeroReintentos;

    public Parcial(Alumno alumno, String titulo, String enunciado, int nota, int numeroUnidades, int numeroReintentos) {
        super(alumno, titulo, enunciado, nota);
        this.numeroUnidades = numeroUnidades;
        this.numeroReintentos = numeroReintentos;
    }
    public boolean sePuedeRecuperar(){
        if(numeroUnidades<=3){
            return numeroReintentos<3;
        }else {
            return numeroReintentos<2;
        }
    }
}
