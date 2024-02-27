package MesaTrabajo;

public class Nave extends ObjetoGrafico {
private double velocidad;
private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida=100; //asignarle por default
    }

    @Override
    public void irA(int x, int y, char nuevaDireccion) {
        super.irA(x, y, nuevaDireccion);
    }
    public void girar(char nuevaDireccion){
        //logica
        this.direccion= nuevaDireccion;
    }
}
