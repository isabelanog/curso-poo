import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nome;
    private List<Livro> livros;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void exibirLivros() {
        System.out.println("Livros na biblioteca " + nome + ":");
        for (Livro livro : livros) {
            System.out.println("- " + livro.getTitulo() + " | Autor: " + livro.getAutor() + " | Ano: " + livro.getAnoPublicacao());
        }
    }

}
