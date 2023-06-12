package faccat;
import java.util.Scanner;
public class Exercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2;

        do {
            System.out.println("Digite a nota da primeira avaliação (0 a 10): ");
            nota1 = scanner.nextDouble();
        } while (nota1 < 0 || nota1 > 10);

        do {
            System.out.println("Digite a nota da segunda avaliação (0 a 10): ");
            nota2 = scanner.nextDouble();
        } while (nota2 < 0 || nota2 > 10);

        scanner.close();

        double media = (nota1 + nota2) / 2;
        System.out.println("A média do aluno é: " + media);
    }
}
