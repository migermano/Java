package faccat;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o n�mero de carros vendidos: ");
        int numCarrosVendidos = sc.nextInt();

        System.out.println("Digite o valor total das vendas: ");
        float valorTotalVendas = sc.nextFloat();

        System.out.println("Digite o valor por carro vendido: ");
        float valorPorCarroVendido = sc.nextFloat();

        System.out.println("Digite o sal�rio do funcion�rio: ");
        float salarioFixo = sc.nextFloat();

        float comissaoFixa = numCarrosVendidos * valorPorCarroVendido;
        float comissaoVariavel = valorTotalVendas * 0.05f;
        float salarioFinal = salarioFixo + comissaoFixa + comissaoVariavel;

        System.out.println("O sal�rio final ser�: " + salarioFinal);

        sc.close();
    }
}
