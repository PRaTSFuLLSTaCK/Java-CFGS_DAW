package ControlDeFlujo;

import javax.swing.JOptionPane;

public class ClaseFor {

	private static int num = 0;

	/*
	 * for lo utilizaramos para realizar repeticiones
	 * 
	 * vamos a mostrar las tablas de multiplicar.
	 */

	public static void main(String[] args) {

		do {

			num = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Ingrese el numero del cual quieres la tabla pulse 11 para salir"));

			switch (num) {

			case 1:

				System.out.println("Esta es la tabla del  " + num);

				System.out.println("");

				for (int i = 0; i <= 10; i++) {

					System.out.println("El resultado es. " + (i * num));// imprimir en pantalla el mensaje que queramos
																		// con
																		// salto de linea.

				}

				break;

			case 2:

				System.out.println("Esta es la tabla del  " + num);

				System.out.println("");

				for (int i = 0; i <= 10; i++) {

					System.out.println("El resultado es. " + (i * num));// imprimir en pantalla el mensaje que queramos
																		// con
																		// salto de linea.

				}

				break;

			case 3:

				System.out.println("Esta es la tabla del  " + num);

				System.out.println("");

				for (int i = 0; i <= 10; i++) {

					System.out.println("El resultado es. " + (i * num));// imprimir en pantalla el mensaje que queramos
																		// con
																		// salto de linea.

				}

				break;

			case 4:

				System.out.println("Esta es la tabla del  " + num);

				System.out.println("");

				for (int i = 0; i <= 10; i++) {

					System.out.println("El resultado es. " + (i * num));// imprimir en pantalla el mensaje que queramos
																		// con
																		// salto de linea.

				}

				break;

			case 5:

				System.out.println("Esta es la tabla del  " + num);

				System.out.println("");

				for (int i = 0; i <= 10; i++) {

					System.out.println("El resultado es. " + (i * num));// imprimir en pantalla el mensaje que queramos
																		// con
																		// salto de linea.

				}

				break;

			case 6:

				System.out.println("Esta es la tabla del  " + num);

				System.out.println("");

				for (int i = 0; i <= 10; i++) {

					System.out.println("El resultado es. " + (i * num));// imprimir en pantalla el mensaje que queramos
																		// con
																		// salto de linea.

				}

				break;

			case 7:

				System.out.println("Esta es la tabla del  " + num);

				System.out.println("");

				for (int i = 0; i <= 10; i++) {

					System.out.println("El resultado es. " + (i * num));// imprimir en pantalla el mensaje que queramos
																		// con
																		// salto de linea.

				}

				break;

			case 8:

				System.out.println("Esta es la tabla del  " + num);

				System.out.println("");

				for (int i = 0; i <= 10; i++) {

					System.out.println("El resultado es. " + (i * num));// imprimir en pantalla el mensaje que queramos
																		// con
																		// salto de linea.

				}

				break;

			case 9:

				System.out.println("Esta es la tabla del  " + num);

				System.out.println("");

				for (int i = 0; i <= 10; i++) {

					System.out.println("El resultado es. " + (i * num));// imprimir en pantalla el mensaje que queramos
																		// con
																		// salto de linea.

				}

				break;

			case 10:

				System.out.println("Esta es la tabla del  " + num);

				System.out.println("");

				for (int i = 0; i <= 10; i++) {

					System.out.println("El resultado es. " + (i * num));// imprimir en pantalla el mensaje que queramos
																		// con
																		// salto de linea.

				}

				break;

			case 11:

				System.exit(0);// con esta instruccion salimos del programa

				break;

			default:

				System.out.println("No ha introducido un numero entre 1 y 10.");// imprimir en pantalla el mensaje que
																				// queramos con salto de linea.
			}
		} while (num != 11);
	}

}
