package faccat;
import java.util.Scanner;

public class Exercicio31 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o c�digo de usu�rio: ");
        int codigoUsuario = scanner.nextInt();

        if (codigoUsuario != 1234) {
            System.out.println("Usu�rio inv�lido!");
        } else {
            System.out.print("Digite a senha: ");
            int senha = scanner.nextInt();

            if (senha != 9999) {
                System.out.println("Senha incorreta!");
            } else {
                System.out.println("Acesso permitido!");
            }
        }

        scanner.close();
    }
}
