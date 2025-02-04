package buclesAvanzados;

import java.util.Scanner;

public class StartEjercicio2 {

	
	public static void main(String[] args) {

		int total = 0;
		
		// leer tramo
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe minutos para el tramo");
		int tramo = teclado.nextInt();
		
		// bucle
		while(tramo>0) {
			
			// sumar tramo al total
			total += tramo;
			
			// leer tramo
			System.out.println("Escribe minutos para el tramo");
			tramo = teclado.nextInt();
		}
		
		// imprimo resultado
		System.out.print("Has usado "+total+"' => ");
		System.out.println(total/60+"h "+total%60+"'");
	}
}
