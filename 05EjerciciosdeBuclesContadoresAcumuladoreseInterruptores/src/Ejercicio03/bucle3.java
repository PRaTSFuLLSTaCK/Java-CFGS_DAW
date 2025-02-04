package Ejercicio03;

import utilidades.teclado;

/*3.) Realiza una lectura de números reales hasta que el número introducido sea 7.75. ¿Cuál es el
tipo de bucle más adecuado para realizar este ejercicio y por qué?*/

public class bucle3 {
	public static void main (String args[]) {
		double real;
		
		// leer hasta que sea 7.75, es el bucle más apropiado para lectura, 
		// ya que al menos se ejecuta una vez el cuerpo del bucle do while
		do {
			real = teclado.leer_double("Introduce un real: ");
		} while (real!= 7.75);


	}// fin main
	
} // fin clase bucle1