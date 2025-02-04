package Ejercicio11;

import utilidades.teclado;

/* 11.) Algoritmo que lea una secuencia de números hasta que se introduzca 
 * el número 27 
 * y posteriormente muestre por pantalla 
 * si leyó o no el número 14, alguna vez. */

public class bucle11 {
	
	public static void main (String args[]) {
		// interruptor
		boolean leyo14 = false;
	
		double real;

		do {
			real = teclado.leer_double("Introduce un real: ");
			// comprobar si el número leído es 14
			if (real == 14) 
				leyo14 = true;
		} while (real != 27);

		// comprobar si he leído algún número real correcto
		if	(leyo14 == true) 
			System.out.println ("Se ha leído alguna vez el número 14");
		else 
			System.out.println ("No se ha leído nunca el número 14");

	} // fin main

} // fin clase bucle11