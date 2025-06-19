public class TransferenciaBancaria implements FormaPagamento {

    @Override
    public boolean autorizarPagamento(double valor) {

        System.out.println("Pagamento autorizado via transferência: R$" + valor);
        return true;
    }
}
