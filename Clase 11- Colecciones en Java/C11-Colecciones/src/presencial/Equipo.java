package presencial;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Equipo {
    private String nombre;
    private List<Jugador> listaDeJugadores;
    //private Map<Integer,Jugador> mapaJugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        listaDeJugadores= new ArrayList<>();// lo que hace es instanciar una lista cuando llamo al constructor
    }
    public void agregarJugador(Jugador jugador){
        listaDeJugadores.add(jugador);
            }
     public List<Jugador> mostrarJugadorTitular(){
         System.out.println("**********Metodo 1***********");
         /*for(int i=0;i<listaDeJugadores.size();i++){
             //el ciclo repetitivo
         }*/
         /*for (Jugador jugador : listaDeJugadores) {
             //hace algo
         }*/
         //while ()
         List<Jugador> jugadoresTitulares= new ArrayList<>();
         for (Jugador jugador : listaDeJugadores) {
             if(jugador.getEsTitular()&& jugador.getEstaLesionado()){
                 jugadoresTitulares.add(jugador);
             }

         }
         return jugadoresTitulares;
     }
     public void mostrarJugador2(){
         System.out.println("***********Metodo 2*************");
         listaDeJugadores.stream().filter(Jugador::getEsTitular).sorted().forEach(jugador -> System.out.println(jugador.getNombre()+" -"+jugador.getNumeroDeCamiseta()));

     }
     public int getCantidadJugadoresLesionados(){
        return (int)listaDeJugadores.stream().filter(jugador -> jugador.getEstaLesionado()&& jugador.getEsTitular()).count();
     }
}
