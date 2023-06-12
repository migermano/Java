package faccat;
import java.util.Scanner;

public class Exercicio19 {
	 public static void main(String[]args) {
		 Scanner sc=new Scanner (System.in);
		 System.out.println("Digite o primeiro valor: ");
		 int numero1 = sc.nextInt();
		 System.out.println("Digite o segundo valor: ");
		 int numero2 = sc.nextInt();
		 int maior = 0;
		 if (numero1 == numero2) {
			System.out.println("Insira outros valores");
		} else if (numero1 < numero2) {
			maior = numero2;
			System.out.println(maior + " é maior que " + numero1);
		}
		 else {
			 maior = numero1;
			 System.out.println(maior + " é maior que " + numero2);
		}
		 
		 sc.close();
	 }
}
