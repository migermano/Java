package faccat;
import java.util.Scanner;

public class Exercicio25 {


public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite a quantidade em estoque");
	int quantidadeEstoque = scanner.nextInt();
	System.out.println("Digite a quantidade máxima");
	int quantidadeMaxima = scanner.nextInt();
	System.out.println("Digite a quantidade mínima");
	int quantidadeMinima = scanner.nextInt();
	
	scanner.close();
	
	
	float quantidadeMedia=(quantidadeMaxima-quantidadeMinima)/2;
	
	
	if(quantidadeEstoque>=quantidadeMedia) {
	System.out.println("Não efetuar compra");	
	}
	
	else {
		System.out.println("Efetuar Compra");
	}
}
}
