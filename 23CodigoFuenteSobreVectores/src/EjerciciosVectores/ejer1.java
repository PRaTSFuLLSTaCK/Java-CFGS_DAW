package EjerciciosVectores;

/* 1.) Realiza un programa que defina un vector de 10 enteros, 
 * darle un valor inicial, muestra el contenido de ese vector en orden ascendente 
 * (desde el primer a el último elemento => el índice 0 hasta al 9) 
 * y posteriormente muestralo en orden descendente (desde el último a el primer elemento).
 */


public class ejer1 {
	
	public static void main (String args[]) {
		
		int [] enteros = {1, 3, 100, -5, 9, 44, -77, 55, 43, 12};
		
		// mostrar el contenido en orden ascendente del vector
		System.out.println ("Vector en orden ascendente: \n"); 
		for (int i=0; i<enteros.length; i++)
			System.out.println ("Elemento " + (i+1) + "º =" + enteros[i]);
			
		// mostrar el contenido en orden descendente del vector
		System.out.println ("Vector en orden ascendente: \n"); 
		for (int i=enteros.length-1; i>=0; i--)
			System.out.println ("Elemento " + (i+1) + "º =" + enteros[i]);
		
		
	}
}

