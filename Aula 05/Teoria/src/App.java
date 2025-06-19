public class App {
    public static void main(String[] args) throws Exception {

        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setNome("Test-Driven Development");
        livroFisico.setValor(59.90);
        
        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);


        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(livroFisico);
        carrinho.adiciona(ebook);

        System.out.println("Total " + carrinho.getTotal());
    }
}
