package Ejercicio01c;

/*Programa que muestre por pantalla los números enteros comprendidos entre 5 y 1000,
ambos inclusive. Empezamos por el 5 y terminamos por el 1000.
Realiza 3 versiones del programa usando el bucle while, do while y for
¿Cuál es el tipo de bucle más adecuado para realizar este ejercicio y por qué?*/

public class bucle2 {
	public static void main (String args[]) {
		int fin = 1000;
		
		int i=fin;		
		
		while (i >= 5) {
			System.out.println (i);
			i--;
		}

	}// fin main
	
} // fin clase bucle1


