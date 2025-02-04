package Ejercicio04;

import utilidades.teclado;

/*4.)Algoritmo que lea 100 caracteres y nos muestre el número de caracteres leídos que son vocales.*/
public class bucle4 {
	public static void main (String args[]) {
		char c;
		// valor inicial del contador (antes del bucle)
		int vocales = 0;
	
	
		for (int i=1; i<=10; i++) {
			// leer caracter
			c = teclado.leer_caracter("Introduce un caracter: ");
			// comprobar si es una vocal
			switch (c) {
				case 'a': case 'e':case 'i':case 'o':case 'u': vocales ++; break;
				case 'A':case 'E':case 'I':case 'O':case 'U': vocales ++; break;
			}	
		} // fin for 

		System.out.println ("El nº de vocales es " + vocales);

	} // fin main

} // fin clase bucle4