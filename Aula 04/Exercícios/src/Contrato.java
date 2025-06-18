public class Contrato extends Documento {

     Contrato(String titulo) {
        super(titulo);
    }

    @Override
    void imprimir() {
        System.out.println("Imprimindo contrato: " + titulo);
    }

}
