package exemplos;
import java.util.Scanner;

public class Exercico07Manzanopt2 {
	public static void main(String[]args) {
	    Scanner sc=new Scanner (System.in);
	    System.out.println("Informe os graus em fahrenheit: ");
	    float fahrenheit = sc.nextFloat();
	    float celsius = ((fahrenheit - 32)*5)/9;
	    System.out.println("O valor de Celsius: " + celsius);
	    sc.close();
	 }
}
