package faccat;
import java.util.Scanner;

public class Divisao {
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		float numero01=sc.nextInt();
		System.out.println("Digite outro n�mero: ");
		float numero02=sc.nextInt();
		float resultado=numero01/numero02;
		System.out.println("O resultado �: "+resultado);
		sc.close();
	}
}
