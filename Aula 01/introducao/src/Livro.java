public class Livro {

    String nome;
    String descricao;
    double valor;
    Autor autor;

    void mostrarDetalhesLivro() {
        String mensagem = "Mostrando detalhes do livro: ";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição :" + descricao);
        System.out.println("Valor: R$" + valor);

        // autor.mostrarDetalhesAutor();

        if (this.temAutor()) {
            autor.mostrarDetalhesAutor();
        }

        System.out.println("---------------------------");
    }

    // Método sem retorno
    public void aplicaDescontoDe(double porcentagem) {
        this.valor = this.valor - (this.valor * porcentagem);

        // this.valor -= this.valor * porcentagem;
        System.out.println("Valor do livro com desconto: " + this.valor);
    }

    // Método com retorno

    boolean temAutor() {

        boolean autorExiste;

        if (this.autor != null) {
            autorExiste = true;
        } else {
            autorExiste = false;
        }

        return autorExiste;
    }

    Autor retornaAutor() {

        boolean autorExiste;

        if (this.autor != null) {
            System.out.println("O autor do livro é: " + this.autor.nome);
        } else {
            autorExiste = false;
            System.out.println("O livro não tem autor!");
        }

        return this.autor;
    }

    // Construtor vazio

    public Livro() {
        System.out.println("Novo livro criado");
    }

    // Construtor com Parâmetros

    public Livro(Autor autor) {
        this.autor = autor;
    }

    public Livro(Autor autor, int valor) {
        this.autor = autor;
        this.valor = valor;
    }
}
