# Aula 02

## Encapsulamento
Os atributos da classe devem ser modificados na própria classe. Todo
atributo de classe deve ser privado, assim garantimos que ninguém os acesse
diretamente e viole as nossas regras de negócio. encapsular é esconder
como funcionam suas regras de negócio, os seus métodos.
encapsulamento deixa nosso código muito mais passível de mu-
danças.

### Visibilidade dos atributos

* default
* public: 
* private
* protected



### Getters e Setters
Se todos os atributos de nossas classes forem private, precisaremos criar
um método sempre que quisermos que alguém consiga adicionar um valor
ao atributo e o mesmo quando quisermos que alguém consiga ler e ex-
ibir este valor.
get = pegar
set = atribuir

```
retornaNome(); -> getNome();
atribuiNome(); -> setNome();
...
```

get não recebe nenhum parâmetro e apenas re-
torna o atributo, enquanto o set sempre recebe um parâmetro com o mesmo
tipo do que o atributo que será atualizado.


### Construtores com parâmetros
podemos obrigar a passagem de alguns valores logo no momento
de criação de nossos objetos

 Requisito: Todo Livro precisa ter um Autor.
    Construtor com parâmetro -> Sempre que um novo Livro for criado, 
    deve receber um Autor como parâmetro
    o compilador não criará mais o construtor default (vazio).
    Portanto, o seguinte código não compila:

```
Livro livro = new Livro();
```
Se eu quiser que seja possível criar um Livro sem autor, deve-se criar na classe
o construtor vazio.

```
public Livro() {

}
```

A mesma classe pode ter mais de um construtor (overloaded de construtor), 
contanto que não tenham a mesma quantidade de parâmetro. 

O exemplo abaixo nao compila.
```
public Livro() {

}

public Livro() {
    System.out.println("Novo livro criado!");
}
```

Encadear construtores

