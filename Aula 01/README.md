
# Programação Orientada a Objetos

Foco: está em **quem** está realizando a ação. Você estrutura o código em torno de **objetos** — entidades que têm **dados (atributos)** e **ações (métodos)**.

**Características**:

- Usa conceitos como **classe, objeto, herança, polimorfismo, encapsulamento, abstração**
- Enfatiza a modelagem do mundo real
- Código mais modular, reutilizável e de fácil manutenção

## Definição de objeto

Coisa **material** ou **abstrata** que pode ser percebida pelos sentidos e descrita por meio das suas **características**, **comportamentos** e **estado atual**.

Ex de objeto: caneta

- Caracterísitcas: modelo, cor, ponta, carga, tampada → atributos
- Comportamentos: escrever, rabiscar, pintar, tampar, destampar → metodos
- Estado atual: Como a caneta está agora? Tampada, aberta, seca…

Objetos de exemplo a serem abordados:

![UML.png](UML.png)

## Denifição de classe

Uma classe é um molde, especificação que define para a máquina virtual o que um objeto desse tipo deverá ter e como ele deve se comportar. Também, define os atributos e métodos comuns que serão compartilhados por um objeto.

⚠️Uma classe não é necessariamente é um objeto.

Como crio um objeto? Instanciando uma classe! O objeto é uma instância de uma classe.

```java
public class Livro {
		String nome;
		String descricao;
		double valor;
} 
```

Para criar um objeto a partir do molde:

```java
Livro livro = new Livro();
```

Observações importantes:

- Abstração: quais são os atributos que importa no momento?!

## Comparação entre objetos

Quando criamos um novo objeto com a palavra `new`, como `new Autor()`, a variável não guarda as informações do autor (como nome ou e-mail), mas sim um caminho para acessar esse objeto na memória do computador. É como guardar o endereço de uma casa, e não a casa inteira.

Por isso, quando usamos `==`, estamos comparando os endereços, e não o conteúdo dos objetos. Como cada objeto novo tem um endereço diferente, mesmo que tenham os mesmos dados, `==` vai dizer que são diferentes.

```java
Autor autor = new Autor();
	autor.nome = "Isabela Nogueira";
	autor.email = "isabela@email.com";
	autor.cpf = "123.456.789.10";
        
Autor outroAutor = new Autor();
	outroAutor.nome = "Isabela Nogueira";
	outroAutor.email = "isabela@email.com";
	outroAutor.cpf = "123.456.789.10";
	

```

Na classe **App.class**:

```java
if (autor == outroAutor) {
	System.out.println("Mesmo autor!");
} else {
	System.out.println("Autores diferentes!");
}
```

O output impresso no console será: `Autores diferentes!`

## Métodos

- `void` → **não retorna nada** (só executa uma ação)

```java
    void mostrarDetalhesLivro() { 
		String mensagem = "Mostrando detalhes do livro: ";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição :" + descricao);
        System.out.println("Valor: R$" + valor);
  }
```

- Tipos primitivos → como `int`, `double`, `boolean`, etc.

```java
boolean temAutor() {

        boolean autorExiste;

        if (this.autor != null) {
            autorExiste = true;
        } else {
            autorExiste = false;
        }

        return autorExiste;
    }
```

- Objetos → retorna outro objeto, como String, Autor, List<Livro>, etc.

```java
Autor retornaAutor() {

        boolean autorExiste;

        if (this.autor != null) {
            System.out.println("O autor do livro é: " + this.autor.nome);
        } else {
            autorExiste = false;
            System.out.println("O livro não tem autor!");
        }

        return this.autor;
    }
```

## Construtor

O construtor é um método especial usado para criar e inicializar objetos de uma classe. Por exemplo, quando escrevemos a instrução `Pessoa()` seguida da palavra reservada `new` estamos pedindo para a JVM procurar a classe `Pessoa` e invocar o seu construtor, que se parece com:

```java
public class Pessoa {
	
    public Pessoa() {
	
    }
}
```
### Características
* Tem o mesmo nome da classe
* Não possui um tipo de retorno
* Pode ter parâmetros ou não

Se não for criado um construtor para a classes, o compilador fará isso para você.

### Tipos

* Construtor vazio:
```java
public class Pessoa {

    public Pessoa() {
        System.out.println("Construtor padrão chamado");
    }
}
```

⚠️ Se você criar qualquer construtor, o Java não cria mais o construtor vazio automaticamente. Aí você precisa criá-lo manualmente, se quiser usá-lo.

* Construtor com Parâmetros

É um construtor que recebe valores para inicializar os atributos do objeto no momento da criação.
 ```java
 public class Pessoa {
    
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
}
 ```

 * Construtores Sobrecargados (Overloaded)

 Vários construtores na mesma classe, com quantidades ou tipos diferentes de parâmetros. Isso é chamado de sobrecarga de construtores.

 ```java
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {
        // Construtor vazio
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

 ```