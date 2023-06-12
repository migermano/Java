package faccat;
import java.util.Scanner;

public class Exercicio29 {
	public static void main(String[]args) {
	   Scanner scanner = new Scanner(System.in);

       System.out.println("Digite o número de litros vendidos: ");
       double litrosVendidos = scanner.nextDouble();

       System.out.println("Digite o tipo de combustível (A-álcool, G-gasolina): ");
       String tipoCombustivel = scanner.next();

       scanner.close();

       double precoGasolina = 3.30;
       double precoAlcool = 2.90;
       double valorAPagar = 0.0;

       if (tipoCombustivel.equalsIgnoreCase("A")) {
           if (litrosVendidos <= 20) {
               valorAPagar = litrosVendidos * precoAlcool * 0.97; // Desconto de 3%
           } else {
               valorAPagar = litrosVendidos * precoAlcool * 0.96; // Desconto de 4%
           }
       } else if (tipoCombustivel.equalsIgnoreCase("G")) {
           if (litrosVendidos <= 20) {
               valorAPagar = litrosVendidos * precoGasolina * 0.97; // Desconto de 3%
           } else {
               valorAPagar = litrosVendidos * precoGasolina * 0.94; // Desconto de 6%
           }
       }

       System.out.printf("Valor a ser pago: R$ %.2f%n", valorAPagar);
   }
}
