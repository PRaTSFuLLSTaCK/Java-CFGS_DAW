package Ejercicio18;

import utilidades.teclado;

/* 18.) Algoritmo que obtenga la lista de los que no son divisores de un número N entero positivo leído desde teclado.*/

public class bucle18 {
	
	public static void main (String args[]) {
		int N;
	
		do {
				N = teclado.leer_entero ("Introduce un numero entero positivo o nulo: ");			
		} while (N < 0);

		System.out.println ("Los números no divisores de " + N + " entre 1 y " + N + " son: ");		

		// mostrar los no divisores de N entre 1 y N
		for (int i=1; i<=N; i ++)		
			// comprobar que i es no divisor de N
			if (N % i != 0)
				System.out.print (i + ", ");		

	} // fin main

} // fin clase bucle18