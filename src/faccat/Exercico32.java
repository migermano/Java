package faccat;
import java.util.Scanner;

public class Exercico32 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o nome do produto: ");
	        String nomeProduto = scanner.nextLine();

	        System.out.print("Digite a quantidade adquirida: ");
	        int quantidadeAdquirida = scanner.nextInt();

	        System.out.print("Digite o preço unitário: ");
	        double precoUnitario = scanner.nextDouble();

	        scanner.close();

	        double total = quantidadeAdquirida * precoUnitario;
	        double desconto = 0.0;
	        double totalPagar = total;

	        if (quantidadeAdquirida <= 5) {
	            desconto = total * 0.02; // Desconto de 2%
	        } else if (quantidadeAdquirida <= 10) {
	            desconto = total * 0.03; // Desconto de 3%
	        } else {
	            desconto = total * 0.05; // Desconto de 5%
	        }

	        totalPagar = total - desconto;

	        System.out.println("Nome do produto: " + nomeProduto);
	        System.out.println("Total: R$ " + total);
	        System.out.println("Desconto: R$ " + desconto);
	        System.out.println("Total a pagar: R$ " + totalPagar);
	    }
}
