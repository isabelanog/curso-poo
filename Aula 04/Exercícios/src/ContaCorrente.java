public class ContaCorrente extends ContaBancaria {

    @Override
    void sacar(double valor) {
        saldo -= valor;
    }
}
