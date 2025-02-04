package Vectores;

public class matrices {
	
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
	
	
	// SE PUEDE USAR EL MISMO NOMBRE PARA ESTE MÉTODO => POLIMORFISMO	
	// visualizar matrices de reales de doble precisión
	// permite ver matrices con filas de longitud variable
	public static void ver_matriz (double [][] matriz) {
		
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
		
		// Matriz definida con un valor inicial
		// matriz de 4 filas y 3 columnas de números enteros
		int [][] enteros = { {4,5,6}, {8,9,10}, {12,13,14}, {-16,-17,-18} };
		
		// Para mostrar el contenido de una matriz he de saber el nº de filas que tiene
		int num_filas = enteros.length;
		
		// Y también el nº de columnas, 
		// si la matriz tiene el mismo nº de columnas en cada fila
		// se puede calcular, de esta forma:
		int num_columnas = enteros[0].length; // nº columnas de la 1ª fila
		
		// mostrar la matriz por pantalla
		// f => fila, c => columna
		
		// recorrer filas
		for (int f=0; f<num_filas; f++) {
			// recorrer columnas
			for (int c=0; c<num_columnas; c++)
				System.out.print (enteros[f][c] + "\t"); // \t => para tabular
			
			System.out.println(""); // salto de línea para ir a la siguiente fila
			
		}
		
		// se podía haber usado el método ver_matriz
		ver_matriz (enteros);		
		
		
		// matriz de columnas de diferente tamaño		
		int [][] enteros2 = {{1,2,3,4},{5,6},{7,8,9,10,11,12},{13}};
		
		ver_matriz (enteros2);
		
		
		// Definir matriz de números reales de 5 filas y 3 columnas
		double [][] reales = new double [5][3];
		
		// rellenar la matriz de valores
		double num = 1.25;
		// recorrer filas
		for (int f=0; f<reales.length; f++) {
			// recorrer columnas
			for (int c=0; c<reales[f].length; c++) {
				reales[f][c] = num;
				num = num + 2; // para que todos los valores sean distintos
			}			
		}
		
		ver_matriz (reales);
		
	}
}

