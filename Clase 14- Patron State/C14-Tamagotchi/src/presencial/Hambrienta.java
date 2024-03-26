package presencial;

public class Hambrienta extends Estado{
    @Override
    public void darDeComer() {
        System.out.println("pasa a feliz");

    }

    @Override
    public void darDeBeber() {
        System.out.println("Se pone triste");

    }

    @Override
    public void darMimos() {
        System.out.println("sin cambio");
    }

    @Override
    public String toString() {
        return "Hambrienta";
    }
}
