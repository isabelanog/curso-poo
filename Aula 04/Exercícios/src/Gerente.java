public class Gerente extends Funcionario {

    @Override
    double calcularSalarioFinal() {
        return salarioBase * 1.2;
    }

}
