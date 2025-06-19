# Aula 07

## List

* É uma **interface** da Java Collections Framework.

* Representa uma *coleção ordenada de elementos*, ou seja, você pode acessar os elementos por índice.

* Permite elementos duplicados.

* Não pode ser instanciada diretamente.

Declaração genérica de List:

```java
List<String> nomes;
```

## Arraylists

* É uma classe concreta que implementa a interface `List`.
* Pode ser instanciada;

* Usa um array dinâmico internamente, ou seja, cresce automaticamente conforme os elementos são adicionados.

* Acesso por índice é rápido (como em arrays comuns).

* Ideal quando há muitas leituras/acessos aos dados.


Exemplo:

```java

List<String> nomes = new ArrayList<>();
nomes.add("João");
nomes.add("Maria");
System.out.println(nomes.get(0)); // imprime João

```

## Exercícios

### Exercício 1
Crie um programa que:

* Crie uma `ArrayList<String>` chamada nomes

* Adicione 3 nomes à lista

* Imprima todos os nomes usando um laço for

### Exercício 2
* Crie uma lista de inteiros `List<Integer>`

* Adicione os números: 10, 20, 30, 40 e 50

* Imprima o primeiro e o último elemento da lista

* Mostre o tamanho da lista utilizando o método `size()`

### Exercício 3

Crie uma lista com os nomes: Ana, Bruno, Carla, Diego

Remova o nome “Bruno” usando o método `remove()`

Imprima a lista após a remoção


### Exercício 4

Crie uma lista com frutas: Maçã, Banana, Uva

Verifique se “Banana” está na lista usando o método `contains()`

Imprima uma mensagem:

“Está na lista” ou

“Não está na lista”

### Exercício 5

Crie uma classe `Livro` com os atributos:

```java
String titulo;
String autor;
```
* Crie uma lista de livros `List<Livro>`

* Adicione 3 livros à lista

* Imprima os títulos dos livros usando um for-each

### Exercício 6

Crie uma lista de números inteiros

Adicione os números: 5, 1, 8, 3, 2

Ordene a lista com `Collections.sort()`

Imprima a lista ordenada

### Exercício 7

Crie uma lista com nomes

Use um `for` com índice `for (int i = 0; i < list.size(); i++)`

Imprima:
```
"Posição X: nome"
```