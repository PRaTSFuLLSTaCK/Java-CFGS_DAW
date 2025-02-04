package Ejercicio01a;

/*Programa que muestre por pantalla los números enteros comprendidos entre 5 y 1000,
ambos inclusive. Empezamos por el 5 y terminamos por el 1000.
Realiza 3 versiones del programa usando el bucle while, do while y for
¿Cuál es el tipo de bucle más adecuado para realizar este ejercicio y por qué?*/

public class bucle1 {
	public static void main (String args[]) {
		// puedes cambiar fin a 1000, para probarlo es mejor un valor menor.
		int fin = 10;
		
		int i=5;		
		do {
			System.out.println (i);
			i++;
		}while (i <=fin);

	}// fin main
	
} // fin clase bucle1
