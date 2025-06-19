import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Teste do Exercício 6 - Sensores
        System.out.println("=== Leituras dos Sensores ===");
        Sensor temperatura = new SensorTemperatura();
        Sensor umidade = new SensorUmidade();

        System.out.printf("Temperatura: %.2f °C\n", temperatura.lerValor());
        System.out.printf("Umidade: %.2f %%\n", umidade.lerValor());

        // Teste do Exercício 8 - Autenticação
        System.out.println("\n=== Sistema de Autenticação ===");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha para acesso como Usuário Comum: ");
        String senhaUsuario = scanner.nextLine();
        Autenticavel usuario = new UsuarioComum();

        if (usuario.autenticar(senhaUsuario)) {
            System.out.println("Usuário comum autenticado com sucesso!");
        } else {
            System.out.println("Falha na autenticação do usuário comum.");
        }

        System.out.print("\nDigite a senha para acesso como Administrador: ");
        String senhaAdmin = scanner.nextLine();
        Autenticavel admin = new Administrador();

        if (admin.autenticar(senhaAdmin)) {
            System.out.println("Administrador autenticado com sucesso!");
        } else {
            System.out.println("Falha na autenticação do administrador.");
        }

        scanner.close();
    }
}
