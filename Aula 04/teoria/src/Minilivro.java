public class Minilivro extends Livro {

public Minilivro(Autor autor) {
        super(autor);
    }

@Override
public boolean aplicaDescontoDe(double porcentagem) {
    return false;
}

}