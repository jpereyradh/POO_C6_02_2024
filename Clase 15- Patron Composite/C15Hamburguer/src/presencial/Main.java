package presencial;

public class Main {
    public static void main(String[] args) {
        Producto burger= new Burger("Doble bacon",100);
        Producto papa= new Acompanamientos("papa frita",50);
        Producto refresco= new Bebida("Guarana",20);

        System.out.println("Precio Burger: "+burger.getPrecio());
        System.out.println("Precio Papa Frita: "+papa.getPrecio());
        System.out.println("Precio Bebida: "+refresco.getPrecio());

        double precioTotal= burger.getPrecio()+ papa.getPrecio()+ refresco.getPrecio();
        System.out.println("Precio total de los productos individuales: "+precioTotal);

        ProductoComposite combo= new ProductoComposite("DH food");
        combo.agregarProductoCombo(burger);
        combo.agregarProductoCombo(papa);


        System.out.println("Precio total del combo: "+combo.getPrecio());

        CarritoDeCompra carritoDeCompra= new CarritoDeCompra();

        carritoDeCompra.agregarProducto(combo);
        carritoDeCompra.agregarProducto(refresco);
        System.out.println("Precio total a abonar: "+carritoDeCompra.calculoDeCarrito());
    }
}
