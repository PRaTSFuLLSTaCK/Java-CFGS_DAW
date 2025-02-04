package Ejercicio06;

import utilidades.teclado;

/*4.) Algoritmo que lea caracteres hasta que el carácter leído sea una Z y nos muestre el número de caracteres leídos que son vocales. */

public class bucle5 {
	public static void main (String args[]) {
		char car;
		int vocales = 0;
		
		do {
			car = teclado.leer_caracter("Introduce un caracter: ");
			switch (car) {
				case 'a': case 'e':case 'i':case 'o':case 'u': vocales ++; break;
				case 'A':case 'E':case 'I':case 'O':case 'U': vocales ++; break;
			}	
		} while (car !=	'Z');
		
		System.out.println ("El nº de vocales leídas es: " + vocales);
		
		
	}// fin main
	
} // fin clase bucle5