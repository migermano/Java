package faccat;
import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Digite o ano que voc� nasceu: ");
		 int anonascimento = sc.nextInt();
		 System.out.println("Digite o ano atual: ");
		 int anoatual = sc.nextInt();
		 int idade = anoatual - anonascimento;
		 if (idade < 16) {
			 System.out.println("Voc� n�o pode votar");
		} else {
			System.out.println("Voc� pode votar");
		}
		 sc.close();
	 }
}
