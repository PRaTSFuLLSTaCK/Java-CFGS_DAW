package Ejercicio19;

import utilidades.teclado;

/* 19.) Leer números reales  hasta que se introduzca el cero y calcular y mostrar la media aritmética de esos números. Nota: para la media no se tendrá en cuenta el número cero.*/

public class bucle19 {
	
	public static void main (String args[]) {
		double real, media, suma=0, contador=0;		
	
		do {
				real = teclado.leer_double ("Introduce un numero real (0 para terminar): ");
				// comprobar si es distinto de cero el real leído para incluirlo en la media
				if (real != 0) {				
					contador ++;
					suma += real;
				}								
		} while (real != 0);

		// comprobar si se ha leído algún numero distinto de cero, para ver si hay media
		if (contador > 0) {
			media = suma / contador;		
			System.out.println ("La media aritmética es: " + media);
		}
		else
			System.out.println ("No se leyó ningún número distinto de cero, no hay media aritmética posible"); 	
	} // fin main

} // fin clase bucle19