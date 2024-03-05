package presencial;

public class CuentaCajaAhorro extends Cuenta {
    private double interesCajaDeAhorro=1.2;


    @Override
    public double extraer(double monto) {
        if(monto<=saldo){
            saldo-=monto;// saldo= saldo-monto;
            System.out.println("extraccion correcta");
        }else{
            System.out.println("saldo insuficiente");
        }

        return saldo;
    }
    public void generarIntereses(){

        saldo+=(saldo*interesCajaDeAhorro);
        System.out.println("intereses ganados: "+interesCajaDeAhorro+"%");
        System.out.println("ganancia generada y acumulada: "+saldo);

    }
}
