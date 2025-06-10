public class Pessoa {
    String nome;
    int idade;
    Livro livro;

    void mostrarDetalhes() {
        System.out.println("Exibindo detalhes de Pessoa:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    void fazerAniversario() {
        this.idade = this.idade + 1;
    }

    public Pessoa() {
        System.out.println("Nova pessoa criada");
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("Pessoa " + nome + " criada");
    }

    public boolean temLivro() {

        if (this.livro != null) {
            System.out.println("Tem livro!");
            return true;
        } else {
            System.out.println("Não tem livro");
            return false;
        }
    }


}
