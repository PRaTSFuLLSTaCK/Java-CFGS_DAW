package Ejercicio16;

import utilidades.teclado;

/* 16.) Algoritmo que lee un número entero N y calcule cuantos números múltiplos de 7 hay entre 1 y N. */

public class bucle16 {
	
	public static void main (String args[]) {
		// contador
		int contador = 0;
		int N;
	
		do {
				N = teclado.leer_entero ("Introduce un numero entero positivo o nulo: ");			
		} while (N < 0);

		// calcular cuantos múltiplos de 7 hay entre 1 y N
		for (int i=1; i<=N; i ++)		
			// comprobar que i es múltiplo de 7
			if (i % 7 == 0)
				contador ++; 
			
		System.out.println ("El nº de múltiplos de 7 entre 1 y " + N + " es : " + contador);		

	} // fin main

} // fin clase bucle16