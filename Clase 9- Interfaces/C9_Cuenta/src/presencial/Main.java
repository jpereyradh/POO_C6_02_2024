package presencial;

public class Main {
    public static void main(String[] args) {
        CajaCuentaCorriente cuentaCorriente= new CajaCuentaCorriente();
        cuentaCorriente.depositar(1000);
        cuentaCorriente.informarSaldo();
        cuentaCorriente.extraer(1500);
        cuentaCorriente.informarSaldo();
        cuentaCorriente.depositar(200);
        cuentaCorriente.informarSaldo();
        cuentaCorriente.gravarImpuesto(5);
        cuentaCorriente.informarSaldo();

    }
}
