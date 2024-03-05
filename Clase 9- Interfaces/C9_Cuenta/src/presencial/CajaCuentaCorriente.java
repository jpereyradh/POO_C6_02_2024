package presencial;

public class CajaCuentaCorriente extends Cuenta implements ImpuestoGravable {
    private double descubiertoPermitido=500;
    @Override
    public double extraer(double monto) {
        if(monto<=saldo+descubiertoPermitido){ //700- 50+500
            saldo-=monto;// saldo= saldo-monto;
             System.out.println("extraccion correcta");
        }else{
            System.out.println("saldo insuficiente");
        }

        return saldo;
    }

    @Override
    public double gravarImpuesto(double porcentaje) {
        saldo-=(saldo*porcentaje/100);
        System.out.println("impuestos gravados: "+porcentaje+"%");
        System.out.println("saldo - impuestos: "+saldo);
        return saldo;
    }
}
