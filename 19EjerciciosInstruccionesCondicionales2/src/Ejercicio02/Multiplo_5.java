package Ejercicio02;

import java.util.Scanner;

public class Multiplo_5 {
	
	public static void main (String [] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingrese el numero para ver si multiplo de 5: ");
	 
		int num = sc.nextInt();
		
		if (num % 5 == 0)
			System.out.println ("El numero " + num +" es multiplo de 5");
		else
			System.out.println ("El numero " + num +" no es multiplo de 5");
	}
}