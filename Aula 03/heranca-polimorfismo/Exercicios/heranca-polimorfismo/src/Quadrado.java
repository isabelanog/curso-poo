public class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
        setNumeroDeLados(4);
    }

    @Override
    public void calcularArea() {
        double area = lado * lado;
        System.out.println("Área do quadrado: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 4 * lado;
        System.out.println("Perímetro do quadrado: " + perimetro);
    }

}
