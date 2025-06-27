public class App {
    public static void main(String[] args) throws Exception {

        // regras de desconto

        Autor autor = new Autor();
        autor.setNome("Machado de Assis");

        Livro livro = new Livro(autor);
        livro.setValor(70);

        if (!livro.aplicaDescontoDe(0.3)) {
            System.out.println("Desconto no livro não pode ser maior do que 30%");

        } else {
            System.out.println("Valor do livro com desconto: " + livro.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setValor(30);

        if (!ebook.aplicaDescontoDe(0.3)) {
            System.out.println("Desconto no ebook não pode ser maior que 15%");
        } else {
            System.out.println("Valor do ebook com desconto: " + ebook.getValor());
        }

        // Registro de vendas

        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setNome("Capitu");
        livroFisico.setValor(30);

        Ebook ebookDoLivroFisico = new Ebook(autor);
        ebookDoLivroFisico.setNome("Capitu");
        ebookDoLivroFisico.setValor(10);

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adiciona(livroFisico);
        carrinhoDeCompras.adiciona(ebookDoLivroFisico);

        System.out.println("Valor total da compra: R$" + carrinhoDeCompras.getValorDaCompra());

    }
}
