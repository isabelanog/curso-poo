public abstract class Livro implements Produto {

    private String nome;
    private String descricao;
    private double valor;
    private Autor autor;

    /*
     * por padrão, os Livros não tem desconto. A regra para cada tipo de livro
     * deve ser escrita na sua respectiva classe
     */

    // public boolean aplicaDescontoDe(double porcentagem) {
    // return false;
    // }

    // método abstrato

    public Livro(Autor autor) {
        this.autor = autor;
    }

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

}
