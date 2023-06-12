package faccat;
import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite a hora de ínicio do jogo de xadrez: ");
		int horaInicio=sc.nextInt();
		System.out.println("Digite a hora que acaba o jogo de xadrez: ");
		int horaFim=sc.nextInt();
		int duracao01=(24-horaFim)+horaFim;
		int duracao02=horaFim-horaInicio;
		
			if(horaFim<=horaInicio) {
				System.out.println("A partida de xadrez durou: "  + duracao01 + "h");
			}
			
			else{
				System.out.println("A partida de xadrez durou: "  + duracao02 + "h");
			}
			
			sc.close();
	}
}
