package faccat;
import java.util.Scanner;

public class Exercicio34 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o número do empregado (código): ");
	        int codigoEmpregado = scanner.nextInt();

	        System.out.print("Digite o ano de nascimento do empregado: ");
	        int anoNascimento = scanner.nextInt();

	        System.out.print("Digite o ano de ingresso na empresa: ");
	        int anoIngresso = scanner.nextInt();

	        scanner.close();

	        int idade = calcularIdade(anoNascimento);
	        int tempoTrabalho = calcularTempoTrabalho(anoIngresso);

	        System.out.println("Idade do empregado: " + idade + " anos");
	        System.out.println("Tempo de trabalho do empregado: " + tempoTrabalho + " anos");

	        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
	            System.out.println("Requerer aposentadoria");
	        } else {
	            System.out.println("Não requerer aposentadoria");
	        }
	    }

	    public static int calcularIdade(int anoNascimento) {
	        int anoAtual = java.time.Year.now().getValue();
	        return anoAtual - anoNascimento;
	    }

	    public static int calcularTempoTrabalho(int anoIngresso) {
	        int anoAtual = java.time.Year.now().getValue();
	        return anoAtual - anoIngresso;
	    }
	}
	





}
