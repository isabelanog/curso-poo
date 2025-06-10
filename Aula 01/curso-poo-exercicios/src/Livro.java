public class Livro {

    String titulo;
    int numeroDePaginas;


    void mostrarDetalhes() {
        System.out.println("Exibindo detalhes do livro:");
        System.out.println("Título: " + titulo);
        System.out.println("Número de páginas: " + numeroDePaginas);
    }

    void abrirLivro() {
        System.out.println("Você abriu o livro.");
    }

}
