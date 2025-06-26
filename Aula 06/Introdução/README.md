# Aula 07

## List

* É uma **interface** da *Java Collections Framework*.

* Representa uma *coleção ordenada de elementos*, ou seja, você pode acessar os elementos por índice.

* Permite elementos duplicados.

* Não pode ser instanciada diretamente.

Declaração genérica de de uma lista de nomes utilizando o List:

```java
List<String> nomes;
```

## Índices
* Os índices iniciam em 0

* O último índice é sempre `list.size() - 1`

* Os elementos são acessados pelo método `get(indice)`. Exemplo:

```java
List<String> nomes = new ArrayList<>();
nomes.add("João");
nomes.add("Maria");
System.out.println(nomes.get(0)); // imprime João

```
📌 Índices começam em 0 e vão até `list.size() - 1`


## Arraylists

* É uma classe concreta que implementa a interface `List`.
* Pode ser instanciada;

* Usa um array dinâmico internamente, ou seja, cresce automaticamente conforme os elementos são adicionados.

* Ideal quando há muitas leituras/acessos aos dados.


## Laços para percorrer as listas

🔁 2. For com índice

```java
for (int i = 0; i < nomes.size(); i++) {
    System.out.println("Posição " + i + ": " + nomes.get(i));
}
```
🔁 3. For-each (forma mais simples)

```java
for (String nome : nomes) {
    System.out.println(nome);
}
```
Mais limpo, mas não dá acesso direto ao índice.

### Métodos mais usados com List
| Método                    | Descrição                               |
| ------------------------- | --------------------------------------- |
| `add(elemento)`           | Adiciona um item no final               |
| `get(indice)`             | Retorna o item na posição               |
| `size()`                  | Retorna o tamanho da lista (quantidade) |
| `remove(indice ou valor)` | Remove item por posição ou valor        |
| `contains(valor)`         | Verifica se a lista contém o valor      |
| `isEmpty()`               | Verifica se a lista está vazia          |
| `clear()`                 | Remove todos os elementos da lista      |


⚠️ Evite acessar índices fora do tamanho da lista!

O exemplo abaixo exibirá no terminal *IndexOutOfBoundsException*:
```java
List<String> nomes = new ArrayList<>();

nomes.add("João");
nomes.add("Maria");
nomes.add("Matheus");

nomes.get(3); // Erro se a lista só tem 3 elementos (índices 0, 1, 2)
```


