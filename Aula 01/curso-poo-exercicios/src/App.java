public class App {
    public static void main(String[] args) throws Exception {
      
        // Exercício 01

        Pessoa pessoa = new Pessoa(); //criação de objeto do molde Pessoa
        pessoa.idade = 32;
        pessoa.nome = "Isabela";

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        
        pessoa.mostrarDetalhes();
        
        Pessoa outraPessoa = new Pessoa();
        outraPessoa.nome = "Isabela";
        outraPessoa.idade = 32;

        if (pessoa == outraPessoa) {
            System.out.println("É a mesma pessoa!");
        } else {
            System.out.println("Não é a mesma pessoa!");
        }
        
        System.out.println("Idade antes do aniversário: " + pessoa.idade);

        pessoa.fazerAniversario();
        
        System.out.println("Idade depois do aniversário: " + pessoa.idade);


        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        Pessoa pessoa4 = new Pessoa();

        Pessoa pessoa5 = new Pessoa("Alexandre", 30);

        // Exercício 2
        
        Livro livro = new Livro();
        livro.titulo = "Um defeito de cor";
        livro.numeroDePaginas = 1000;
        pessoa.livro = livro;

        livro.abrirLivro();
        livro.mostrarDetalhes();

        // Exercício 3

        pessoa.temLivro();


        // Exercício 4

        Professor professor = new Professor();
        professor.nome = "Rafael";
        professor.disciplina = "Matemática";

        Livro livroDoProfessor = new Livro();
        livroDoProfessor.titulo = "Livro do professor Rafael";
        livroDoProfessor.numeroDePaginas = 100;
        professor.livro = livroDoProfessor;

        professor.apresentar();

        Professor outroProfessor = new Professor();
        outroProfessor.nome = "Letícia";
        outroProfessor.disciplina = "Programação Orientada a Objeto";

        Livro livroDoOutroProfessor = new Livro();
        livroDoOutroProfessor.titulo = "Livro do outro professor";
        livroDoOutroProfessor.numeroDePaginas = 15;
        outroProfessor.livro = livroDoOutroProfessor;

        outroProfessor.apresentar();


    }
}
