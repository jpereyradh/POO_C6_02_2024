package presencial;

public class Main {
    public static void main(String[] args) {
        Equipo equipo= new Equipo("Digital FC");
        equipo.agregarJugador(new Jugador(10,"Juan",false,true));
        equipo.agregarJugador(new Jugador(5,"Fernando",true,true));
        equipo.agregarJugador(new Jugador(7,"Marco",true,false));


        equipo.mostrarJugadorTitular();
        System.out.println("****************************");
        equipo.mostrarJugador2();
        System.out.println("***********************");
        System.out.println("Cantidad de lesionados Titulares : "+equipo.getCantidadJugadoresLesionados());
    }
}
