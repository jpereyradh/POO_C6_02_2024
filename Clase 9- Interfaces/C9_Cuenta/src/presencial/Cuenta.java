package presencial;

public abstract class Cuenta {
    protected double saldo;

    public double depositar(double monto){
        saldo+= monto; //saldo= saldo+monto
        System.out.println("deposito correcto");
        return saldo;
    }
    public void informarSaldo(){
        if(saldo>0){
            System.out.println("Su saldo actual :"+saldo);
        }else{
            System.out.println("Sin Saldo");
        }
    }
    public abstract double extraer(double monto);


}
