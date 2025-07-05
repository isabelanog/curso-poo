import java.util.Scanner;

public class Ebook extends Livro {

    public Ebook() {

    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo.toUpperCase();
    }

}
