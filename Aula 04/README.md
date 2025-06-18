# Aula 04

## Classe Abstrata
Uma classe abstrata é uma classe que **não pode ser instanciada** diretamente e **serve como modelo** base para outras classes.

No nosso exemplo, a classe `Livro` é uma abstração dos tipos `Ebook` e `LivroFisico`. Então ela fica da seguinte forma:

```java
public class abstract Livro {

}
```

A classe abstrada isola todos os os atributos e comportamentos que são um padrão entre os diferentes tipos de livro. A classe passa a servir exclusivamente para herança e polimorfismo.

### Características

* Uma classe pode ser abstrata sem ter nenhum método abstrato. 
* A partir do momento em que a classe se torna abstrata, nenhum código poderá mais instanciá-la.
* Para os métodos serem abstratos, a classe deve ser abstrata. 
* Uma classe abstrata pode ter métodos abstratos e não abstratos 
* Toda classe filha (subclasse) precisa implementar os métodos abstratos da classe pai (superclasse). 

### Quando usar?
Use uma classe abstrata quando:

* Você quer definir um comportamento genérico para várias classes filhas

* Deseja forçar subclasses a implementarem certos métodos

## Métodos abstratos

Toda classe filha (subclasse) concreta (não abstrata) é obrigada a escrever os métodos abstratos da classe pai (superclasse),
Apenas classes abstratas podem ter métodos abstratos.


A partir do momento em que tornamos o método aplicaDescontoDe
abstrato, todas as classes filhas precisam escrevê-lo