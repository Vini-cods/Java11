import java.util.Scanner;

public class Calculadora {

    public double somar(double a, double b){
        return a + b;
    }

    public double subtrair(double a, double b){
        return a - b;
    }

    public double dividir(double a, double b){
        if (b == 0) {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
        return a / b;
    }

    public double multiplicar(double a, double b){
        return a * b;
    }

    public double restoDivisao(double a, double b){
        return a % b;
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===CALCULADORA===");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        System.out.println("5 - Resto da divisão");
        System.out.println("Escolha uma opção");

        int opcao = scanner.nextInt();

        System.out.println("Digite o primeiro número");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número");
        double num2 = scanner.nextDouble();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + somar(num1, num2));
                break;

            case 2:
                System.out.println("Resultado: " + subtrair(num1, num2));
                break;

            case 3:
                System.out.println("Resultado: " + dividir(num1, num2));
                break;

            case 4:
                System.out.println("Resultado: " + multiplicar(num1, num2));
                break;

            case 5:
                System.out.println("Resultado: " + restoDivisao(num1, num2));
                break;

            default:
                System.out.println("Opção inválida!!");
        }
        scanner.close();

    }

        public static void main(String[] args) {
            Calculadora calculadora = new Calculadora();
            calculadora.exibirMenu();

    }
}
