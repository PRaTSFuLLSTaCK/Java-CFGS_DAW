package buclesSencillos;

import java.util.Scanner;

public class StartEjercicio6a {

	public static void main(String[] args) {

		
		// creo un teclado
		Scanner teclado = new Scanner(System.in);
		
		
		int positivos = 0, negativos = 0;
		
		
		System.out.println("Cuantos numeros vas a solicitar?");
		int veces = teclado.nextInt();
		
		
		for(int i=1;i<=veces;i++) {

			// leo un numero
			System.out.println("un número, plis?");
			int numero = teclado.nextInt();
			
			
			// pregunto si es positivo
			if(numero>0) {
				
				positivos++; 
				// positivos = positivos + 1;
			}
			// o negativo
			else if(numero<0) {
				
				negativos++; 
				// negativos = negativos + 1;
			}
		}
		System.out.println("Has leido "+veces+" numeros");
		System.out.println("Positivos "+positivos);
		System.out.println("Negativos "+negativos);
	}
}
