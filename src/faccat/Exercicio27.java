package faccat;
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado A: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Digite o valor do lado C: ");
        double ladoC = scanner.nextDouble();

        scanner.close();

        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
            System.out.println("Os valores informados formam um triângulo.");
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }
    }
}
