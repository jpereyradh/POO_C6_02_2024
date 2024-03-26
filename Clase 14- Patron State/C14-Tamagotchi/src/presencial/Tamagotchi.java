package presencial;

public class Tamagotchi {
    //relacion de asociacion con los estados de la mascota
    private Estado estadoActual;


    public Tamagotchi() {
        estadoActual= new Hambrienta(); //aca comienza siempre el estimulo
    }
    public void darDeComer(){
        estadoActual.darDeComer();
      if(estadoActual instanceof Hambrienta){
          estadoActual= new Feliz();
          System.out.println("cambio de estado");
      } else if (estadoActual instanceof  Feliz) {
          estadoActual= new Sedienta();
          System.out.println("cambio de estado");
      } else if (estadoActual instanceof  Sedienta) {
          estadoActual= new Triste();
      }else{
          estadoActual= new Triste();
      }

    }
    public void darBeber(){
        estadoActual.darDeBeber();
        if(estadoActual instanceof Hambrienta){
            estadoActual= new Triste();
            System.out.println("cambio de estado");
        } else if (estadoActual instanceof  Triste) {
            System.out.println("no hay cambio  de estado");
        } else if (estadoActual instanceof  Sedienta) {
            estadoActual= new Feliz();
        }else{
            estadoActual= new Hambrienta();
        }
    }
    public  void darMimos(){
        estadoActual.darMimos();
    }

    public Estado getEstadoActual() {
        return estadoActual;
    }

    @Override
    public String toString() {
        return "Tamagotchi{" +
                "estadoActual=" + estadoActual +
                '}';
    }
}
