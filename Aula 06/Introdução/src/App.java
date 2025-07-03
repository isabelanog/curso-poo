import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Exercício 1

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", 17));
        pessoas.add(new Pessoa("Bruno", 20));
        pessoas.add(new Pessoa("Carla", 15));

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade());
        }

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() >= 18) {
                System.out.println(pessoa.getNome() + " é maior de idade.");
            }

        }

        //primeiro elemento da lista de Pessoa

        System.out.println("Primeira pessoa da lista:  " + pessoas.get(0).getNome());
        System.out.println("Última pessoa da lista: " + pessoas.get(pessoas.size()-1).getNome());

        //Imprimindo quantidade de pessoas na lista de pessoas:

        System.out.println("Quantidade de pessoas na lista: " + pessoas.size());
        
        // Exercicio 3

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Caneta", 2.50));
        produtos.add(new Produto("Caderno", 12.00));
        produtos.add(new Produto("Borracha", 1.00));

        for (Produto p : produtos) {
            // System.out.println("Produto: " + p.getNome() + " - Preço: R$ " +
            // p.getPreco());
            p.exibirInfo();
        }

        // Imprimindo valor total da lista de Produtos
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        System.out.println("Valor total: R$ " + total);

        // Atualizar preço de um item da lista de produtos
        produtos.get(1).setPreco(70.00);

        for (Produto produto : produtos) {
            produto.exibirInfo();
        }


        // Exercicio 9

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        Livro livro1 = new Livro("O Alquimista", "Paulo Coelho", 1988);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", 1899);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.exibirLivros();

    }
}
