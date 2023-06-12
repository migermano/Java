package faccat;
import java.util.Scanner;

public class Exercicio22 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite quantas horas trabalhadas: ");
	        int horasTrabalhadas = scanner.nextInt();

	        System.out.print("Digite seu salário por hora: ");
	        double salarioHora = scanner.nextDouble();

	        scanner.close();

	        int horasExtras = 0;

	        if (horasTrabalhadas > 160) {
	            horasExtras = horasTrabalhadas - 160;
	            horasTrabalhadas = 160;
	        }

	        double salarioTotal = (horasTrabalhadas * salarioHora) + (horasExtras * salarioHora * 1.5);

	        System.out.printf("O salário total do funcionário é: R$ %.2f%n", salarioTotal);
	    }
	}


