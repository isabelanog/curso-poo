public class App {
    public static void main(String[] args) throws Exception {
        
        //Exercício 1

        Aluno aluno = new Aluno();
        aluno.setNome("Maria");
        aluno.setIdade(25);
        aluno.setCurso("Programação Orientada a Objetos");
        aluno.exibirDetalhes();

        
    
    //     // Exercício 2
    
    //     Aluno aluno2 = new Aluno();
    //     aluno2.setNome("João");
    //     aluno2.setIdade(200); // idade inválida
    //     aluno2.setIdade(30);  // idade válida


        // Exercício 3

        Produto produto = new Produto("Notebook", 3600, 2);
        produto.exibirInfo();

    //     produto.setPreco(-10); // deve dar erro
    //     produto.setPreco(4000);
    //     produto.exibirInfo();
    
    //     // Exercício 4

    //     Carro carro = new Carro();
    //     carro.setMarca("Toyota");

    //     carro.acelerar(50);
    //     System.out.println("Velocidade: " + carro.getVelocidade() + " km/h");

    //     carro.frear(20);
    //     System.out.println("Velocidade: " + carro.getVelocidade() + " km/h");

    //     carro.frear(40); // velocidade não pode ser negativa
    //     System.out.println("Velocidade: " + carro.getVelocidade() + " km/h");
    

    // // Exercício 5

    //     Temperatura temp = new Temperatura();
    //     temp.setTemperatura(25);
    //     System.out.println("Temperatura em Celsius: " + temp.getTemperatura());
        

    // // Exercício 6

    // Musica musica = new Musica();
    //     musica.setTitulo("Imagine");
    //     musica.setArtista("John Lennon");
    //     musica.setDuracao(183);

    //     musica.exibirInfo();

    }
}
