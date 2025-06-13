
# Exercícios

## **Exercício 1**

Crie uma classe chamada `Pessoa` com os seguintes atributos:

```java
String nome
int idade
```
Em seguida, na classe `App.java`, dentro do método `main`, crie dois objetos da classe `Pessoa` . Atribua os valores dos atributos de cada pessoa. Exiba os dados das pessoas no console.

**Dica**: Use `System.out.println()` para mostrar os valores.

## Exercício 2

Ainda usando a classe `Pessoa`, adicione um método chamado `mostrarDetalhes()` para imprimir no console os valores dos atributos `nome` e `idade`.


## Exercício 3
Crie dois objetos do tipo `Pessoa` com o mesmo valor de `nome` e `idade`. Compare os dois objetos por um `if`. Qual foi o resultado obtido? Os objetos são iguais? Justifique sua resposta.

## Exercício 4
Na classe `Pessoa`, Crie o método  `fazerAniversario()` o qual deve aumentar o valor da idade da pessoa em 1 ano.  Na classe App.class, no método `main`, invoque o método e mostre a idade antes e depois.

**Resultado esperado**:

```java
pessoa.fazerAniversario();

System.out.println("Idade depois do aniversário: " + pessoa.idade); 
// a idade deve ter aumentado
```


## Exercício 5
Crie o construtor vazio da classe `Pessoa`. Insira uma mensagem de criação do objeto.

**Saída esperada**: 
```java
Pessoa criada com sucesso!
```

## Exercício 6

Crie um construtor com parâmetros para a classe `Pessoa` que receba os seguintes atributos:

```java
String nome
int idade
```

Esse construtor deve atribuir os valores recebidos aos atributos da classe e imprimir uma mensagem no terminal com os dados informados.

🔹 Exemplo de saída esperada:
```java
Pessoa criada: João, 30 anos
```

## Exercício 7

Crie uma classe `Livro` com os seguintes atributos:
```java
String titulo
int numeroDePaginas
```
Crie os métodos:

- `mostrarDetalhes()`: imprime o título e o número de páginas
- `abrirLivro()`: imprime "Você abriu o livro."
- Construtor vazio indicando que um novo `Livro` foi criado

Invoque os métodos na classe App.

## Exercício 8

Adicione um atributo do tipo `Livro` na classe `Pessoa`.
Em seguida, implemente um método na própria classe `Pessoa` que verifique se ela possui um livro associado. O método deve exibir no terminal uma mensagem informando se a pessoa tem ou não um livro.

## Exercício 9

Crie uma classe Professor com os atributos:

```java
String nome
String disciplina
```

E métodos:

- `apresentar()`: imprime "Olá, meu nome é [nome] e eu ensino [disciplina]."

Crie outro objeto Professor e o apresente.

Relacione o objeto Professor com a classe Livro.