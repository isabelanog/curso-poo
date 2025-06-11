public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
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

    public void exibirInfo() {
        System.out.printf("Produto: %s | Preço: R$%.2f%n", nome, preco);
    }
}
