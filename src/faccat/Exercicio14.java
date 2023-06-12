package faccat;
import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Insira um valor: ");
		 int numero = sc.nextInt();
		 if (numero < 10 ) {
		 System.out.println("O valor inserido é menor que 10");
		 }
		 else if (numero == 10 ) {
			 System.out.println("O valor digitado é 10! ");
		 }
		 else {
			 System.out.println("O número é maior que 10");
		 }
		 sc.close();
		 			 	
}
}
