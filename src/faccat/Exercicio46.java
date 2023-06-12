package faccat;
import java.util.Scanner;

public class Exercicio46 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int valor;

	        do {
	            System.out.print("Digite um valor inteiro entre 1 e 10: ");
	            valor = scanner.nextInt();
	        } while (valor < 1 || valor > 10);

	        System.out.println("Tabuada do " + valor + ":");

	        for (int contador = 1; contador <= 10; contador++) {
	            int resultado = valor * contador;
	            System.out.println(valor + " x " + contador + " = " + resultado);
	        }

	        scanner.close();
	    }
}
