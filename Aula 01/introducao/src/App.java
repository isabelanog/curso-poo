

public class App {
    public static void main(String[] args) throws Exception {

        // Introdução a objeto

        Autor autor = new Autor();
        autor.nome = "Isabela Nogueira";
        autor.email = "isabela@email.com";
        autor.cpf = "123.456.789.10";

        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 60;
        livro.autor = autor;

        livro.retornaAutor();
        // System.out.println("O nome do livro é " + livro.nome);
        // System.out.println(livro.descricao);
        // System.out.println(livro.valor);

        // Introdução à métodos de uma classe
        // livro.mostrarDetalhesLivro();
        // livro.aplicaDescontoDe(0.1);

        // Autor outroAutor = new Autor();
        // outroAutor.nome = "Rodrigo Turini";
        // outroAutor.email = "rodrigo.turini@caelum.com.br";
        // outroAutor.cpf = "123.456.789.10";

        // Livro outroLivro = new Livro();

        // outroLivro.nome = "Lógica de Programação";
        // outroLivro.descricao = "Crie seus primeiros programas";
        // outroLivro.valor = 59.90;
        // outroLivro.autor = outroAutor;

        // System.out.println("---------------------------");
        // System.out.println(outroLivro.nome);
        // System.out.println(outroLivro.descricao);
        // System.out.println(outroLivro.valor);

        // outroLivro.mostrarDetalhesLivro();

        // Referência a objetos
        // if (autor == outroAutor) {
        // System.out.println("Iguais, mesmo autor!");
        // } else {
        // System.out.println("hein!? Por que diferentes?");
        // }

        // Construtor
        // Livro livro1 = new Livro();
        // Livro livro2 = new Livro();
        // Livro livro3 = new Livro();
        // Livro livro4 = new Livro();

    }
}
