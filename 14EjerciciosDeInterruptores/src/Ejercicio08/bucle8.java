package Ejercicio08;

/*Algoritmo que calcula y escribe la suma y el producto de los 7 primeros números naturales */

public class bucle8 {
	public static void main (String args[]) {
		// valor inicial de los acumuladores
		int suma = 0, producto = 1;

		for (int i=1; i<=7; i++) {
			suma = suma + i;
			// suma += i;
			producto = producto * i;
			// producto *= i;
		}				

		System.out.println ("La suma de los 7 " + suma);
		System.out.println ("El producto de los 7 " + producto);

	} // fin main

} // fin clase bucle7