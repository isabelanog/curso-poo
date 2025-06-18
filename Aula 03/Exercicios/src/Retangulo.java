public class Retangulo extends FormaGeometrica {
    
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        setNumeroDeLados(4);
    }

    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("Área do retângulo: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2 * (base + altura);
        System.out.println("Perímetro do retângulo: " + perimetro);
    }

}
