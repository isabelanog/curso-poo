public interface Produto {
    // exemplo, as classes só irão compilar se implementarem os métodos que
    // estiverem nesta interface

    double getValor();

    boolean aplicaDescontoDe(double taxa);
}
