package faccat;
import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite a base:");
		int numero01=sc.nextInt();
		System.out.println("Digite a altura:");
		int numero02=sc.nextInt();
		int resultado=numero01*numero02;
		System.out.println("A �rea do ret�ngulo �: "+resultado);
		sc.close();
	}
}
