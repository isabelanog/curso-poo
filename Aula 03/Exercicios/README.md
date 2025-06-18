# Aula 03 - Exercícios

## Exercício 01
Crie uma classe `Pessoa` com os atributos `nome` e `idade`, e um método `exibirDados()` que imprime essas informações.

Crie uma classe `Aluno` que herda de Pessoa e adicione o atributo `matricula`. Reescreva o método `exibirDados()` para também exibir a matrícula.

## Exercício 02

Reaproveite as classes `Pessoa` e `Aluno`. No método `exibirDados()` da classe `Aluno`, utilizes `super.exibirDados()` para não repetir o código da classe mãe. Depois, exiba a matrícula.

## Exercício 03
Crie uma classe Animal com um método fazerSom().
Crie duas subclasses: `Cachorro` e `Gato`, que sobrescrevem o método `fazerSom()` com os sons correspondentes (“Latido” e “Miau”).


## Exercício 04

Crie uma classe `Mensagem` com um método `enviar()`, que imprime "Enviando mensagem genérica".
Crie duas subclasses: `MensagemTexto` e `MensagemEmail` que sobrescrevem o método `enviar()` com mensagens específicas:

"Enviando mensagem de texto..."

"Enviando e-mail..."

## Exercício 05
Crie uma classe Transporte com um método `mover()`.
Crie as subclasses `Bicicleta`, `Carro` e `Avião`, cada uma sobrescrevendo `mover()` com mensagens diferentes:

Bicicleta: “Pedalando…”

Carro: “Dirigindo…”

Avião: “Voando…”


## Exercício 06

Crie a classe `FormaGeometrica` com os seguintes elementos:

Atributo privado: int `numeroDeLados`

Métodos: Getters e setters para o atributo `numeroDeLados`

Método void `calcularArea()` que exibe uma mensagem genérica, como:
```
System.out.println("Calculando área...");
```

Método void `calcularPerimetro()` que exibe uma mensagem genérica, como:

```
System.out.println("Calculando perímetro...");
```

Classe `Retangulo` (herda de FormaGeometrica)
Atributos privados:

double `base`

double `altura`

Construtor que receba base e altura como parâmetros

No construtor, defina `numeroDeLados` como 4, utilizando o setter herdado

Sobrescreva os métodos `calcularArea()` e `calcularPerimetro()` com as seguintes fórmulas:

* `Área = base × altura`

* `Perímetro = 2 × (base + altura)`

Os métodos devem imprimir o valor calculado no terminal

Crie a classe `Quadrado` (herda de FormaGeometrica)
Atributo privado:

double `lado`

Construtor que receba o `lado` como parâmetro

No construtor, defina `numeroDeLados` como 4

Sobrescreva os métodos `calcularArea()` e `calcularPerimetro()` com as seguintes fórmulas:

* `Área = lado × lado`

* `Perímetro = 4 × lado`

Os métodos devem imprimir o valor calculado no terminal

