package faccat;
import java.util.Scanner;

public class Exercicio23 {
public static void main(String[]args) {
	Scanner Scanner = new Scanner(System.in);
	
	System.out.println("Digite seu salário Fixo: R$ ");
	double salarioFixo = Scanner.nextDouble();
	System.out.println("Digite o valor de suas vendas: R$ ");
	double valorVendas = Scanner.nextDouble();

	Scanner.close();
	
	double comissao=0.0;
	
	if(valorVendas >= 1500){
		comissao = valorVendas * 0.03;
	
}
	else {
		  comissao = (1500.00 * 0.03) + ((valorVendas - 1500.00) * 0.05);
}
	
	double salarioTotal = salarioFixo + comissao;

    System.out.printf("O seu salário total é: R$ %.2f%n", salarioTotal); 
}
}

