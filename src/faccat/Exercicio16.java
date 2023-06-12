package faccat;
import java.util.Scanner;

public class Exercicio16 {
	 public static void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Quantas maçãs você comprou? ");
		 
		 int macas = sc.nextInt();
		 if (macas < 12 ){
		 float valor = 1.30f * macas;
		 System.out.printf("O valor a pagar é:%.2f %n " , (valor));
		   }
		 else {
	     float  promocao = 1 * macas;
	     System.out.printf("O valor a pagar é:%.2f %n " , (promocao));
		 }
		 sc.close();
		 }
}
