public class Carro {
    
    private String marca;
    private int velocidade;

    public void exibirInfo() {
        System.out.println("Exibindo informações do carro");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Velocidade: " + this.getVelocidade());
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void acelerar(int valor) {
        velocidade += valor;
    }

    public void frear(int valor) {
        velocidade -= valor;
        if (velocidade < 0) {
            velocidade = 0;
        }
    }

    public int getVelocidade() {
        return velocidade;
    }
}
