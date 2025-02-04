package PracticaTema09;

import java.util.Arrays;

/*
 * Ejercicio 1) Utilizando los métodos de la Clase Arrays y la clase Math, define dos arrays o vectores de 
   50 enteros y realiza un programa con el siguiente menú: 
   
		1. Rellenar aleatorios (genera 50 números aleatorios en el array escogido (1 o 2)) => Clase Math
			(machaca o sobreescribe el contenido anterior del array)
			
		2. Rellenar con un número (todos los elementos del array escogido (1 o 2) se rellenan con un mismo 
			número) => Clase Arrays
			
		3. Ordenar el array escogido (1 o 2) de forma ascendente => Clase Arrays
		
		4. Mostrar el contenido del array escogido (1 o 2). 
		
		5. Copiar el contenido de un array en otro => Clase Arrays
		
		6. Realiza una búsqueda binaria en el array escogido (1 o 2) => Clase Arrays
		
		7. Comparar si los dos vectores son iguales => Clase Arrays

 */

public class MainArrays {
	private static int[] array1;
	private static int[] array2;

	public static void main(String[] args) {
		inicializar();
		do {
			menu();
			int opcion = elegirOpcionMenu();
			ejecutarOpcion(opcion);
		} while (true);
	}

	private static void ejecutarOpcion(int opcion) {
		switch (opcion) {
		case 1:
			rellenarAleatorios();
			break;
		case 2:
			rellenarNumero();
			break;
		case 3:
			ordenarArray();
			break;
		case 4:
			mostrarArray();
			break;
		case 5:
			copiarArray();
			break;
		case 6:
			busquedaBinaria();
			break;
		case 7:
			compararArrays();
			break;
		default:
			System.out.println("Programa finalizado");
			System.exit(0);
		}
	}

	private static void compararArrays() {
		if(Arrays.equals(array1, array2)) {
			System.out.println("Los dos arrays son iguales");
		}else {
			System.out.println("Los dos arrays son distintos");
		}
	}

	private static void busquedaBinaria() {
		int[] aux = null;
		int opcion = teclado.leer_entero("Seleccione array a rellenar aleatoriamente: ", 1, 2);
		if (opcion == 1) {
			aux = array1;
		}else {
			aux = array2;
		}
		int numero = teclado.leer_entero("Indique el n�mero a buscar: ");
		int posicion = Arrays.binarySearch(aux, numero);
		if(posicion == -1) {
			System.out.println("El n�mero " + numero + " no se encuentra en el array");
		}else {
			System.out.println("El n�mero " + numero + " se encuentra en la posici�n " + posicion);
		}
	}

	private static void copiarArray() {
		int opcion = teclado.leer_entero("Seleccione array a copiar: ", 1, 2);
		if (opcion == 1) {
			array2 = Arrays.copyOf(array1, array1.length);
		}else {
			array1 = Arrays.copyOf(array2, array2.length);
		}
	}

	private static void mostrarArray() {
		int[] aux = null;
		int opcion = teclado.leer_entero("Seleccione array a mostrar: ", 1, 2);
		if (opcion == 1) {
			aux = array1;
		}else {
			aux = array2;
		}
		System.out.println(Arrays.toString(aux));
	}

	private static void ordenarArray() {
		int[] aux = null;
		int opcion = teclado.leer_entero("Seleccione array a ordenar: ", 1, 2);
		if (opcion == 1) {
			aux = array1;
		}else {
			aux = array2;
		}
		Arrays.sort(aux);
	}

	private static void rellenarNumero() {
		int[] aux = null;
		int opcion = teclado.leer_entero("Seleccione array a rellenar con el mismo n�mero: ", 1, 2);
		if (opcion == 1) {
			aux = array1;
		}else {
			aux = array2;
		}
		int numero = (int) (Math.random() * 50);
		Arrays.fill(aux,  numero);
	}

	private static void rellenarAleatorios() {
		int[] aux = null;
		int opcion = teclado.leer_entero("Seleccione array a rellenar aleatoriamente: ", 1, 2);
		if (opcion == 1) {
			aux = array1;
		}else {
			aux = array2;
		}
		for (int i = 0; i < aux.length; i++) {
			aux[i] = (int) (Math.random()*50);
		}
	}

	private static int elegirOpcionMenu() {
		return teclado.leer_entero("Seleccione opci�n: ", 1, 8);
	}

	private static void menu() {
		System.out.println("=======================");
		System.out.println("         MENU");
		System.out.println("=======================");
		System.out.println("1.- Rellenar aleatorios");
		System.out.println("2.- Rellenar con un n�mero");
		System.out.println("3.- Ordenar array");
		System.out.println("4.- Mostrar array");
		System.out.println("5.- Copiar array");
		System.out.println("6.- B�squeda binaria");
		System.out.println("7.- Comparar vectores");
		System.out.println("8.- Salir");
	}

	private static void inicializar() {
		array1 = new int[50];
		array2 = new int[50];
	}

}
