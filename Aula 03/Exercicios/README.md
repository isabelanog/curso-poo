# Exercícios

Em todos os exercícios obedeça aos princípios de Encapsulamento e Herança.

## Exercício 01
Crie uma classe `Pessoa` com os atributos `nome` e `idade`, e um método `exibirDados()` que imprime essas informações.

Crie uma classe `Aluno` que herda de Pessoa e adicione o atributo `matricula`. Reescreva o método `exibirDados()` para também exibir a matrícula.

## Exercício 02

Reaproveite as classes `Pessoa` e `Aluno`. No método `exibirDados()` da classe `Aluno`, utilizes `super.exibirDados()` para não repetir o código da classe mãe. Depois, exiba a matrícula.

## Exercício 03

Crie uma classe `Animal` com um método `fazerSom()`.
Crie duas subclasses: `Cachorro` e `Gato`, que sobrescrevem o método `fazerSom()` com os sons correspondentes (“Latido” e “Miau”).


## Exercício 04

Crie uma classe `Mensagem` com um método `enviar()`, que imprime "Enviando mensagem genérica".
Crie duas subclasses: `MensagemTexto` e `MensagemEmail` que sobrescrevem o método `enviar()` com mensagens específicas:

`"Enviando mensagem de texto..."`

`"Enviando e-mail..."`

## Exercício 05

Crie uma classe `Transporte` com um método `mover()`.
Crie as subclasses `Bicicleta`, `Carro` e `Avião`, cada uma sobrescrevendo `mover()` com mensagens diferentes:

`Bicicleta: “Pedalando…”`

`Carro: “Dirigindo…”`

`Avião: “Voando…”`

## Exercício 06

Crie a classe `FormaGeometrica` com o seguinte atributo:

`int numeroDeLados`

Crie o método void `calcularPerimetro()` que exibe uma mensagem genérica, como:

```
System.out.println("Calculando perímetro...");
```

Crie a classe as subclasses `Quadrado` e `Triângulo`.

Sobrescreva o método `calcularPerimetro()` com as seguintes fórmulas e exiba no terminal o valor.

 ```
 Perímetro do triângulo: 30cm
 ```

Considere que o triângulo tem a medida dos lados iguais.
Perímetro é dada pela soma das medidas dos lados.


