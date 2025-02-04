package NumeroDeLaSuerte;

import java.util.Scanner;

import utilidades.teclado;

public class NumeroDeLaSuerte {

	/*Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, año) y calcule su número de la suerte.
	El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a continuación sumando las cifras obtenidas en la suma.

	Por ejemplo:

		Si la fecha de nacimiento es 12/07/1980 
		Calculamos el número de la suerte así: 12+7+1980 = 1999  1+9+9+9 = 28
		Número de la suerte: 28*/

	/*
	 * Programa que calcula el número de la suerte
	 */



	public static void main(String[] args) {

		char repetir = 'n';


		Scanner sc = new Scanner(System.in);
		int dia, mes, año, suerte, suma, cifra1, cifra2, cifra3, cifra4;

		int numero, sumDig = 0;
		
		int j = 0;
		int i = 0;

		do {
			System.out.println("Introduzca fecha de nacimiento");
			System.out.print("día: ");
			dia = sc.nextInt();
			System.out.print("mes: ");
			mes = sc.nextInt();
			System.out.print("año: ");
			año = sc.nextInt();
			suma = dia + mes + año;
			cifra1 = suma/1000;      //obtiene la primera cifra
			cifra2 = suma/100%10;  //obtiene la segunda cifra
			cifra3 = suma/10%10;   //obtiene la tercera cifra
			cifra4 = suma%10;        //obtiene la última cifra

			suerte = cifra1 + cifra2 + cifra3 + cifra4; // Sumamos las cifras y sacamos nuestro numero de la suerte

			if (suerte > 9) { // En el caso de que sea mayor de 9, vamos a seguir operando para sumar sus cifras

				numero = suerte;

				while(numero != 0){ //En este bucle vamos sumando las cifras hasta terminar la operacion.
					sumDig=sumDig + numero % 10;
					numero = numero / 10;

				}

				System.out.println("Su número de la suerte es: " + sumDig);
			} else {

				System.out.println("Su número de la suerte es: " + suerte);
			}
			
			repetir = teclado.leer_caracter("Si desea repetir el proceso pulse s o S ", i, j);

		}while (repetir == 's' || repetir == 'S');
	}
}
