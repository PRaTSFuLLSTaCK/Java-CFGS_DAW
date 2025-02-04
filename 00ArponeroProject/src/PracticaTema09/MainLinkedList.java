package PracticaTema09;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/*
 * 
 * Ejercicio 3) Crea dos listas enlazadas LinkedList de números enteros, pon 10 elementos al menos en cada 
   una de las dos listas y realiza un programa con el siguiente menú: 
   
		1. Añade al final una lista la otra lista.
		
		2. Muestra el contenido de las dos listas al derecho o al revés.
		
		3. Elimina elementos de la lista, comprendidos en un rango (por ejemplo eliminar los elementos 
			comprendidos entre el 2º y el 6º)
			
		4. Inserta un elemento en cualquiera de las dos listas.
		
		5. Calcula la media aritmética de cada una de las dos listas.
 * 
 */

public class MainLinkedList {
	private static LinkedList<Integer> lista1;
	private static LinkedList<Integer> lista2;

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
			anadirAlFinal();
			break;
		case 2:
			mostrarContenido();
			break;
		case 3:
			eliminarRangos();
			break;
		case 4:
			insertar();
			break;
		case 5:
			mediaAritmetica();
			break;
		default:
			System.out.println("Programa finalizado");
			System.exit(0);
		}
	}

	private static void mediaAritmetica() {
		int opcion = teclado.leer_entero("Selecciona lista para hacer media aritm�tica: ", 1, 2);
		if (opcion == 1) {
			double suma = 0;
			for (int i = 0; i < lista1.size(); i++) {
				suma += lista1.get(i);
			}
			System.out.println("Media aritm�tica: "+(suma/lista1.size()));
		}else {
			double suma = 0;
			for (int i = 0; i < lista2.size(); i++) {
				suma += lista2.get(i);
			}
			System.out.println("Media aritm�tica: "+(suma/lista2.size()));
		}
	}

	private static void insertar() {
		int opcion = teclado.leer_entero("Selecciona lista para insertar: ", 1, 2);
		int numero = teclado.leer_entero("Introduzca el n�mero: ", 1, 2);
		
		if (opcion == 1) {
			lista1.add(numero);
		}else {
			lista2.add(numero);
		}

	}

	private static void eliminarRangos() {
		int opcion = teclado.leer_entero("Selecciona lista para eliminar entre rangos: ", 1, 2);
		if (opcion == 1) {
			int inicio = teclado.leer_entero("Seleccione el rango de inicio: ", 0, lista1.size()-1);
			int fin = teclado.leer_entero("Seleccione el rango de fin: ", inicio, lista1.size()-1);
			for (int i = 0; i < fin-inicio+1; i++) {
				lista1.remove(inicio);
			}
		}else {
			int inicio = teclado.leer_entero("Seleccione el rango de inicio: ", 0, lista2.size()-1);
			int fin = teclado.leer_entero("Seleccione el rango de fin: ", inicio, lista2.size()-1);
			for (int i = 0; i < fin-inicio+1; i++) {
				lista2.remove(inicio);
			}
		}
	}

	private static void mostrarContenido() {
		int opcion = teclado.leer_entero("Mostrar al derecho (1) o al rev�s (2): ", 1, 2);
		if (opcion == 1) {
			System.out.println("Lista 1: "+ lista1);
			System.out.println("Lista 2: "+ lista2);
		}else {
			Collections.reverse(lista1);
			System.out.println("Lista 1 inversa: " + lista1);
			Collections.reverse(lista1);
			
			Collections.reverse(lista2);
			System.out.println("Lista 2 inversa: " + lista2);
			Collections.reverse(lista2);
		}
	}

	private static void anadirAlFinal() {
		int opcion = teclado.leer_entero("Seleccione array para a�adir al final: ", 1, 2);
		if (opcion == 1) {
			lista1.addAll(lista2);
		}else {
			lista2.addAll(lista1);
		}		
	}

	private static int elegirOpcionMenu() {
		return teclado.leer_entero("Seleccione opci�n: ", 1, 6);
	}

	private static void menu() {
		System.out.println("1.- A�adir al final");
		System.out.println("2.- Ordenar array");
		System.out.println("3.- Eliminar entre rangos");
		System.out.println("4.- Insertar");
		System.out.println("5.- Media aritm�tica");
		System.out.println("6.- Salir");
	}

	private static void inicializar() {
		lista1 = new LinkedList<Integer>();
		lista2 = new LinkedList<Integer>();

		for (int i = 0; i < 10; i++) {
			lista1.add((int) (Math.random() * 100));
			lista2.add((int) (Math.random() * 100));
		}
	}

}
