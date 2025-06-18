public abstract class Documento {
     String titulo;

    Documento(String titulo) {
        this.titulo = titulo;
    }

    abstract void imprimir();

}
