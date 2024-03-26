package presencial;

public abstract class Estado {
    public abstract void darDeComer();
    public abstract void darDeBeber();
    public abstract void darMimos();

    @Override
    public String toString() {
        return "Estado: ";
    }
}
