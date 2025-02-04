package EstructuraRepetitivaPara;

public class SumaNPrimerosNumerosNaturales {
	
	public static void main (String [] args) {
		
		//variables
		
		int i, s = 0, n;
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca el numero de valores que desea sumar: ");
		
		//proceso
		
		for (i = 1; i <= n; i++)
			
			s += i;
		
		//salida
		
		System.out.println("La suma de los valores es: " + s);
		
	}

}
