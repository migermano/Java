package faccat;
import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite um numero: ");
	    int numero1 = sc.nextInt();	
		System.out.println("Digite outro numero numero: ");
		int numero2 = sc.nextInt();	
		int crescente = 0;
		
		if (numero1 < numero2) {
			crescente = numero2;
			System.out.println(numero1 + " vêm antes de " + crescente);
		} else if (numero2 < numero1) {
			crescente = numero1;
			System.out.println(numero2 + " vêm antes de " + crescente);
			
		} {

		}
		sc.close();
	}
}
