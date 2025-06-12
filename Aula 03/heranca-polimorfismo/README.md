# Aula 03 

## Herança
Herança é um princípio da programação orientada a objetos que permite que uma classe (chamada subclasse ou classe filha) *reutilize atributos e métodos* definidos em outra classe (chamada superclasse ou classe mãe).

⚠️ Em Java, uma classe só pode herdar diretamente de uma única superclasse, ou seja, não existe herança múltipla de classes.

Também é possível encadear heranças, criando uma hierarquia de classes (classe A herda de B, que herda de C, e assim por diante). No entanto, esse encadeamento excessivo não é recomendado, pois aumenta o acoplamento entre as classes, dificultando a manutenção e a evolução do código.

A palavra reservada utilizada para denotar que uma classe herda caracterísiticas de outra classe 
é `extends`.

### @Override

Quando extendemos uma classe, podemos reescrever os métodos. Opcionalmente podemos marcar os métodos reescritos com a anotação @Overrride.
Uma anotação é apenas uma marcação, como um post-it com uma observação importante sobre o local anotado

## Polimorfismo
Um mesmo método pode ter comportamentos diferentes dependendo do objeto que o invoca.

Tipos principais:
* Sobrecarga de métodos (compile time): vários métodos com o mesmo nome, mas parâmetros diferentes. Por exemplo, ao invés de escrever o método adiciona duas vezes como mostrado abaixo, podemos
receber como parâmetro a classe pai Livro. 

```
    public void adiciona(LivroFisico livro) {
        System.out.println("Adicionando: " + livro);
    }

    public void adiciona(Ebook livro) {
        System.out.println("Adicionando: " + livro);
    }
```

* Sobrescrita de métodos (runtime): uma subclasse redefine um método da superclasse com um novo comportamento. Por exemplo, na classe Ebook, o método aplicar desconto de tem sua própria lógica de desconto
```
public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }
        double desconto = this.getValor()*porcentagem;
        this.setValor(this.getValor() - desconto);
        return true;
    }
```

⚠️ sempre que possível procure favorecer o uso da composição entre classes no lugar de utilizar herança.