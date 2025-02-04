package EstructuraDeDatosArreglosVectoresYMatrices;

public class CuantosNumerosDeASeEncuentranEnB {
	
public static void main (String [] args) {
		
		//variables
		
		int c = 0, i, j;
		
		//vectores
		
		int a [] = new int [4];
		int b [] = new int [4];
		
		//entrada
		
		System.out.println("Valores para el vector a: ");
		
		a [0] = Utilidades.teclado.leer_entero("Introduzca el primer valor: ");
		a [1] = Utilidades.teclado.leer_entero("Introduzca el segundo valor: ");
		a [2] = Utilidades.teclado.leer_entero("Introduzca el tercer valor: ");
		a [3] = Utilidades.teclado.leer_entero("Introduzca el cuarto valor: ");
		
		System.out.println("Valores para el vector b: ");
		
		b [0] = Utilidades.teclado.leer_entero("Introduzca el quinto valor: ");
		b [1] = Utilidades.teclado.leer_entero("Introduzca el sexto valor: ");
		b [2] = Utilidades.teclado.leer_entero("Introduzca el septimo valor: ");
		b [3] = Utilidades.teclado.leer_entero("Introduzca el septimo valor: ");
		
		
		//proceso
		
		for ( i = 0; i < a.length; i++) {
			
			for (j = 0; j < b.length; j++) {
				
				if (a [i] == b [j]) {
					
					c += 1;
				}
				
			}
			
		}
		
		//salida
		
		System.out.println("La cantidad de numeros que se repiten en ambos vectores es: " + c);
		
	}

}
