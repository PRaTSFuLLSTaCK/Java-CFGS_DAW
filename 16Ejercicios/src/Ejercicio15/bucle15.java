package Ejercicio15;

import utilidades.teclado;

/* 15.) ¿Qué modificación tendrías que realizar en cada uno de los ejercicios anteriores, para que el usuario pudiera ejecutar el programa correspondiente tantas veces como quisiera? Por ejemplo se puede realizar la pregunta: ¿Deseas seguir ejecutando el programa S/N? y dependiendo de la respuesta se siga ejecutando o no? 
*/

// Respuesta: Se debería introducir el bucle do ... while de la siguiente manera:

// se modifica el ejercicio13

public class bucle15 {
	
	public static void main (String args[]) {
		char car;
		
		do {
		
			// acumulador de productos
			double factorial = 1;
			int N;
	
			do {
				N = teclado.leer_entero ("Introduce un numero entero positivo o nulo: ");			
			} while (N < 0);

			// calcular el factorial
			for (int i=1; i<=N; i ++)		
				factorial = factorial * i;
			
			System.out.println ("El factorial de " + N + " es : " + factorial);
			
			car = teclado.leer_caracter ("¿Deseas seguir ejecutando el programa S/N? ");
	
		} while (car == 'S' || car == 's');	

	} // fin main

} // fin clase bucle15