package MesaTrabajo;

public class ObjetoGrafico {
    private int posx;
    private int posy;
    protected char direccion;

    public ObjetoGrafico(int posx, int posy, char direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public void irA(int x, int y, char nuevaDireccion){
        //aca digamos va la logica necesaria para poder ir hacia una nueva posicion.
        this.posx = x;
        this.posy = y;
        this.direccion = nuevaDireccion;
    }

    @Override
    public String toString() {
        return "Posicion: {" +
                "posx=" + posx +
                ", posy=" + posy +
                ", direccion=" + direccion +
                '}';
    }
}
