package buclesSencillos;

import java.util.Scanner;

public class StartEjercicio4a {
	
	/**
	 * Ejercicio 4 con bucles for
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int notaMejor = -1000;
		int notaPeor = 1000;
		
		int nota;
		
		System.out.println("Introduce 6 notas");
		
		// configuro para hacer 6 veces
		for(int i=1;i<=6;i++) {
			
			// le pido al teclado una nota
			nota = teclado.nextInt();
			
			// pregunto si mi nota es 
			// menor que la que tengo como "peor"
			if(nota<notaPeor) {
				
				// si es asi, actualizo
				notaPeor = nota;
			}
			
			// pregunto si mi nota es 
			// mayor que la que tengo como "mejor"
			if(nota>notaMejor) {
				
				// si es asi, actualizo
				notaMejor = nota;
			}
		}
		System.out.println("La nota mejor fue "+notaMejor);
		System.out.println("La nota peor fue "+notaPeor);
		
		
		// cuando acabo
		teclado.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
