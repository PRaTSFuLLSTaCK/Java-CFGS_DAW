package Ejercicio13;

import utilidades.teclado;

/* 13.) Calcula el factorial de un número entero positivo N leído desde teclado. 
Ejemplos: 
el factorial de 5 es igual a 1*2*3*4*5
el factorial de 0 es igual a 1
el factorial de 8 es igual a 1*2*3*4*5*6*7*8
el factorial de 1 es igual a 1 
*/

public class bucle13 {
	
	public static void main (String args[]) {
		// acumulador de productos
		double factorial = 1;
		int N;
	
		do {
			N = teclado.leer_entero("Introduce un numero entero positivo o nulo: ");			
		} while (N < 0);

		// calcular el factorial
		for (int i=1; i<=N; i ++)		
			factorial = factorial * i;
			
		System.out.println ("El factorial de " + N + " es : " + factorial);
		

	} // fin main

} // fin clase bucle13
