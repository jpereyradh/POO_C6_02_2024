package PreExamen;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private List<OfertaAcademica> ofertaAcademica= new ArrayList<>();

    public void agregarOferta(OfertaAcademica oferta){
        ofertaAcademica.add(oferta);
    }
    public void generarInforme(){
        System.out.println("**********************Informe de Ofertas Academicas:*******************");
        for (OfertaAcademica academica : ofertaAcademica) {
            System.out.println("Nombre: "+academica.getNombre()+" precio: "+academica.calcularPrecio());

        }
    }
}
