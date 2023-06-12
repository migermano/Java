package faccat;
import java.util.Scanner;

public class Exercicio26 {
public static void main(String[]args){
	Scanner scanner=new Scanner(System.in);

    System.out.print("Digite o primeiro valor: ");
    int valor1 = scanner.nextInt();

    System.out.print("Digite o segundo valor: ");
    int valor2 = scanner.nextInt();

    System.out.print("Digite o terceiro valor: ");
    int valor3 = scanner.nextInt();

    scanner.close();

  
    if (valor1 > valor2) {
        int temp = valor1;
        valor1 = valor2;
        valor2 = temp;
    }

    if (valor2 > valor3) {
        int temp = valor2;
        valor2 = valor3;
        valor3 = temp;
    }

    if (valor1 > valor2) {
        int temp = valor1;
        valor1 = valor2;
        valor2 = temp;
    }

    System.out.println("Valores em ordem crescente: " + valor1 + ", " + valor2 + ", " + valor3);
}
}

