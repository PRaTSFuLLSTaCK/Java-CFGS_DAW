package buclesSencillos;

import java.util.Scanner;

public class StartEjercicio2 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cuanto pares quieres?");
		int cuantoPares = teclado.nextInt();
		
		
		int numero = 2;
		for(int i=1;i<=cuantoPares;i++) {
			
			System.out.println(numero);
			numero = numero + 2;
		}

		
		teclado.close();
	}

}
