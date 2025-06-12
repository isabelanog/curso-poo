public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setIdade(33);

        pessoa.exibirDados();
        
        Aluno aluno = new Aluno();
        aluno.setMatricula(123456);
        aluno.setNome("Cleiton");
        aluno.setIdade(25);
        aluno.exibirDados();



        // Exercício 03

        Animal[] animais = { new Cachorro(), new Gato() };

        for (Animal a : animais) {
            a.fazerSom();
        }

    // Exercício 04

    Mensagem[] mensagens = {new MensagemTexto(), new MensagemEmail()};

        for (Mensagem m : mensagens) {
            m.enviar();
        }


    

    // Exercício 05

     Transporte[] veiculos = {
            new Bicicleta(),
            new Carro(),
            new Aviao()
        };

        for (Transporte t : veiculos) {
            t.mover();
        }

    // Exercício 06

        Retangulo retangulo = new Retangulo(5, 3);
        Quadrado quadrado = new Quadrado(4);

        System.out.println("Retângulo:");
        retangulo.calcularArea();
        retangulo.calcularPerimetro();

        System.out.println();

        System.out.println("Quadrado:");
        quadrado.calcularArea();
        quadrado.calcularPerimetro();

    }
}
