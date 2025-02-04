package ejerciciosAvanzados;

import java.util.Scanner;

public class StartEjercicio22b {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una temperatura");
		int temperatura = teclado.nextInt();

		if (temperatura > 30) {

			System.out.println("natación");

		} else if (temperatura > 20) {

			System.out.println("tenis");

		} else if (temperatura > 10) {

			System.out.println("golf");

		} else if (temperatura > 5) {

			System.out.println("esqui");

		} else
			System.out.println("parchís");

	}

}
