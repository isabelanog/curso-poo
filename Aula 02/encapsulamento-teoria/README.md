# Aula 02

## Encapsulamento

Encapsulamento é um dos princípios fundamentais da programação orientada a objetos. Ele consiste em **proteger os dados de uma classe**, permitindo que seus atributos sejam acessados e modificados apenas por meio de métodos definidos dentro da própria classe.

Ao tornar os atributos **privados**, impedimos o acesso direto a eles por outras classes. Dessa forma, garantimos que qualquer alteração nos dados respeite as **regras de negócio**, mantendo a integridade das informações.

Encapsular é, portanto, **esconder os detalhes internos da implementação** e expor apenas o necessário por meio de métodos públicos — geralmente chamados de *getters* e *setters*. Isso torna o código mais seguro, organizado e **mais fácil de manter e evoluir**, pois mudanças na lógica interna não afetam outras partes do sistema que utilizam a classe.

### Visibilidade dos atributos

* default
* public: 
* private
* protected

### Getters e Setters

**Getters** e **setters** são métodos especiais usados para **acessar e modificar os atributos privados** de uma classe.

Quando aplicamos o princípio do **Encapsulamento**, os atributos de uma classe são declarados como `private`, ou seja, não podem ser acessados diretamente de fora da classe. Para permitir esse acesso de forma controlada, utilizamos os **métodos getters e setters**.

```
retornaNome(); -> getNome();
atribuiNome(); -> setNome();
...
```

* `get` : não recebe nenhum parâmetro e tem como única função **retornar** o valor de um atributo.

* `set` : **recebe** um parâmetro com o mesmo tipo do atributo e é responsável por **atualizar** o valor desse atributo.


### Construtores com parâmetros
Na criação de um objeto em Java, podemos exigir que certos valores sejam informados logo no momento da instância. Isso é feito por meio de construtores com parâmetros.

 Por exermplo: Todo Livro deve ter obrigatoriamente um Autor.
Para garantir isso, podemos criar um construtor com parâmetro que receba o autor. Ao fazer isso, o compilador não cria mais o construtor padrão (vazio) automaticamente. Nesse caso, o seguinte código não irá compilar:

```
Livro livro = new Livro();
```
Se você quiser permitir a criação de um livro sem informar o autor, precisa criar manualmente o construtor vazio na classe:

```
public Livro() {
    // construtor vazio
}
```
⚠️ A mesma classe pode ter mais de um construtor (overloaded de construtor), 
contanto que não tenham a mesma assinatura.  O exemplo abaixo não compila, pois ambos têm a mesma quantidade e tipo de parâmetros:

```
public Livro() {

}

public Livro() {
    System.out.println("Novo livro criado!");
}
```

