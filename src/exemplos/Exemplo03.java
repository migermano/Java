package exemplos;
import java.util.Scanner;

public class Exemplo03 {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Digite um n�mero: ");
int numero1=sc.nextInt();
System.out.println("Digite um n�mero: ");
int numero2=sc.nextInt();
int subtracao=numero1-numero2;
System.out.println("O resultado �: "+subtracao);
sc.close();
}
}
