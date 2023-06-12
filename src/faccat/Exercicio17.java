package faccat;
import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Digite a primeira nota do aluno: ");
		 float nota1 = sc.nextFloat();
		 System.out.println("Digite a segunda nota do aluno: ");
		 float nota2 = sc.nextFloat();
		 float media = (nota1 + nota2)/2;
		 if (media < 6 ) {
			 System.out.println("A média do aluno é: " + media + " por isso ele esta retido! ");
		 }
		 else {
			 System.out.print("A média do aluno é: " + media + " por isso ele esta aprovado! ");
		 }
		 sc.close();
	 }
}
