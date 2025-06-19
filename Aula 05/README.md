# Aula 05

## Interface

Interface em Java é um **contrato** que define métodos sem implementação, que devem ser obrigatoriamente implementados por qualquer classe que a utilize.

## Características:

* Usa a palavra-chave `interface`
* Não é instanciável

* Todos os métodos são públicos e abstratos por padrão

* Pode conter constantes (variáveis `static final`)

* Uma classe pode implementar várias interfaces (diferente da herança de classes)

Uma interface fica da seguinte forma:

```java
public interface Produto {

    //nome do método, com a sua assinatura
    double getValor();
}
```

A classe que implementa, isto é, assina o contrato com Produto, deve utilizar a palavra `implements`, ficando da seguinte forma:

```java
public class Livro implements Produto {

    //implementa todos os métodos declarados na classe Produto
}
```

Utilizar interface diminui o acoplamento entre as classes.

## Quando usar interfaces?

* Quando diferentes classes precisam compartilhar o mesmo conjunto de métodos

* Quando você quer definir um comportamento comum sem se preocupar com herança de atributos

* Para permitir a implementação múltipla (uma classe pode implementar várias interfaces)