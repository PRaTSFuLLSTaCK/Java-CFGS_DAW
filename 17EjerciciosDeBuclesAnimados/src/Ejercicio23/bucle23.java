package Ejercicio23;

import utilidades.teclado;

/* 23.) Calcula los números primos entre 1 y N. Siendo N un número introducido por el usuario. 
 * Un número primo P es un número natural mayor que 1, que tiene únicamente dos divisores distintos: 
 * él mismo y el 1, es decir, la suma de sus divisores son P+1. */

public class bucle23 {
	
	public static void main (String args[]) {
		// acumulador
		long suma;
		int N;
	
		do {
				N = teclado.leer_entero ("Introduce un numero entero positivo o nulo: ");			
		} while (N < 0);

		System.out.println ("Los primos comprendidos entre 1 y " + N + " son : ");		
		for (int p=1; p<=N; p++)	{
			// calcular la suma de los divisores de p
			suma = 0;
			for (int j=1; j <=p; j++)
				// comprobar que j es divisor de p
				if (p % j == 0)
					suma += j; // equivalente a suma = suma + j
			
			// comprobar que i es primo
			if (suma == p+1)
				System.out.print (p + ", ");			
		} // fin for p		

	} // fin main

} // fin clase bucle23