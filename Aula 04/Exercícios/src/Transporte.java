public abstract class Transporte {

String modelo;
    int capacidade;

    void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidade: " + capacidade);
    }

    abstract void mover();

}
