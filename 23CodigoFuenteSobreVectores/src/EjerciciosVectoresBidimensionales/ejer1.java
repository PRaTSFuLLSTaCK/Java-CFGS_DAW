package EjerciciosVectoresBidimensionales;

/* 1.) Realiza un programa que defina una matriz de 5 filas y 3 columnas de enteros, 
 * darle un valor inicial, muestra el contenido de esa matriz en forma de tabla: 
 * fila a fila.*/

public class ejer1 {
	
	// visualizar matrices de enteros
	// permite ver matrices con filas de longitud variable
	public static void ver_matriz (int [][] matriz) {
		
		System.out.println ("");
		// recorrer filas
		for (int f=0; f<matriz.length; f++) {
			// recorrer columnas
			for (int c=0; c<matriz[f].length; c++)
				System.out.print (matriz[f][c] + "\t"); // \t => para tabular
			
			System.out.println(""); // salto de línea para ir a la siguiente fila
			
		}
	}	
	
	public static void main (String args[]) {	
		
		
		// Definir matriz de números enteros de 5 filas y 3 columnas
		int [][] enteros = { {1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}, {13,14,15} };
		
		
		ver_matriz (enteros);
		
	}
}

