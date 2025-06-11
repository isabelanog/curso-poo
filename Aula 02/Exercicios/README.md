# Exercícios Aula 10

## Exercício 1

Crie uma classe `Aluno` com os seguintes atributos:

`nome` (String)

`idade` (int)

Ambos os atributos devem ser privados.
Implemente os métodos públicos `getNome()`, `setNome()`, `getIdade()` e `setIdade()`.

Na classe App com o método main:

* Crie um objeto da classe Aluno
* Atribua valores usando os setters
* Exiba as informações usando os getters

## Exercício 2

Modifique a classe `Aluno` para que o método `setIdade(int idade)` só permita valores entre 0 e 120. Caso contrário, exiba uma mensagem de erro e não altere o valor da idade.

Teste com valores válidos e inválidos no main.

## Exercício 3

Crie uma classe `Produto` com:

`nome` (String)

`preco` (double)

O preço não pode ser negativo. O método `setPreco(double)` deve validar isso.

Crie um método `exibirInfo()` que mostra nome e preço formatado.

## Exercício 4

Crie a classe `Carro` com os seguintes atributos privados:

`marca` (String)

`velocidade` (int)

Crie os métodos:

`acelerar(int valor)` → aumenta a velocidade

`frear(int valor)` → diminui a velocidade, mas não permite que fique abaixo de 0

`getVelocidade()`

No main, simule a aceleração e frenagem do carro e exiba a velocidade atual.

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

`titulo` (String)

`artista` (String)

`duracao` (int, em segundos)

Todos os atributos devem ser privados. A duração só pode ser maior que 0.
Crie um método exibirInfo() que mostra:

`"Música: [titulo] - [artista] ([minutos]m [segundos]s)"`
