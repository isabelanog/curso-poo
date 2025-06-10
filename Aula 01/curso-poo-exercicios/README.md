## Instruções para realização dos exercícios

Para realizar os exercícios, será necessário criar um projeto Java. Siga as etapas abaixo:

1. Crie uma pasta para organizar seus projetos Java.
Por exemplo: `curso-poo-exercicios`
2. Abra o Visual Studio Code.
3. No menu lateral, clique em "Create Java Project".
4. Selecione a opção "No build tools".
5. Escolha a pasta que você criou anteriormente (`curso-poo-exercicios`).
6. Dê um nome ao projeto conforme a aula. Por exemplo: `aula-01`

Na classe [App.java](http://App.java) ficará o método main, onde será executado a compilação dos códigos. 

Para criar uma classe, clique com o botão direito em cima da pasta `src` , New Java File e selecione Class. Insira o nome da classe e pressione enter.

Para compliar a classe e executar o código, pressione o botão play localizado no canto superior direito.

### **Exercício 1**

Crie uma classe chamada `Pessoa` com os seguintes atributos:

- `nome` (String)
- `idade` (int)

Em seguida, na classe App.java, dentro do método `main`, crie dois objetos da classe `Pessoa` . Atribua os valores dos atributos de cada pessoa. Exiba os dados das pessoas no console.

**Dica**: Use `System.out.println()` para mostrar os valores.

Ainda usando a classe `Pessoa`, adicione um método chamado mostrarDetalhes() para imprimir no console os valores dos atributos `nome` e `idade`.

Crie dois objetos do tipo Pessoa com o mesmo valor de nome e idade. Compare os dois objetos por um if. Qual foi o resultado obtido? Os objetos são iguais? Justifique sua resposta.

Crie o método  `fazerAniversario()` o qual deve aumentar o valor da idade da pessoa em 1 ano. 

Na classe App.class, no método `main`, invoque o método e mostre a idade antes e depois.

**Exemplo esperado**:

```java
pessoa.fazerAniversario();

System.out.println("Idade depois do aniversário: " + pessoa.idade); // idade deve ter aumentado
```

Crie o construtor vazio da classe Pessoa, insira uma mensagem de criação do objeto.

Crie o construdor com parametros da classe Pessoa

### **Exercício 2**

### **Criando a classe `Livro`**

 Crie uma classe `Livro` com os seguintes atributos:
> 
- `titulo` (String)
- `numeroDePaginas` (int)

Crie os métodos:

- `mostrarDetalhes()`: imprime o título e o número de páginas
- `abrirLivro()`: imprime "Você abriu o livro."
- Construtor vazio indicando que um novo Livro foi criado

Invoque os métodos na classe App. 

### **Exercício 3**

Adicione um atributo do tipo `Livro` na classe `Pessoa`.
Em seguida, implemente um método na própria classe `Pessoa` que verifique se ela possui um livro associado. O método deve exibir no terminal uma mensagem informando se a pessoa tem ou não um livro.

### Exercício 4

Crie uma classe Professor com os atributos:

- `nome` (String)
- `disciplina` (String)

E métodos:

- `apresentar()`: imprime "Olá, meu nome é [nome] e eu ensino [disciplina]."

Crie outro objeto Professor e o apresente.

Relacione o objeto Professor com a classe Livro.