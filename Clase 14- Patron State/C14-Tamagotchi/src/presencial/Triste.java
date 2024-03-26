package presencial;

public class Triste extends Estado{
    @Override
    public void darDeComer() {
        System.out.println("hace 2 beep y vomita");
    }

    @Override
    public void darDeBeber() {
        System.out.println("hace 3 beep y titila");
    }

    @Override
    public void darMimos() {
        System.out.println("pasa a feliz");
    }

    @Override
    public String toString() {
        return "Triste";
    }
}
