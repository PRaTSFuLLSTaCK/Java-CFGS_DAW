package buclesSencillos;

import java.util.Scanner;

public class StartEjercicio11 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Filas?");
		int filas = teclado.nextInt();
			
		
		for(int i=1,filasNumeros=1;i<=filas;i++,filasNumeros+=2) {

			// imprimir X
			for(int j=1;j<=filas-i;j++) {
				
				System.out.print("x");
			}
			
			// imprimir numeros
			for(int j=1;j<=filasNumeros;j++) {
				
				System.out.print(i);
			}
			
			
			
			// imprimir X
			for(int j=1;j<=filas-i;j++) {
				
				System.out.print("x");
			}
			
			System.out.println();
		}
	}
}
