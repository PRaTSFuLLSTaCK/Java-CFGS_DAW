package Soluciones;



// => 3 ptos
/* Calcula la serie que dado un número calcula:
 * 
 * si es par lo divide entre 2
 * si es impar lo multiplica por 3 y le suma 1
 * la serie termina con el número 1
 */
public class Conjetura_Collatz {
	
	/* E: n => número entero positivo
	 * S: nada, muestra por pantalla los números de la serie de Collatz empezando  por n, 
	 *          hasta que llega a 1 
	 *          además muestra por pantalla el número más grande o máximo de la serie */
	public static void mostrar_serie (int n) {
		int num = n;
		System.out.println ("La serie de la 'conjetura de Collatz' es: ");
		
		// mostrar el primer elemento de la serie
		System.out.print (num + ", ");
		
		// primer candidato a maximo
		int max = num;
		
		// mostrar el resto de elementos de la serie
		do {		
			if (num % 2 == 0) 
				num = num / 2;
			else
				num = num*3 + 1;
				
			if (num > max)
				max = num;
			
			System.out.print (num + ", ");			
		} while (num != 1);
		
		
		System.out.println ("\n El máximo es: " + max);
					
		System.out.println ("\n");					 
	}
	
	
	// main => 0,5 ptos	
	public static void main (String args[]) {
		
		int numero;
		
		do {
			numero = teclado.leer_entero ("Introduce un número entero positivo: ");
		} while (numero <=0);
		
		mostrar_serie (numero);	
		
		System.out.println ("\n===== Series de Collatz comprendidas entre 20 y 30 =====\n");
		
		// mostrar todas las series de Collatz que empieza por los números comprendidos entre 20 y 30
		// es obligatorio usar un bucle
		for (int i=20; i<=30; i++) 
			mostrar_serie (i);		
	}
}

