package faccat;
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a terceira nota (N1): ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota  (N2): ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota (N3): ");
        double n3 = scanner.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = scanner.nextDouble();

        scanner.close();

        double mediaAproveitamento = (n1 + n2 * 2 + n3 * 3 + mediaExercicios) / 7;

        String conceito;

        if (mediaAproveitamento >= 9.0) {
            conceito = "A";
        } else if (mediaAproveitamento >= 7.5) {
            conceito = "B";
        } else if (mediaAproveitamento >= 6.0) {
            conceito = "C";
        } else if (mediaAproveitamento >= 4.0) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        System.out.println("Média de Aproveitamento: " + mediaAproveitamento);
        System.out.println("Conceito do aluno: " + conceito);
    }
}
