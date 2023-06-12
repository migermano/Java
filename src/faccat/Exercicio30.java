package faccat;
import java.util.Scanner;

public class Exercicio30 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite a quantidade de morangos (em Kg): ");
	        double quantidadeMorangos = scanner.nextDouble();

	        System.out.println("Digite a quantidade de maçãs (em Kg): ");
	        double quantidadeMacas = scanner.nextDouble();

	        scanner.close();

	        double precoMorangoAte5Kg = 2.50;
	        double precoMorangoAcima5Kg = 2.20;
	        double precoMacaAte5Kg = 1.80;
	        double precoMacaAcima5Kg = 1.50;

	        double valorMorangos;
	        double valorMacas;
	        double valorTotal;

	        if (quantidadeMorangos <= 5) {
	            valorMorangos = quantidadeMorangos * precoMorangoAte5Kg;
	        } else {
	            valorMorangos = quantidadeMorangos * precoMorangoAcima5Kg;
	        }

	        if (quantidadeMacas <= 5) {
	            valorMacas = quantidadeMacas * precoMacaAte5Kg;
	        } else {
	            valorMacas = quantidadeMacas * precoMacaAcima5Kg;
	        }

	        valorTotal = valorMorangos + valorMacas;

	        if (quantidadeMorangos + quantidadeMacas > 8 || valorTotal > 25) {
	            valorTotal *= 0.9; // Aplicar desconto de 10% se a condição for verdadeira
	        }

	        System.out.println("Valor a ser pago pelo cliente: R$ %.2f%n", valorTotal);
	    }
}
