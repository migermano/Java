package faccat;
import java.util.Scanner;

public class Exercicio24 {

	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o numero de sua conta: ");
		double numeroConta = scanner.nextDouble();
		
		System.out.println("Digite seu saldo : ");
		double saldo = scanner.nextDouble(); 
		
		System.out.println("Digite o valor de seu débito: ");
		double debito = scanner.nextDouble();
		
		System.out.println("Digite seu crédito: ");
		double credito = scanner.nextDouble();
		
		scanner.close();
		
		double saldoAtual = saldo - debito + credito;
		
		if(saldoAtual>=0){
			System.out.println("Saldo Positivo");
		}
			
		else{
			System.out.println("Saldo Negativo");
		}
		
		
	}
	
}
