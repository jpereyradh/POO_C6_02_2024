package presencial;

public class Feliz extends Estado{
    @Override
    public void darDeComer() {
        System.out.println("Se pone sediento");

    }

    @Override
    public void darDeBeber() {
        System.out.println("Se pone hambriento");

    }

    @Override
    public void darMimos() {
        System.out.println("Sin cambios");

    }

    @Override
    public String toString() {
        return "Feliz";
    }
}
