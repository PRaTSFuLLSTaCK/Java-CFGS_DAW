package Ejercicio14;

import utilidades.teclado;

/*14.)Leer 2 números enteros y positivos: Base y Exponente, y calcular la Base elevado al exponente. Nota: no se puede usar el operador ^
Ejemplo: 
si base = 7 y exponente es 3 => resultado = 7 * 7 * 7
si base = 8 y exponente es 5 => resultado = 8 * 8 * 8 * 8 * 8*/

public class bucle14 {
	public static void main (String args[]) {
		int base = teclado.leer_entero ("Introduce la base: ");
		int expo = teclado.leer_entero ("Introduce el exponente: ");
		int potencia;

		// valor inicial acumulador de productos
		potencia = 1;
	
		// el bucle for calcula cuanto veces se multiplica
		for (int i=1; i<=expo; i++)
			potencia = potencia * base;
			
		System.out.println (base +" elevado a " +expo + " = " + potencia);
		

	} // fin main

} // fin clase bucle10