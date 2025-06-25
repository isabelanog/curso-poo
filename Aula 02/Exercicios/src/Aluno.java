public class Aluno {

    private String nome;
    private int idade;
    private String curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    // public void setIdade(int idade) {
    // this.idade = idade;
    // }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Exercício 2

    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 120) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }

    public String exibirMensagem() {
        return "O aluno(a) " + this.getNome() + " está matriculado no curso de " + this.getCurso() + ".";
    }

    public void exibirDetalhes() {
        System.out.println("Exibindo detalhes do aluno:");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println(this.exibirMensagem());
        System.out.println("----------------------------------------------");
    }

}
