package practica1Tema6a;

import utilidades.teclado;

public class PruebaPuntuaciones {
	
	//crear array de nombres y matriz de puntuaciones

	public static void main(String[] args) {
		String [] nombres = {"Pepe", "Luis", "Antonio", "Marisa", "Esteban", "Carla", "Joaqu�n"};
		int [][] puntuaciones = {
				{5,9,0,4,7},
				{6,10,5,5,6},
				{4,4,8,9,4},
				{4,3,8,8,9},
				{5,4,1,2,4},
				{7,5,6,6,8},
				{9,10,8,7,6}
		};
		
		mostrarMatriz(nombres, puntuaciones);
		
		int columna = teclado.leer_entero("Elija columna a ordenar: ", 1, puntuaciones.length) - 1;
		
		int asc = teclado.leer_entero("1. Ascendente, 2. Descendente: ", 1, 2);
		
		quicksort(nombres, puntuaciones, asc, columna); //1 ASCENDENTE, 2 DESCENDENTE
		
		mostrarMatriz(nombres, puntuaciones);
	}

	private static void mostrarMatriz(String[] nombres, int[][] puntuaciones) {
		int ancho = 10;
		//CABECERA
		System.out.printf("%-"+ancho+"s", "---");
		for (int i = 0; i < puntuaciones[0].length; i++) {
			System.out.printf("%"+ancho+"s", "Prueba "+(i+1));
		}
		System.out.println();
		//L�NEA
		for (int i = 0; i < puntuaciones[0].length+1; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print("-");
			}
		}
		System.out.println();
		//DATOS
		for (int i = 0; i < puntuaciones.length; i++) {
			System.out.printf("%-"+ancho+"s", nombres[i]);
			for (int j = 0; j < puntuaciones[0].length; j++) {
				System.out.printf("%"+ancho+"d", puntuaciones[i][j]);
			}
			System.out.println();
		}
	}

	private static void quicksort(String[] nombres, int[][] puntuaciones, int asc, int columna) {
		quickSort(nombres, puntuaciones, asc, columna, 0, puntuaciones.length-1);
	}
	
	private static void quickSort(String[] nombres, int[][] puntuaciones, int asc, int columna, int inicio, int fin) {
		if (inicio < fin) {
			int i = inicio, j = fin;
			int pivot = puntuaciones[(i + j) / 2][columna];

			do {
				while (asc == 1 ? puntuaciones[i][columna] < (pivot) : puntuaciones[i][columna] > pivot)
					i++;
				while (asc == 1 ? pivot < puntuaciones[j][columna] : pivot > puntuaciones [j][columna])
					j--;

				if (i <= j) {
					intercambiar(puntuaciones, i, j);
					intercambiar(nombres, i, j);
					i++;
					j--;
				}

			} while (i <= j);

			quickSort(nombres, puntuaciones, asc, columna, inicio, j);
			quickSort(nombres, puntuaciones, asc, columna, i, fin);
		}
	}
	//M�todo para extraer columa de enteros (no lo necesitamos)
//	private static int[] extraerColumna(int[][] puntuaciones, int columna) {
//		int[] aux = new int[puntuaciones.length];
//		for (int i = 0; i < puntuaciones.length; i++) {
//			aux[i] = puntuaciones[i][columna];
//		}
//		return aux;
//	}

	//M�todo para intercambiar filas
	private static void intercambiar(int[][] puntuaciones, int fila1, int fila2) {
		int[] aux = puntuaciones[fila1];
		puntuaciones[fila1] = puntuaciones[fila2];
		puntuaciones[fila2] = aux;
	}
	//Intercambio de posiciones de array de nombres
	private static void intercambiar(String [] nombres, int pos1, int pos2) {
		String aux = nombres[pos1];
		nombres[pos1] = nombres[pos2];
		nombres[pos2] = aux;
	}
}
