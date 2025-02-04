package practicaTema10Primitiva;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;


/*
 * 
 * Ejercicio: Realiza un programa en Java JDK 11, que maneje Ficheros de Texto, de la siguiente forma:
   Una peña de amigos echa habitualmente la lotería primitiva, y quiere que un programa le permita realizar las siguientes 
   acciones, mediante este menú (0,5 ptos):
   
		1. Generar de forma aleatoria los 6 números de la primitiva
		2. Introducir de forma manual los 6 números de la primitiva 
		3. Mostrar los últimos números generados de la primitiva.
		4. Echar la primitiva.
		5. Buscar por nombre y apellidos.
		6. Buscar por fecha.
		0. Salir
		Elija opción del (0 al 6):1
 * 
 */

public class Loteria {

	private static String dir = System.getProperty("user.dir")+File.pathSeparator
			+"00ArponeroProject"+File.separator
			+"src"+File.separator
			+"practicaTema10Primitiva"+File.separator;
	private static String archivo;
	private static ArrayList<Integer> numeros;
	private static ArrayList<Integer> primitiva;
	
	
	public static void main(String[] args) {
		inicializar();
		do {
			menu();
			int opcion = leerOpcion();
			ejecutarOpcion(opcion);
		} while (true);
	}

	private static void ejecutarOpcion(int opcion) {
		switch (opcion) {
		case 1:
			generarAleatorios();
		case 2:
			generarManual();
		case 3:
			mostrarUltimos();
		case 4:
			echarPrimitiva();
		case 5:
			buscarPorNombreYApellidos();
		case 6:
			buscarPorFecha();
			break;
		default:
			System.out.println("Finalizando");
			System.exit(0);
		}
	}

	private static void buscarPorFecha() {
		
		/*
		 * 
		 * Buscar por fecha: Se introducirá por teclado la fecha en el formato dd/mm/aaaa (día mes y año) y mostrará por 
           pantalla todos los boletos de la primitiva que se han echado en esa fecha, con todos sus datos (nombre, fecha y números 
           de la lotería), buscando en el fichero de texto: loteria.txt
		 * 
		 */
		
		File f = new File(archivo);
		if (!f.exists()) {
			System.out.println("No se ha echado todavia ningun boleto de la primitiva!");
		}else {
			String fecha = teclado.leer_cadena2("Introduzca la fecha a buscar (dd/mm/yyyy): ");
			try {
				Scanner sc = new Scanner(f);
				boolean encontrado = false;
				while (sc.hasNextLine()) {
					String nombre = sc.nextLine();
					String linea = sc.nextLine();
					if(linea.startsWith("Fecha") && linea.contains(fecha)) {
						encontrado = true;
						System.out.println(nombre);
						System.out.println(linea);
						for (int i = 0; i < 6; i++) {
							System.out.println(sc.nextLine());
						}
					}else {
						for (int i = 0; i < 6; i++) {
							sc.nextLine();
					}
				}
				}
				sc.close();
				if(!encontrado) {
					System.out.println("En esa fecha no se echo ningun boleto de la primitiva");
				}
			} catch (FileNotFoundException e) {
				System.out.println("No se ha encontrado el archivo");
			}
		}		
	}

	private static void buscarPorNombreYApellidos() {
		
		/*
		 * 
		 * Buscar por nombre y apellidos: Se introducirá por teclado el nombre y apellidos y mostrará por pantalla todos los 
           boletos de la primitiva que ha echado esa persona, buscando en el fichero de texto: loteria.txt, con todos sus datos 
           (nombre, fecha y números de la lotería).
		 * 
		 */
		
		File f = new File(archivo);
		if (!f.exists()) {
			System.out.println("No se ha echado todavia ningun boleto de la primitiva!");
		}else {
			String nombre = teclado.leer_cadena2("Introduzca el nombre y apellidos a buscar: ");
			try {
				Scanner sc = new Scanner(f);
				boolean encontrado = false;
				while (sc.hasNextLine()) {
					String linea = sc.nextLine();
					if(linea.startsWith("Nombre") && linea.contains(nombre)) {
						encontrado = true;
						System.out.println(linea);
						for (int i = 0; i < 7; i++) {
							System.out.println(sc.nextLine());
						}
					}else {
						for (int i = 0; i < 7; i++) {
							sc.nextLine();
					}
				}
				}
				sc.close();
				if(!encontrado) {
					System.out.println("Persona no encontrada en el fichero.");
				}
			} catch (FileNotFoundException e) {
				System.out.println("No se ha encontrado el archivo");
			}
		}
	}

	private static void echarPrimitiva() {
		
		/*
		 * 
		 * Echar la primitiva: comprobará primero si hay alguna combinación de la primitiva generada de forma aleatoria 
           (opción 1 del menú) o de forma manual (opción 2 del menú), si no la hay, saldrá de esta opción del menú y indicando 
           este error.
           
           Si hay una combinación generada, pedirá el nombre y los dos apellidos de la persona encargada de echar la primitiva, y 
		   añadirá al final del archivo de texto: loteria.txt la siguiente información, Nombre y Apellidos, Fecha y números de la 
           lotería (3 ptos)
		 * 
		 */
		
		if(primitiva.isEmpty()) {
			System.out.println("No se han introducido aun numeros de la primitiva");
		}else {
			String nombre = teclado.leer_cadena2("Introduzca su nombre y apellidos: ");
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			String fecha = sdf.format(new Date());
			try {
				FileWriter fw = new FileWriter(archivo, true);
				PrintWriter pw = new PrintWriter(fw);
				pw.println("Nombre: "+nombre);
				pw.println("Fecha: "+fecha);
				for (Integer i : primitiva) {
					pw.println(i);
				}
				pw.close();
			} catch (IOException e) {
				System.out.println("Ha ocurrido un error");
			}
		}
	}

	private static void mostrarUltimos() {
		
		/*
		 * 
		 * Mostrar los últimos números generados de la primitiva. Mostrará los últimos números generados aleatoriamente o 
	       introducidos de forma manual. Sino se ha generado de forma aleatoria los números, ni se han introducido de forma 
           manual, indicará el programa esta circunstancia.
		 * 
		 */
		
		if(primitiva.isEmpty()) {
			System.out.println("No se han introducido aun numeros de la primitiva");
		}else {
			System.out.print("Los ultimos numreos de la primitiva son: ");
			System.out.println(primitiva.toString().replace("[", "").replace("]", ""));
		}
	}

	private static void generarManual() {
		
		/*
		 * 
		 * Introducir de forma manual los 6 números de la primitiva (6 números diferentes entre 1 y 49). Al introducir por 
           teclado los 6 números (te tienes que asegurar que sean distintos y comprendidos entre 1 y 49).
		 * 
		 */
		
		primitiva.clear();
		while (primitiva.size()<6) {
			int numero = teclado.leer_entero("Introduzca el " + (primitiva.size()+1)+"∫ numero de la primitiva: ", 1, 49);
			if(primitiva.contains(numero)) {
				System.out.println("Ya existe ese numero entre los seleccionados anteriormente");
				System.out.println("introduzca nuevamente");
			}else {
				primitiva.add(numero);
			}
		}
	}

	private static void generarAleatorios() {
		
		/*
		 * 
		 * Generar de forma aleatoria los 6 números de la primitiva (6 números diferentes entre 1 y 49). Esta opción del menú 
          mostrará por pantalla esos números de la primitiva generados aleatoriamente. (1 pto)
		 * 
		 */
		
		primitiva.clear();
		Collections.shuffle(numeros);
		for (int i = 0; i < 6; i++) {
			primitiva.add(numeros.get(i));
		}
		System.out.println("Generados 6 numeros aleatorios");
	}

	private static int leerOpcion() {
		return teclado.leer_entero("Elija opcion del 0 al 6:", 0, 6);
	}

	private static void menu() {
		System.out.println("===================================");
		System.out.println("              MENU");
		System.out.println("===================================");
		System.out.println("1.- Generar de forma aleatoria los 6 numeros de la primitiva");
		System.out.println("2.- Introducir de forma manual los 6 numeros de la primitiva");
		System.out.println("3.- Mostrar los ultimos numeros generados de la primitiva");
		System.out.println("4.- Echar la primitiva");
		System.out.println("5.- Buscar por nombre y apellidos");
		System.out.println("6.- Buscar por fecha");
		System.out.println("0.- Salir");
		System.out.println();
	}

	private static void inicializar() {
		archivo = dir + "loteria.txt";
		numeros = new ArrayList<Integer>();
		primitiva = new ArrayList<Integer>();
		for (int i = 1; i <= 49; i++) {
			numeros.add(i);
		}
	}

}

