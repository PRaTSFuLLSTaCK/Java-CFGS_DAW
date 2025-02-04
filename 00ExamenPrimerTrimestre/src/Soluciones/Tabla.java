package Soluciones;

public class Tabla {

	
	public static void main (String args[]) {
		

		// crear matriz => 0,25 ptos
		double matriz [][] = { {1.4, 23, 44.7, 22}, {1.4, 28, 14.7, 22}, {14, 333, 14.7, 22}, {1.4, 23, 64.7, 22}, {1.4, 2.3, 4.47, 22} };
		
		
		// calcular media y máximo de fila => 2,75 ptos
		double media, suma = 0, maximo_fila, total_elementos=0;
		
		for (int f=0; f<matriz.length; f++) {
			maximo_fila = matriz[f][0];
			for (int c=0; c<matriz[f].length; c++) {
				if (matriz[f][c] > maximo_fila)
					maximo_fila = matriz[f][c];
				suma += matriz[f][c];
				total_elementos++;
			} 
			System.out.println ("El máximo de la fila "+ f + " es: " + maximo_fila);
		}
		
		media = suma/total_elementos;
		System.out.println ("La media aritmética es: " + media);		
		

	} // fin main

		

} // fin clase Socio
