# Exercícios

## Exercício 1
Crie uma classe abstrata chamada `Animal` com os seguintes elementos:

* atributo `String nome`

* Um método concreto `void dormir()` que imprime: ```"<nome> está dormindo."```

* Um método abstrato void `emitirSom()`

* Crie uma classe `Cachorro` que herda de Animal, e implemente o método `emitirSom()` para imprimir:
"Au au!"

* Crie uma classe Gato que herda de Animal, e implemente o método `emitirSom()` para imprimir:
"Miau!"

Na classe `App`, instancie objetos de `Cachorro` e `Gato`, defina seus nomes e chame os métodos `dormir()` e `emitirSom()`.


## Exercício 2

Crie uma classe abstrata chamada Transporte com os atributos:

```java 
String modelo

int capacidade
```

E os métodos:

`void exibirInfo()` → imprime modelo e capacidade

`abstract void mover()`

Crie duas classes que herdam de `Transporte`:

`Carro` → imprime `"Carro se movendo sobre rodas"`

`Barco` → imprime `"Barco se movendo na água"`

Na classe `App`, instancie um Carro e um Barco e chame os métodos.


## Exercício 3

Crie uma classe abstrata chamada Funcionario com os atributos:

```java
String nome

double salarioBase
```

E o método abstrato:

`double calcularSalarioFinal()`

Crie duas subclasses:

`Gerente` → salário final é salário base + 20%

`Estagiario` → salário final é salário base - 10%

Na classe `App`, imprima os salários finais de cada tipo de funcionário.

## Exercício 4
Crie uma classe abstrata chamada `ContaBancaria` com:

Atributo: `double saldo`

Método concreto: `void depositar(double valor)`

Método abstrato: `void sacar(double valor)`

Crie duas subclasses:

`ContaCorrente` → permite saque normalmente

`ContaPoupanca` → não permite saque acima do saldo

Teste o comportamento no `App`.

## Exercício 5

Crie uma classe abstrata chamada `Documento` com:

Atributo: `String titulo`

Método abstrato: `void imprimir()`

Crie duas subclasses:

`Relatorio` → imprime "Imprimindo relatório: <titulo>"

`Contrato` → imprime "Imprimindo contrato: <titulo>"

No `App`, use polimorfismo para criar uma lista de documentos e imprimir todos.

