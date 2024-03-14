package presencial;

public class Jugador implements Comparable<Jugador> {
    private int numeroDeCamiseta;
    private String nombre;
    private Boolean estaLesionado;
    private Boolean esTitular;

    public Jugador(int numeroDeCamiseta, String nombre, Boolean estaLesionado, Boolean esTitular) {
        this.numeroDeCamiseta = numeroDeCamiseta;
        this.nombre = nombre;
        this.estaLesionado = estaLesionado;
        this.esTitular = esTitular;
    }

    @Override
    public int compareTo(Jugador otroJugador) {
        return Integer.compare(numeroDeCamiseta,otroJugador.numeroDeCamiseta);
    }

    public Boolean getEstaLesionado() {
        return estaLesionado;
    }

    public Boolean getEsTitular() {
        return esTitular;
    }

    public int getNumeroDeCamiseta() {
        return numeroDeCamiseta;
    }

    public String getNombre() {
        return nombre;
    }
}
