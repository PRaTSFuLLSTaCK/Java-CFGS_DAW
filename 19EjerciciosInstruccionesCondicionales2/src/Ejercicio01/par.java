package Ejercicio01;

import java.util.Scanner;

/*Hacer un programa que lea un número entero desde teclado y muestre
por pantalla si el número es impar o par.
Nota: un número es par si el resto de dividir ese número entre dos es
cero.*/

public class par {
	
	public static void main (String [] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingrese el numero para ver si es par o impar: ");
	 
		int num = sc.nextInt();
		
		if (num % 2 == 0)
			System.out.println ("El numero " + num + " es par. ");
		else
			System.out.println ("El numero " + num + " es impar.");
	}
}