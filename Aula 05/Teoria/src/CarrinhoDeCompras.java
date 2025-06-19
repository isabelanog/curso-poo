public class CarrinhoDeCompras {
    
    double total;

    public void adiciona(Produto produto) {

        System.out.println("Adicionando: " + produto);
        // produto.aplicaDescontoDe(0.16);
        total += produto.getValor();

    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
