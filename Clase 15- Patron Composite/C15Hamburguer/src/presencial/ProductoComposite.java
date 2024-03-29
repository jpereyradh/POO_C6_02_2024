package presencial;

import java.util.ArrayList;
import java.util.List;

//composite o compposicion
public class ProductoComposite extends Producto {
    //una relacion 1 a m
 private List<Producto> productos;

    public ProductoComposite(String nombre) {
        super(nombre,0); //inicialmente el combo cuesta 0
        productos= new ArrayList<>();
    }
    public  void agregarProductoCombo(Producto producto){
        productos.add(producto);
    }
    public void removerProducto(Producto producto){
        productos.remove(producto);
    }

    @Override
    public double getPrecio() {
        double precioTotal=0; //definimos una variable en 0
        for (Producto producto : productos) {//por cada producto de tipo producto de la lista "productos"
            precioTotal+= producto.getPrecio();
        }
        return precioTotal*0.9; //se le otorga un 10% off
    }
}
