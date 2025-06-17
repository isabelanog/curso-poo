public class Aluno extends Pessoa {

    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibirDados() {
        System.out.println("Exibindo dados do Aluno");
        System.out.println("Matricula: " + matricula);
        super.exibirDados();
    }
}
