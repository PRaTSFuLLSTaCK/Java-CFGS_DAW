package Ejercicio09;

import utilidades.teclado;

/*9.) Programa que lea números reales, mientras no se introduzca un cero y muestre la suma de los números introducidos. */

public class bucle9 {
	public static void main (String args[]) {
		// acumulador
		double suma =0;
		double real;
	
		do {
			// leer numero real
			real = teclado.leer_double("Introduce un nº real: ");
			
			// acumulamos la suma (es equivalente a suma = suma + real
			suma += real;
		} while (real != 0);

		System.out.println ("La suma de los números reales es: " + suma);
		
	} // fin main

} // fin clase bucle9