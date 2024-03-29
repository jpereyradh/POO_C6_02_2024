package presencial;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompra {
    private List<Producto> listaProducto= new ArrayList<>();

    public void agregarProducto(Producto producto){
        listaProducto.add(producto);
    }
    public double calculoDeCarrito(){
        double total=0;
        for (Producto producto : listaProducto) {
            total+= producto.getPrecio();

        }
        return total;
    }
}
