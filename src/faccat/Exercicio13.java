package faccat;
import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[]args) {
		 Scanner sc=new Scanner (System.in);
		 System.out.println("Insira seu nome: ");
		 String nome=sc.nextLine();
		 System.out.println("INsira a primeira nota: ");
		 float nota1 = sc.nextFloat();
		 System.out.println("Insira a segunda nota: ");
		 float nota2 = sc.nextFloat();
		 System.out.println("Insira a terceira nota: ");
		 float nota3 = sc.nextFloat();
		 float media = (nota1 + nota2 + nota3)/3;
		 System.out.printf("OL� " + nome + ", sua m�dia � de %.2f " ,media );
		 sc.close();
	 }
}
