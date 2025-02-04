package buclesSencillos;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class StartEjercicio5a {
	
	/**
	 * Ejercicio 5 con bucles for
	 */
	public static void main(String[] args) {
		
		int mayor = -1000;
		int menor = 1000;
		
		
		// aleatorio entre 1 y 20
		int veces =  (int)(Math.random()*20+1);
		System.out.println("Se va a hacer "+veces+" veces");
		
		// configuro para hacer "veces" veces
		for(int i=1;i<=veces;i++) {
			
			// creo un numero aleatorio
			int numero = (int)(Math.random()*100+1);
			System.out.println("numero "+numero);
			
			// pregunto si mi numero es 
			// menor que el que tengo como "menor"
			if(numero<menor) {
				
				// si es asi, actualizo
				menor = numero;
			}
			
			// pregunto si mi numero es 
			// mayor que el que tengo como "mayor"
			if(numero>mayor) {
				
				// si es asi, actualizo
				mayor = numero;
			}
		}
		System.out.println("\n************************ ");
		System.out.println("La numero mayor fue "+mayor);
		System.out.println("La numero menor fue "+menor);
	}
}
