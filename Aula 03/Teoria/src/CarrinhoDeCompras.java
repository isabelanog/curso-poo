public class CarrinhoDeCompras {

    private double valorDaCompra;

    public void adiciona(Livro livro) {

        System.out.println("Adicionando ao carrinho o livro: " + livro);

        valorDaCompra += livro.getValor();
    }

    public double getValorDaCompra() {
        return valorDaCompra;
    }

}
