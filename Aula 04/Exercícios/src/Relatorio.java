public class Relatorio extends Documento {
    Relatorio(String titulo) {
        super(titulo);
    }

    @Override
    void imprimir() {
        System.out.println("Imprimindo relatório: " + titulo);
    }

}
