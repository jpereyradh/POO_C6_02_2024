package presencial;

public class Main {
    public static void main(String[] args) {
        Cliente cliente= new Cliente("Max","Powel","111111",100.0);

try {
    cliente.comprar(50.0);
    int i=20/0;
}catch (ClienteException | ArithmeticException e){
    System.err.println(e.getMessage());
}
        try{
            cliente.comprar(150.0);
        }catch (ClienteException e){
            System.out.println("Segundo bloque de compra : "+e.getMessage());
        }


        System.out.println("sigue el flujo normal de trabajo");
    }
}
