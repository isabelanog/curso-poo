public class Professor {
    
    String nome;
    String disciplina;
    Livro livro;

    void apresentar() {
        System.out.println("Olá! Meu nome é " + nome + " e eu ensino " + disciplina);
        if (temLivro()) {
            livro.mostrarDetalhes();
        }
    }

    void mostrarDetalhes() {
        System.out.println("Exibindo detalhes do professor:");
        System.out.println("Nome do professor: " + nome);
        System.out.println("Livro: " + livro);

        if (temLivro()) {
            livro.mostrarDetalhes();
        }
    }

    boolean temLivro() { 
        boolean existeLivro;

        if (this.livro != null) {
            existeLivro = true;
        } else {
            existeLivro = false;
        }

        return existeLivro;
    }
}
