import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo à Calculadora Java!");

        // Continuar rodando a calculadora até que o usuário decida sair
        boolean continuar = true;
        while (continuar) {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o operador (+, -, *, /): ");
            char operador = scanner.next().charAt(0);

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = calcular(num1, num2, operador);
            System.out.printf("Resultado: %.2f\n", resultado);

            System.out.print("Deseja fazer outra operação? (s/n): ");
            char resposta = scanner.next().charAt(0);
            if (resposta != 's' && resposta != 'S') {
                continuar = false;
            }
        }

        scanner.close();
        System.out.println("Obrigado por usar a Calculadora Java!");
    }

    public static double calcular(double num1, double num2, char operador) {
        switch (operador) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return 0;
                }
                return num1 / num2;
            default:
                System.out.println("Erro: Operador inválido.");
                return 0;
        }
    }
}
