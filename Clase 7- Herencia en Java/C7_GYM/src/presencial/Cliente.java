package presencial;

import MesaTrabajo.ObjetoGrafico;

public class Cliente {
    public static void main(String[] args) {
        SocioPileta socio1= new SocioPileta("Jorgito",0001,5000.0,"Musculacion",4000.0); //por default no esta habilitado
        SocioPileta socio2= new SocioPileta("Ignacio",0002,5000.0,"Musculacion",4000.0,true);


        System.out.println("El socio 1, debe abonar: "+socio1.calcularCostoMensual());
        System.out.println("****************************************************");
        System.out.println("El socio 2, debe abonar: "+socio2.calcularCostoMensual());




    }
}
