package Ejercicio10;

import utilidades.teclado;

/* Programa que lea números reales hasta que se introduzca un número negativo y muestre la media 
 * aritmética de los números reales introducidos (solo valdrán para la media aquellos números que no sean negativos). 
 * En caso de no introducir ningún número real positivo o cero, no se podrá calcular la media y se avisará con un mensaje 
 * de error. */

public class bucle10 {
	public static void main (String args[]) {
		double real, media;
		// valor inicial de los acumuladores
		double suma = 0;
		// valor inicial del contador
		double validos = 0;

		do {
			real = teclado.leer_double("Introduce un real: ");
			// comprobar si el número es correcto >=0
			if (real >= 0) {
				suma += real;
				validos ++;			
			}			
		} while (real >= 0);

		// comprobar si he leído algún número real correcto
		if	(validos == 0) 
			System.out.println ("Error no se puede calcular la media");
		else {
			media = suma / validos;
			System.out.println ("La media es " + media);
		}

	} // fin main

} // fin clase bucle10