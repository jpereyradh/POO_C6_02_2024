package presencial;

public class Sedienta extends Estado{
    @Override
    public void darDeComer() {
        System.out.println("se pone triste");
    }

    @Override
    public void darDeBeber() {
        System.out.println("pasa a feliz");
    }

    @Override
    public void darMimos() {
        System.out.println("sin cambio");
    }

    @Override
    public String toString() {
        return "Sedienta";
    }
}
