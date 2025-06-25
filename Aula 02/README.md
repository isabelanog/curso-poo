# Aula 02

## Encapsulamento

Encapsulamento é um dos princípios fundamentais da programação orientada a objetos. Ele consiste em **proteger os dados de uma classe**, permitindo que seus **atributos sejam acessados e modificados apenas por meio de métodos** definidos dentro da própria classe.

Ao tornar os atributos **privados**, impedimos o acesso direto a eles por outras classes. Dessa forma, garantimos que qualquer alteração nos dados respeite as regras de negócio, mantendo a integridade das informações.

Encapsular é, portanto, **esconder os detalhes internos da implementação** e expor apenas o necessário por meio de métodos públicos — geralmente chamados de *getters* e *setters*. Isso torna o código mais seguro, organizado e **mais fácil de manter e evoluir**, pois mudanças na lógica interna não afetam outras partes do sistema que utilizam a classe.

No exemplo da Aula 01, para a classe `Livro` obedecer ao princípio do Encapsulamento  os atributos devem ficar com a visibilidade *private*, da seguinte forma:
```java
public class Livro {
    
    private String nome;
    private String descricao;
    private double valor;
} 
```

### Métodos Getters e Setters

**Getters** e **setters** são métodos especiais usados para **acessar e modificar os atributos privados** de uma classe.

```java
retornaNome(); -> getNome();
atribuiNome(); -> setNome();
...
```

* `get` : não recebe nenhum parâmetro e tem como única função **retornar** o valor de um atributo.

* `set` : **recebe** um parâmetro com o mesmo tipo do atributo e é responsável por **atualizar** o valor desse atributo.

Ainda no exemplo da Aula 01, a classe `Livro` terá os métodos get e set para cada atributo da seguinte forma:

```java
public class Livro {
    
    private String nome;
    private String descricao;
    private double valor;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) { 
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) { 
        this.descricao = descricao;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) { 
        this.valor = valor;
    }
} 
```