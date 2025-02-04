package Metodos;

/* Ejemplo: Si se quiere realizar un programa que resuelva el siguiente problema: elaborar una aplicación matemática que que realiza las siguientes operaciones: calculo del número e, factorial, primeros números primos, numero perfecto.
El número e = 1/0! + 1/1! + 1/2! + 1/3! + .... + 1/N!   siendo N la precisión (mayor precisión mejor aproximación del numero e)
Factorial de N = 1*2*3*....*N
Un número es perfecto si la suma de sus divisores es el doble del numero.
Un número N es primo si sus únicos divisores son el 1 y N.

SOLUCIÓN 1: Programa que no utiliza las recomendaciones sobre funciones. */

public class matematicas {


	public static void factorial ()
	{
		int num; int i; double producto=1;
	
		num = teclado.leer_entero ("\n Introduce un numero positivo: ");

		for (i=1; i<=num; i++)
			producto *= i;
	
		System.out.println ("\n El factorial de " + num + " es " + producto);	
	} // fin factorial

	public static void numeroe ( int precision)
	{
		int i,x;
		double producto, e=0;
	
		for (x=0; x <= precision; x++) {
			producto=1;
			for (i=1; i<=x; i++)
				producto *= i;
			e = e + 1/producto;
		}	

		System.out.println ("\n El valor del numero e con precision " + precision + " es " + e);	
	} // fin numeroe

	public static void primos (int num)
	{
		int j,candidato,suma;
	
		System.out.print ("\n Los primos entre 1 y " + num + " son: \n ");

		for (candidato=2; candidato<=num; candidato++) {
			suma = 0;
			/* calculamos los divisores de candidato*/
			for (j=1; j<=candidato; j++)
				if (candidato % j == 0)
					suma = suma + j; /* j es divisor de candidato */
			/* vemos si es primo candidato*/
			if (suma == 1+candidato)
				System.out.print (" " + candidato);
		}	
	} // fin primos

	public static void perfecto ()
	{
		 int j,candidato,suma;
	
		candidato = teclado.leer_entero ("\n Introduce un numero positivo: ");

		suma = 0;
		/* calculamos la suma de los divisores de candidato*/
		for (j=1; j<=candidato; j++)
			if (candidato % j == 0)
				suma = suma + j;  /* j es divisor de candidato */
	
		/* vemos si es perfecto candidato*/
		if (suma == 2*candidato)
			System.out.print ("\n" + candidato + " es perfecto ");
		else
			System.out.print ("\n" + candidato + " NO es perfecto ");
	}
	


	public static void main (String args [] ) {
		int n;	
	
		factorial();	
		
		
		n = teclado.leer_entero ("\n Introduce un numero entero positivo o cero: ");
		
		numeroe(n);	
		primos(n);
		perfecto();				
	}


} // fin clase matematicas
