package Ejercicio22;

/* 22.) Muestra los factoriales de los números comprendidos entre 5 y 25.*/

public class bucle22 {
	
	public static void main (String args[]) {
		double factorial;		
		
		for (int i=5; i < 26; i ++) {
			// calcular el factorial de i (varía de 5 a 25)
			factorial = 1;
			for (int j=1; j<=i; j++)
				factorial = factorial * j;
				
			System.out.println ("Factorial de " + i + " = " + factorial);	
		}		
	} // fin main

} // fin clase bucle22