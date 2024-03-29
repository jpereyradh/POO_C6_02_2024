package PreExamen;

public class Main {
    public static void main(String[] args) {
        Instituto instituto= new Instituto();

        Curso frontEnd= new Curso("Front End 1","CTD",16,2,1000);
        Curso backEnd= new Curso("POO 1","CTD",20,2,900);

        ProgramaIntensivo programaIntensivo= new ProgramaIntensivo("FullStack","CTD",20);
        programaIntensivo.agregarCurso(frontEnd);
        programaIntensivo.agregarCurso(backEnd);

        instituto.agregarOferta(frontEnd);
        instituto.agregarOferta(backEnd);
        instituto.agregarOferta(programaIntensivo);

        instituto.generarInforme();





            }
}
