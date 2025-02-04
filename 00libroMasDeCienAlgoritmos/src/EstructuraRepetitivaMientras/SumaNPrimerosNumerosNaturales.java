package EstructuraRepetitivaMientras;

public class SumaNPrimerosNumerosNaturales {
	
	public static void main (String [] args) {
		
		//variables
		
		int i, n, s = 0;
		
		n = Utilidades.teclado.leer_entero("Introduzca el numero de enteros que desea sumar: ");
		
		//proceso
		
		i = 1;
		
		while (i <= n) {
			
			s = s + i;
			i++;
			
		}
		
		//salida
		
		System.out.println("La suma de los numeros es: " + s);
	}
	
	

}
