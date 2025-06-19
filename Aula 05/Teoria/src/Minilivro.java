public class Minilivro extends Livro implements Produto {

    public Minilivro(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        return false;
    }

}