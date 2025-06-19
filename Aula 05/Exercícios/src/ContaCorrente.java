public class ContaCorrente implements OperacoesBancarias {

    private double saldo;

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
    }

    @Override
    public void sacar(double valor) {

        if (valor <= saldo) {

            saldo -= valor;

            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saque de R$" + valor + " negado. Saldo insuficiente.");
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo;

    }

}
