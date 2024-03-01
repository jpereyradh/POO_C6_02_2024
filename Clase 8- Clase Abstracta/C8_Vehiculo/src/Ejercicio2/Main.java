package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        //polimorfismo
        Animal animal;
        animal= new Perro();
        animal.hacerSonido();
        animal= new Gato();
        animal.hacerSonido();


        //CASTEO
        //casteo implicito --> upcasting--> ascendente
        Perro perro= new Perro();
        Animal animal1= perro;
        animal1.hacerSonido();
        Gato gato= new Gato();
        animal1= gato;
        animal1.hacerSonido();

        System.out.println("casteo explicito--- downcasting o descendente");
        Animal otroAnimal= new Gato();
        gato= (Gato) otroAnimal;
        otroAnimal.hacerSonido();

        System.out.println("instance of-- la manera segura de castear");
        Animal animal2= new Perro();
        if(animal2 instanceof Perro){
        Perro perro1= (Perro) animal2;
        perro1.hacerSonido();}
        else{
            System.out.println("No me puedo comportar como perro siendo que soy un animnal gato");
        }
        //casting de Double a Integer
        double numeroDouble= 10.5;
        int numeroEntero= (int)numeroDouble;
        System.out.println("Double : "+numeroDouble+" Entero: "+numeroEntero);

        String numeroString= Double.toString(numeroDouble);
        System.out.println("el string numerico: "+numeroString);
    } //1.5 y un String unopuntocinco
}
