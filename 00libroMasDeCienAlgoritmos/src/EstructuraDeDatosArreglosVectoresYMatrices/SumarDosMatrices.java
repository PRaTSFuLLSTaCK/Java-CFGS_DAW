package EstructuraDeDatosArreglosVectoresYMatrices;

public class SumarDosMatrices {
	
public static void main (String [] args) {
		
		//variables
		
		int i, j;
		
		
		//matriz
		
		int a [] [] = new int [2] [2];
		int b [] [] = new int [2] [2];
		int c [] [] = new int [2] [2];
		
		//entrada
		
		System.out.println("Introduzca los valores de la primera matriz. ");
		
		a [0] [0]= Utilidades.teclado.leer_entero("Introduzca el primer valor: ");
		a [0] [1] = Utilidades.teclado.leer_entero("Introduzca el segundo valor: ");
		a [1] [0]= Utilidades.teclado.leer_entero("Introduzca el tercero valor: ");
		a [1] [1] = Utilidades.teclado.leer_entero("Introduzca el cuarto valor: ");
		
		System.out.println("Introduzca los valores de la primera matriz. ");
		
		b [0] [0]= Utilidades.teclado.leer_entero("Introduzca el primer valor: ");
		b [0] [1] = Utilidades.teclado.leer_entero("Introduzca el segundo valor: ");
		b [1] [0]= Utilidades.teclado.leer_entero("Introduzca el tercero valor: ");
		b [1] [1] = Utilidades.teclado.leer_entero("Introduzca el cuarto valor: ");
		
		//proceso
		
		for ( i = 0; i < 4; i++) {
			
			for (j = 0; j < 3; j++) {
				
				c [i] [j] = a [i] [j] + b [i] [j];
				
			}
			
		}
		
		System.out.println("El resultado de la suma de estas matrices es: ");
		
		for ( i = 0; i < 4; i++) {
			
			for (j = 0; j < 3; j++) {
				
				System.out.println(c [i] [j]);
				
			}
			
		}
		
		
		
	}

}
