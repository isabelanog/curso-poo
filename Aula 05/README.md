# Aula 05

## Interface

Interface em Java é um **contrato** que define métodos sem implementação, que devem ser **obrigatoriamente implementados** por qualquer classe que a utilize.

## Características:
* **Contrato**: Define um contrato, especificando quais métodos uma classe deve implementar. 
* **Sem implementação**: Interfaces não podem ter implementação de métodos, apenas declarações (assinaturas). 
* **Herança múltipla**: Uma classe pode implementar múltiplas interfaces. 
* **Estado**: Não pode conter campos ou propriedades. 
* **Construtores**: Não pode ter construtores. 
* **Caso de Uso**: Ideal para definir comportamentos que classes não relacionadas podem compartilhar ou para garantir que classes diferentes implementem o mesmo conjunto de métodos. 
* Todos os métodos são públicos e abstratos por padrão
* Pode conter constantes (variáveis `static final`)

Uma interface em java fica da seguinte forma:

```java
public interface Animal {
    void emitirSom();
    void dormir();
}
```

A classe `Cachorro,` que implementa a classe Produto, isto é, assina o contrato com Produto, deve utilizar a palavra reservada `implements` ficando da seguinte forma:

```java
public class Cachorro implements Animal {

    private String nome;

    public Cachorro(String nome) {
        this.nome = nome;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz au au!");
    }

    @Override
    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }
}
```

Utilizar interface diminui o acoplamento entre as classes.

## Quando usar interfaces?

* Quando diferentes classes precisam compartilhar o mesmo conjunto de métodos

* Quando você quer definir um comportamento comum sem se preocupar com herança de atributos

* Para permitir a implementação múltipla (uma classe pode implementar várias interfaces)


## Classe abstrata vs interface

| Característica             | Classe Abstrata                              | Interface                                  |
|---------------------------|---------------------------------------------|-------------------------------------------|
| **Herança**               | Pode estender apenas uma classe (single inheritance) | Pode implementar várias interfaces (multiple inheritance) |
| **Métodos**              | Pode ter métodos abstratos e métodos concretos (implementados) | Todos os métodos são abstratos por padrão (em Java 7 ou inferior); a partir de Java 8, pode ter métodos default e static |
| **Atributos**            | Pode ter atributos com estado (variáveis de instância) | Não possui estado (apenas constantes públicas e estáticas) |
| **Construtores**        | Pode ter construtor                            | Não pode ter construtor                    |
| **Acesso**             | Pode ter modificadores de acesso (public, protected, private) | Métodos são sempre públicos (por padrão) |
| **Finalidade**           | Usada para compartilhar código entre classes relacionadas | Usada para definir um contrato (comportamento) que deve ser implementado |
| **Implementação parcial** | Pode conter implementação parcial           | Não contém implementação (exceto métodos default ou static a partir de Java 8) |

