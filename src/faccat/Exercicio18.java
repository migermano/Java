package faccat;
import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Digite o ano que você nasceu: ");
		 int anonascimento = sc.nextInt();
		 System.out.println("Digite o ano atual: ");
		 int anoatual = sc.nextInt();
		 int idade = anoatual - anonascimento;
		 if (idade < 16) {
			 System.out.println("Você não pode votar");
		} else {
			System.out.println("Você pode votar");
		}
		 sc.close();
	 }
}
