package faccat;
import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor1 = scanner.nextInt();

		System.out.println("Digite outro valor: ");
		int valor2 = scanner.nextInt();
		
		scanner.close();
		
		if(valor1==valor2) {
			System.out.println("Números iguais");
		}
		else if(valor1>valor2){
			System.out.println("O Primeiro é maior");
		}
		
		else {
			System.out.println("O Segundo é maior");
		}
		
		
	}

}
