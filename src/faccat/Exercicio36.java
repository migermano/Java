package faccat;
import java.util.Scanner;

public class Exercicio36 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor (que não seja 0): ");
        double valor2 = scanner.nextDouble();

        while (valor1 == 0) {
            System.out.print("Valor inválido! Digite o segundo valor (que não seja 0): ");
            valor2 = scanner.nextDouble();
        }

        scanner.close();

        double resultado = valor1 / valor2;
        System.out.println("Resultado da divisão: " + resultado);
    }
}
