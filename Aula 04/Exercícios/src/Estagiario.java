public class Estagiario extends Funcionario {
    @Override
    double calcularSalarioFinal() {
        return salarioBase * 0.9;
    }

}
