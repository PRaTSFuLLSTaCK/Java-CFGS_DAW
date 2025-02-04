package Ejercicio07;

import utilidades.teclado;

/*Algoritmo que lea números mientras no se introduzca un cero y cuente cuantos de estos números son impares.*/

public class bucle7 {
	public static void main (String args[]) {
		int num, contador = 0;

		do {
			num = teclado.leer_entero ("Introduce un entero: ");
			if (num % 2 == 1)
				contador++;
		} while (num !=0);		

		System.out.println ("El nº de impares es " + contador);

	} // fin main

} // fin clase bucle7