package Ejercicio17;

import utilidades.teclado;

/* 17.) Realizar un algoritmo que lea un número entero positivo N y calcule y muestre la suma de los N primeros números múltiplos de 3. 
Ejemplo:  si N = 4. Entonces suma de los 4 primeros múltiplos de 3 = 3 + 6 + 9 + 12 */

public class bucle17 {
	
	public static void main (String args[]) {
		// acumulador
		long suma = 0;
		int N;
	
		do {
				N = teclado.leer_entero ("Introduce un numero entero positivo o nulo: ");			
		} while (N < 0);

		// calcular la suma de los múltiplos de 3 hay entre 1 y N
		for (int i=1; i<=N; i ++)		
			// comprobar que i es múltiplo de 3
			if (i % 3 == 0)
				suma += i; // equivalente a suma = suma + i
			
		System.out.println ("La suma de los múltiplos de 3 entre 1 y " + N + " es : " + suma);		

	} // fin main

} // fin clase bucle17