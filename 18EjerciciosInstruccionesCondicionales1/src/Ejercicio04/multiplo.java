package Ejercicio04;

/*Algoritmo que lee dos números enteros, positivos y distintos y nos dice
si el mayor es múltiplo del menor, o lo que es lo mismo, si el menor es
divisor del mayor.*/

public class multiplo {
	
	public static void main (String [] args) {
		int num1 = 15, num2 = 5;
		
		// primero hay que averiguar cual es el mayor
		
		if (num1 > num2)
			// num1 es el mayor, ver si es múltiplo de  num2, o num 2 es su divisor 
			// (el resto de dividir num1 entre num2 es cero 
			
			if (num1 % num2 == 0)
				System.out.println (num1 + " es múltiplo de " + num2);
			else 
				System.out.println (num1 + " no es múltiplo de " + num2);
		
		else
			// num2 es el mayor, ver si es múltiplo de  num1, o num 1 es su divisor 
			// (el resto de dividir num2 entre num1 es cero 
			
			if (num2 % num1 == 0)
				System.out.println (num2 + " es múltiplo de " + num1);
			else 
				System.out.println (num2 + " no es múltiplo de " + num1);
	}
}