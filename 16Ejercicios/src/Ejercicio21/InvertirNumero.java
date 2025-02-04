package Ejercicio21;

import java.util.Scanner;

/*La inversión de un número es obtener el número resultante de trasladar todos sus dígitos en el orden 
 * inverso en el que actualmente están, es decir, recorriendo sus dígitos de derecha a izquierda. Así, 
 * si tenemos por ejemplo el número 1024, la inversión del mismo daría el número 4201.
 *  Vamos a ver como lograr esto con Java:*/

class InvertirNumero {
	public static void main (String args[]) {
		int numero, invertido = 0, resto;
		
		Scanner s = new Scanner ( System.in);
		System.out.println("Ejemplo para la inversión de un número" );
		System.out.println("Introduzca el numero que desea invertir" );
		
		numero = s.nextInt();
		
		/*Como puedes ver, con la operación de módulo y posterior división, 
		 * lo que se hace es ir desplazándonos por los distintos dígitos del número en cuestión, 
		 * de derecha a izquierda, e irlos añadiendo en orden inverso en la nueva variable.*/
		
		while ( numero > 0 ) {
			resto = numero % 10;
			invertido = invertido * 10 + resto;
			numero /= 10;
		}
		
		System.out.println("Número invertido: " + invertido );
		
	}
	
	
}