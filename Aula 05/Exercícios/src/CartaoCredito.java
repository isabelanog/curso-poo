public class CartaoCredito implements FormaPagamento {

    @Override
    public boolean autorizarPagamento(double valor) {
        
        if (valor <= 1000) {
            System.out.println("Pagamento autorizado no cartão de crédito: R$" + valor);
            return true;
        } else {
            System.out.println("Pagamento negado no cartão de crédito. Limite excedido.");
            return false;
        }
    }
}
