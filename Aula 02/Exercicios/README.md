# Exercícios

## Exercício 1

Crie uma classe `Aluno` com os seguintes atributos:

```java
private String nome
private int idade
private String curso;
```
* Implemente os métodos públicos getters e setters
* Crie um método chamado `exibirMensagem()` que retorna a mensagem:

        O aluno <nome> está matriculado no curso de <curso>."

Na classe `App.java` com o método main:

* Crie um objeto da classe `Aluno`
* Atribua valores usando os setters
* Exiba as informações no terminal usando os `getters`
* Chame o método `exibirMensagem()`

Após concluir todos os passos acima, crie um construtor da classe `Aluno` que receberá todos os atributos. Inicialize outro objeto da classe `Aluno` utilizando o  construtor criado. Exiba as informações no terminal usando os `gettters`

## Exercício 2

Modifique a classe `Aluno` para que o método `setIdade(int idade)` só permita valores entre 0 e 120. Caso contrário, exiba uma mensagem de erro e não altere o valor da idade.

Teste com valores válidos e inválidos no main.

## Exercício 3

Crie uma classe `Produto` com:

```java
private String nome;
private double preco;
private int quantidade;
```
* Crie os métodos get e set para todos os atributos.
* Crie um construtor que recebe os 3 atributos 

* O preço não pode ser negativo. O método `setPreco(double)` deve validar isso.

* Crie um método `exibirInfo()` que mostra nome e preço formatado.
* Crie um método público chamado `calcularTotal()` que retorna o valor total do produto em estoque: `preco * quantidade `

No App, instancie um produto, defina os valores e imprima o total calculado.


## Exercício 4

Crie a classe `Carro` com os seguintes atributos privados:

```java
private String marca
private int velocidade
```
Crie os métodos:

* `acelerar(int valor)` → aumenta a velocidade

* `frear(int valor)` → diminui a velocidade, mas não permite que fique abaixo de 0

* `getVelocidade()`
* Crie um método `exibirInfo()` que imprime os dados do carro


No classe App, simule a aceleração e frenagem do carro e exiba a velocidade atual.

## Exercício 5

Crie uma classe `Temperatura` com:

atributo `grausCelsius` (double, privado)

método `setTemperatura(double graus)` → só permite valores entre -273.15 e 1000

método `getTemperatura()`

método `exibirTemperaturaFahrenheit()` → converte e exibe em Fahrenheit

Para converter a temperatura de Celsius (Tc) para Fahrenheit (Tf):

``Tf = 9*Tc/5 + 32``

## Exercício 6

Crie a classe `Musica` com:
```java
String titulo
String artista
int duracao // em segundos
```
Todos os atributos devem ser privados. A duração só pode ser maior que 0.
Crie um método `exibirInfo()` que mostra:

`"Música: [titulo] - [artista] ([minutos]m [segundos]s)"`

## Exercício 7

Crie a classe Pessoa com os atributos privados:

```java
private String nome;
private int idade;
```
* Crie um construtor vazio
* Crie métodos públicos para:

    - Definir o nome (setNome)

    - Definir a idade (setIdade)

    - Obter o nome (getNome)

    - Obter a idade (getIdade)

Na classe `App`, crie um objeto Pessoa, defina os dados usando os métodos set e imprima usando os métodos get.

