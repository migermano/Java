package faccat;
import java.util.Scanner;

public class Exercicio15 {
	public static void main (String[]args) {
		  Scanner sc=new Scanner (System.in);
		  System.out.print("Digite um valor: ");
		  int numero = sc.nextInt();
		  if (numero < 0 ) {
			  System.out.println("N�mero negativo");
		  }
		  else {
			  System.out.println("N�mero positvo ");
		  }
		  sc.close();
	  }
}
