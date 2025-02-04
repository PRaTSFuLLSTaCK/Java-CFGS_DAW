package Metodos;

/* Ejemplo: Si se quiere realizar un programa que resuelva el siguiente problema: elaborar una aplicación matemática que que realiza las siguientes operaciones: calculo del número e, factorial, primeros números primos, numero perfecto.
El número e = 1/0! + 1/1! + 1/2! + 1/3! + .... + 1/N!   siendo N la precisión (mayor precisión mejor aproximación del numero e)
Factorial de N = 1*2*3*....*N
Un número es perfecto si la suma de sus divisores es el doble del numero.
Un número N es primo si sus únicos divisores son el 1 y N.

SOLUCIÓN 1: Programa que no utiliza las recomendaciones sobre funciones. */


public class matematicas2 {

	/* in: num -> numero 
    out: el factorial de num */
	public static double factorial (int num)
	{
		int i; double producto=1;		

		for (i=1; i<=num; i++)
			producto *= i;
	
		return producto;
	} // fin factorial

	
	/* in: precision -> numero que contiene la precision,
					a mayor precision mejor aproximacion del numero e
    out: el valor del numero e calculado para esa aproximación */
	public static double numeroe ( int precision)
	{
		int i,x;
		double producto, e=0;
	
		for (x=0; x <= precision; x++) {
			producto=1;
			for (i=1; i<=x; i++)
				producto *= i;
			e = e + 1/producto;
		}	

		return e;
	} // fin numeroe

	/* in: num -> numero
   	   out: la suma de los divisores de num */
	public static long sumadivisores (int num)
	{
		int j;
		long suma = 0;
	
		/* calculamos la suma de los divisores de num*/
		for (j=1; j<=num; j++)
			if (num % j == 0)
				/* j es divisor de num */
				suma = suma + j;	
	
		return (suma);
	}/* fin sumadivisores */

	/* in: num -> numero
         v -> vector de enteros de dimension num o mayor
   		out: numero de primos comprendidos entre 1 y num			 
				en v se almacenan los primos comprendidos entre 1 y num */
	public static int primos (int num, int V[])
	{
		int j,candidato, cuenta_primos =0;		
		long suma;

		for (candidato=2; candidato<=num; candidato++) {			
			/* calculamos los divisores de candidato*/
			suma = sumadivisores (candidato);

			/* vemos si es primo candidato*/
			if (suma == 1+candidato) {
				V[cuenta_primos] = candidato;
				cuenta_primos++;
			}
		}	
	
		return cuenta_primos;
	} // fin primos


	/* in: num -> numero
   		out: true -> si num es perfecto
             false -> si num no es perfecto */
	public static boolean perfecto (int num)
	{
		boolean resultado;
	
		if (sumadivisores(num) == 2*num)
			resultado = true;
		else
			resultado = false;
	
		return resultado;
	}/* fin perfecto */
	


	public static void main (String args [] ) {
		int n, total_primos;		
		
		n = teclado.leer_entero ("\n Introduce un numero entero positivo o cero: ");

		int vector [] = new int[n];

		System.out.println (" El factorial de " + n + " es: " + factorial(n));
		System.out.println (" El numero e con precisión " + n + " es: " + numeroe(n));
		total_primos = primos (n, vector);
		System.out.println (" El total de primos entre 1 y " + n + " es " + total_primos);
		
		System.out.println (" Los " + total_primos + " primeros primos son:\n");
		for (int i=0; i<total_primos; i++)
			System.out.print (vector[i] + ", ");
		
		if (perfecto (n) == true)
			System.out.println (" El numero " + n + "es perfecto");			
		else
			System.out.println (" El numero " + n + "no es perfecto");		
						
	} // fin main


} // fin clase matematicas
