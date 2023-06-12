package exemplos;
import java.util.Scanner;

public class Multipicaco {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Digite um número:");
	int numero1=sc.nextInt();
	System.out.println("Digite um número: ");
	int numero2=sc.nextInt();
	int multiplicacao = numero1 * numero2;
			System.out.println("O resultado é :" +multiplicacao);
	sc.close();
}
}
