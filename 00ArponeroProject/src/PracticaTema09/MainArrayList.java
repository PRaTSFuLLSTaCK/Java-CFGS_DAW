package PracticaTema09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * 
 *Ejercicio 2) Crea dos ArrayList y un array normal (todos de enteros) y realiza un programa con el 
  siguiente menú: 
  
		1. Rellenar aleatorios (genera 50 números aleatorios en el ArrayList escogido o del array normal , 
			machacando su contenido anterior). 
			
		2. Rellenar con un número (todos los elementos del ArrayList escogido (1 o 2) se rellenan con un 
			mismo número)
			
		3. Ordenar el ArrayList escogido de forma ascendente o descendente. 
		
		4. Mostrar el contenido del ArrayList escogido o del array normal.
		
		5. Borrar el número del ArrayList escogido (se borra tantas veces como aparezca)
		
		6. Realiza una búsqueda binaria en el ArrayList escogido.
		
		7. Ordena al azar el ArrayList escogido (método shufle)
		
		8. Invierte el orden de los elementos del ArrayList escogido (método reverse)
		
		9. Copiar el contenido de un ArrayList en otro.
		
		10. Calcula el máximo y mínimo del ArrayList escogido.
		
		11. Añade al final de un ArrayList el contenido del array normal (método addAll).
		
		12. Calcula el número de veces que se repite un entero en un ArrayList (método frequency)
		
		13. Comprueba si los dos ArrayList tienen números enteros en común (método disjoint)

 *
 */

public class MainArrayList {
	
	private static ArrayList<Integer> lista1;
	private static ArrayList<Integer> lista2;
	private static Integer[] array;
	
	public static void main(String[] args) {
		inicializar();
		do {
			menu();
			int opcion = elegirOpcionMenu();
			ejecutarOpcion(opcion);
		} while (true);
	}
	
	private static int elegirOpcionMenu() {
		return teclado.leer_entero("Seleccione opci�n: ", 1, 14);
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
			borrarNumero();
			break;
		case 6:
			busquedaBinaria();
			break;
		case 7:
			shuffle();
			break;
		case 8:
			reverse();
			break;
		case 9:
			copiarArray();
			break;
		case 10:
			maximoMinimo();
			break;
		case 11:
			addAll();
			break;
		case 12:
			frequency();
			break;
		case 13:
			disjoint();
			break;
		default:
			System.out.println("Programa finalizado");
			System.exit(0);
		}
	}
	
	private static void disjoint() {
		if (Collections.disjoint(lista1, lista2)) {
			System.out.println("No contienen elementos en com�n");
		}else {
			System.out.println("Contienen elementos en com�n");
		}		
	}

	private static void frequency() {
		int opcion = teclado.leer_entero("Seleccione array para buscar su frecuencia: ", 1, 2);
		int numero = teclado.leer_entero("Indique un n�mero a buscar: ");
		if (opcion == 1) {
			System.out.println("Frecuencia de repetici�n: " + Collections.frequency(lista1, numero));
		}else {
			System.out.println("Frecuencia de repetici�n: " + Collections.frequency(lista2, numero));
		}
	}

	private static void addAll() {
		int opcion = teclado.leer_entero("Seleccione array para a�adir al final: ", 1, 2);
		if (opcion == 1) {
			lista1.addAll(Arrays.asList(array));
		}else {
			lista2.addAll(Arrays.asList(array));
		}
	}

	private static void maximoMinimo() {
		int opcion = teclado.leer_entero("Seleccione array a buscar m�ximo y m�nimo: ", 1, 2);
		if (opcion == 1) {
			System.out.println("Maximo: "+ Collections.max(lista1));
			System.out.println("M�nimo: "+ Collections.min(lista1));
		}else {
			System.out.println("Maximo: "+ Collections.max(lista2));
			System.out.println("M�nimo: "+ Collections.min(lista2));
		}		
	}

	private static void copiarArray() {
		int opcion = teclado.leer_entero("Seleccione array a copiar: ", 1, 2);
		try {
			if (opcion == 1) {
				Collections.copy(lista1, lista2);
			}else {
				Collections.copy(lista2, lista1);
			}
		} catch (Exception e) {
			System.out.println("Error, no se pueden copiar las listas");
		}
		

	}

	private static void reverse() {
		int opcion = teclado.leer_entero("Seleccione array a invertir: ", 1, 2);
		if (opcion == 1) {
			Collections.reverse(lista1);
		}else {
			Collections.reverse(lista2);
		}
	}

	private static void shuffle() {
		int opcion = teclado.leer_entero("Seleccione array a desordenar: ", 1, 2);
		if (opcion == 1) {
			Collections.shuffle(lista1);
		}else {
			Collections.shuffle(lista2);
		}
			
	}

	private static void busquedaBinaria() {
		int opcion = teclado.leer_entero("Seleccione array a buscar un n�mero: ", 1, 2);
		Integer numero = teclado.leer_entero("Introduzca n�mero a buscar: ");
		if(opcion == 1) {
			System.out.println("Posici�n: " + lista1.indexOf(numero));
		}else {
			System.out.println("Posici�n: " + lista2.indexOf(numero));
		}
	}

	private static void borrarNumero() {
		int opcion = teclado.leer_entero("Seleccione array a borrar: ", 1, 2);
		Integer numero = teclado.leer_entero("Introduzca n�mero a borrar: ");
		if(opcion == 1) {
			while (lista1.remove(numero)) {}
		}else {
			while (lista2.remove(numero)) {}
		}
	}

	private static void mostrarArray() {
		int opcion = teclado.leer_entero("Seleccione array a mostrar: ", 1, 3);
		if(opcion == 1 ) {
			System.out.println(lista1);
		}else if(opcion == 2) {
			System.out.println(lista2);
		}else {
			System.out.println(Arrays.toString(array));
		}
	}

	private static void ordenarArray() {
		int opcion = teclado.leer_entero("Seleccione array a ordenar: ", 1, 2);
		if (opcion == 1) {
			lista1.sort(null);
		}else {
			lista2.sort(null);
		}
	}

	private static void rellenarNumero() {
		int opcion = teclado.leer_entero("Seleccione array a rellenar con un n�mero: ", 1, 2);
		int numero = (int) (Math.random() * 50);
		if (opcion == 1) {
			lista1.clear();
			for (int i = 0; i < 50; i++) {
				lista1.add(numero);
			}
		}else {
			lista2.clear();
			for (int i = 0; i < 50; i++) {
				lista2.add(numero);
			}
		}
	}

	private static void rellenarAleatorios() {
		int opcion = teclado.leer_entero("Seleccione array a rellenar aleatoriamente: ", 1, 3);
		if(opcion == 1 ) {
			lista1.clear(); //limpiar contenido
			for (int i = 0; i < 50; i++) {
				lista1.add((int) (Math.random()*50));
			}
		}else if(opcion == 2) {
			lista2.clear();
			for (int i = 0; i < 50; i++) {
				lista2.add((int) (Math.random()*50));
			}
		}else {
			for (int i = 0; i < array.length; i++) {
				array[i] = (int) (Math.random()*50);
			}
		}
	}

	private static void inicializar() {
		lista1 = new ArrayList<Integer>();
		lista2 = new ArrayList<Integer>();
		array = new Integer[50];
	}
	
	private static void menu() {
		System.out.println("=======================");
		System.out.println("         MENU");
		System.out.println("=======================");
		System.out.println("1.- Rellenar aleatorios");
		System.out.println("2.- Rellenar con un n�mero");
		System.out.println("3.- Ordenar array");
		System.out.println("4.- Mostrar array");
		System.out.println("5.- Borrar n�mero");
		System.out.println("6.- B�squeda binaria");
		System.out.println("7.- Shuffle");
		System.out.println("8.- Invertir orden");
		System.out.println("9.- Copiar contenido");
		System.out.println("10.- Calcular m�ximo-m�nimo");
		System.out.println("11.- A�adir al final");
		System.out.println("12.- N�mero de repeticiones");
		System.out.println("13.- Comparar disjuntos");
		System.out.println("14.- Salir");
	}

}
