package Ejercicio12;

/*12.)Algoritmo que suma independientemente los números pares e impares 
 * comprendidos entre 25 y 50, y muestra por pantalla el resultado de las sumas.*/

public class bucle12 {
	public static void main (String args[]) {
		// el 25 es impar	
		boolean par = false;
		// valor inicial de los acumuladores
		int sumapar = 0, sumaimpar=0;		
		
		// contador 
		int i = 25;

		while (i<=50){			
			// comprobar si es par o impar
			if (par == true) {			
				sumapar += i; // sumapar = sumapar +i;
				par = false;	
			}
			else {
				sumaimpar += i;
				par = true;
			}
			i++;			
		}
			
		System.out.println ("Suma de los pares = " + sumapar);
		System.out.println ("Suma de los impares = " + sumaimpar);

	} // fin main

} // fin clase bucle12