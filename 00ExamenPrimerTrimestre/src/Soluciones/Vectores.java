package Soluciones;

/* Leer un número entero num mayor de 5 y crear un vector V de num números enteros, 
 * a continuación se leerán desde teclados todos los elementos del vector V, 
 * se pide obtener los vectores impar y par a partir del vector V 
 * En el vector impar se deben poner los números impares 
 * y en el vector par se deben poner los números pares.
 * Mostrar por pantalla todos los vectores creados V, par e impar.
   Ejemplo:
		num = 9
		V = [2, 8, 15, 3, 22, 14, 5, 6, 7]
		impar = [15, 3, 5, 7]
		par= [2, 8, 22, 14, 6]*/
		
public class Vectores {
	
	public static void mostrar (int v[]) {
		System.out.print("\n El contenido del vector es: ");
		for (int i=0; i <v.length; i++) 
			System.out.print(v[i]+ " ");		
	}
	
	public static void main (String args[]) {
		int num;
		
		// leer num  => 0,15 ptos
		do {
			num = teclado.leer_entero("Introduce un número entero mayor que 5: ");			
		} while (num <= 5);
		
		// crear el vector v de num enteros => 0,1 ptos
		int v [] = new int [num];
		
		// leer desde teclado los elementos del vector V => 0,25 ptos
		for (int i=0; i <v.length; i++) 
			v[i] = teclado.leer_entero("Introduce un número entero: ");		
		
		// calcular cuantos números pares e impares hay en el vector => 0,5 ptos
		int impares = 0, pares = 0;
		
		for (int i=0; i <v.length; i++) 						
			if (v[i] % 2 == 0)
				pares++;
			else
				impares++;		
		
		// Crear el vector de par e impar => 0,25 ptos	
		int par[] = new int [pares];	
		int impar[] = new int [impares];
		
		// pasar los pares e impares a sus respectivos vectores => 2 ptos
		impares = pares = 0;
		for (int i=0; i <v.length; i++) {
			if (v[i] % 2 == 0) {
				par [pares] = v[i];
				pares++;
			}
			else {
				impar [impares] = v[i];				
				impares++;					
			}
		}
		
		// mostrar por pantalla los vectores => 0,25 ptos
		mostrar (v);			
		mostrar (par);
		mostrar (impar);		
		
		System.out.println ("\nEl tamaño del vector de pares es: " + par.length);
		System.out.println ("El tamaño del vector de impares es: " + impar.length);		

	} // fin main

		

} // fin clase Socio
