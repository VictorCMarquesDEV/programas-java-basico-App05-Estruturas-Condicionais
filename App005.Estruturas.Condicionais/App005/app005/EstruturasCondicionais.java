package app005;
import java.util.Scanner;

public class EstruturasCondicionais {
	public static void main(String[] args) {
		float n1, n2, res;
		int pernas;
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.print("Nota 1: ");
			n1 = (float) teclado.nextFloat();
			System.out.print("Nota 2: ");
			n2 = (float) teclado.nextFloat();
			System.out.print("Pernas: ");
			pernas = (int) teclado.nextInt();
		}
		res = (n1 + n2) / 2;
		System.out.println("Sua média foi: " + res);
		if (res >= 7) {
			System.out.println("Parabéns");
		} else {
			System.out.println("Estude mais!");
		}
		switch(pernas) {
		case 1: System.out.println("Saci");
				break;
		case 2: System.out.println("Bípede");
				break;
		case 4: System.out.println("Quadrúpede");
				break;
		case 6, 8: System.out.println("Aranha");
				break;
		default: System.out.println("ET");
		}
	}
}
