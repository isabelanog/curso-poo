public abstract class ContaBancaria {
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }

    abstract void sacar(double valor);

}
