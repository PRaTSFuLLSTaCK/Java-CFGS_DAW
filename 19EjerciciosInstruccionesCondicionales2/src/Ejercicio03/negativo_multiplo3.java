package Ejercicio03;

import java.util.Scanner;

/*Realiza un programa que lea desde teclado un número entero y muestre
por pantalla si es negativo y múltiplo de 3 o si no lo es.*/

public class negativo_multiplo3 {
	
	public static void main (String [] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingrese el numero para ver si negativo y multiplo de 3: ");
	 
		int num = sc.nextInt();
		
		if (num % 3 == 0 && num < 0)
			
			System.out.println ("Es multiplo de 3 y negativo ");
		else
				
			System.out.println ("No Es multiplo de 3 y es positivo  ");
			
		
	}
}