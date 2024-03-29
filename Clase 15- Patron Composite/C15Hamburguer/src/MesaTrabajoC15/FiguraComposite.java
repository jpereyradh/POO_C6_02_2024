package MesaTrabajoC15;

import java.util.ArrayList;
import java.util.List;

public class FiguraComposite implements Figura{
    private List<Figura> figuraList= new ArrayList<>();

    public void agregarFigura(Figura figura){
        figuraList.add(figura);
    }
    @Override
    public double calcularArea() {
        double areaTotal=0;
        for (Figura figura : figuraList) {
            areaTotal+=figura.calcularArea();

        }
        return areaTotal;
    }
}
