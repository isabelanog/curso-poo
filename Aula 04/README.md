# Aula 04

## Classe Abstrata
Uma classe abstrata é uma classe que **não pode ser instanciada** diretamente e **serve como modelo** base para outras classes.

No nosso exemplo, a classe `Livro` é uma abstração dos tipos `Ebook` e `LivroFisico`. Então ela fica da seguinte forma:

```java
public abstract class Animal {

    // Atributo comum
    protected String nome;

    // Construtor
    public Animal(String nome) {
        this.nome = nome;
    }

    // Método concreto (já implementado)
    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    // Método abstrato (deve ser implementado pelas subclasses)
    public abstract void emitirSom();
}
```

A subclasse Animal que herda a classe abstrata Animal fica da seguinte forma:

```java
public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz au au!");
    }
}
```

A classe abstrada isola todos os os atributos e comportamentos que são um padrão entre os diferentes tipos de livro. A classe passa a *servir exclusivamente para herança e polimorfismo.

### Características

- **Implementação parcial**: Uma classe abstrata pode ter métodos com implementação (código) e métodos abstratos (sem implementação). 
- **Herança**: Permite herança única, onde uma classe pode estender apenas uma classe abstrata. 
- **Estado**: Pode conter campos (variáveis de instância) e propriedades. 
- **Construtores**: Pode ter construtores. 
- **Caso de Uso**: Útil quando se deseja fornecer uma implementação padrão para algumas funcionalidades, compartilhando código entre classes relacionadas

### Observações
-  Uma classe pode ser abstrata sem ter nenhum método abstrato. 
- A partir do momento em que a classe se torna abstrata, nenhum código poderá mais instanciá-la.
- Para os métodos serem abstratos, a classe deve ser abstrata. 
- Uma classe abstrata pode ter métodos abstratos e não abstratos 
- Toda classe filha (subclasse) precisa implementar os métodos abstratos da classe mãe (superclasse). 

### Quando usar?
Use uma classe abstrata quando:

* Você quer definir um comportamento genérico para várias classes filhas

* Deseja forçar subclasses a implementarem certos métodos

### Métodos abstratos

Toda classe filha (subclasse) concreta (não abstrata) é obrigada a escrever os métodos abstratos da classe pai (superclasse),
Apenas classes abstratas podem ter métodos abstratos.


Por exemplo, ao tornamos o método `aplicaDescontoDe()` da classe Livro
como abstrato, todas as classes filhas **deverão** escrevê-lo.


## Classe Abstrata vs Herança

### Herança usando classe concreta

Quando você cria uma classe concreta (normal), e outras classes a estendem, todo o código da classe base já está totalmente implementado, e as subclasses apenas herdam ou sobrescrevem comportamento.

**Limitação**: Se for obrigatório que as subclasses implementem certos métodos, você não consegue forçar isso diretamente. As subclasses podem simplesmente herdar tudo sem modificar nada. Se for obrigatório que as subclasses implementem certos métodos, você não consegue forçar isso diretamente. As subclasses podem simplesmente herdar tudo sem modificar nada.

### Classe Abstrata

Uma classe abstrata permite definir um esqueleto comum, **forçando** as subclasses a implementar certos comportamentos (métodos abstratos).

Você pode também já deixar parte do código pronto (métodos concretos) e definir métodos que devem ser implementados por quem estender.


### Principais vantagens da classe abstrata sobre apenas herança comum

| Vantagem                      | Explicação                                                                                       |
|-------------------------------|--------------------------------------------------------------------------------------------------|
| **Forçar implementação**      | Você pode garantir que certas funcionalidades sejam obrigatórias nas subclasses.                 |
| **Código parcialmente pronto**| Permite compartilhar código comum e ainda exigir personalização.                                 |
| **Maior flexibilidade**       | Mistura de métodos concretos e abstratos permite definir um "molde" para as subclasses.        |
| **Base mais clara**           | Indica explicitamente que a classe não deve ser instanciada diretamente, servindo apenas como base. |
