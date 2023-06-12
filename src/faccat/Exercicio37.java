package faccat;

import java.util.Scanner;

public class Exercicio37 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        double valor2;
        do {
            System.out.print("Digite o segundo valor (que não seja 0): ");
            valor2 = scanner.nextDouble();
            if (valor2 == 0) {
                System.out.println("Valor Inválido");
            }
        } while (valor2 == 0);

        scanner.close();

        double resultado = valor1 / valor2;
        System.out.println("Resultado da divisão: " + resultado);
    }
}
