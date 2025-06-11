public class Livro {
    
    // Encapsulamento: modificar a visibilidade dos atributos da classe

    private String nome;
    private String descricao;
    private double valor;
    private Autor autor;

    
    String retornaNome() {
        return this.nome;
    }
    
    void atribuiNome(String nome) {
        this.nome = nome;
    }

    String retornaDescricao() {
        return this.descricao;
    }
    
    void atribuiDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    double retornaValor() {
        return this.valor;
    }

    void atribuiValor(double valor) {
        this.valor = valor;
    }

    String retornaNomeAutor() {
        
        if (this.autor != null) {
            return "O autor do livro é: " + this.autor.getNome();
        } else {
            return "O livro não tem autor!";
        }
    }

    void atribuiAutor(Autor autor) {
        this.autor = autor;
    }

    
    //modificar para get e set

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }


    public Livro(Autor autor) {
        this();
        this.autor = autor;
    }


    public Livro() {
        this.nome = "Nome padrão do livro";
    }
}
