public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        setPreco(preco);
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido.");
        }
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirInfo() {
        System.out.printf(" Produto: %s \n Preço: R$ %.2f%n Quantidade: %s \n Valor total: R$ %.2f%n", this.getNome(), this.getPreco(), this.getQuantidade(), this.calcularTotal());
    }

    public double calcularTotal() {
        double valorTotal = this.getQuantidade() * this.getPreco();
        return valorTotal;
    }
}
