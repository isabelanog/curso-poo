public class App {
    public static void main(String[] args) throws Exception {
        
        Livro livro = new Livro();

        
        livro.atribuiNome("Um defeito de cor"); 
        
        System.out.println("Nome: " + livro.retornaNome());

        livro.atribuiDescricao("Descrição do livro");

        System.out.println("Descrição: " + livro.retornaDescricao());;

        livro.atribuiValor(50);

        System.out.println("Valor atual: R$" + livro.retornaValor());


        //ajustar para a lógica get e set

        Autor autor = new Autor();
        autor.setNome("Isabela Nogueira");

        Livro livroNovo = new Livro(autor);

    }
}
