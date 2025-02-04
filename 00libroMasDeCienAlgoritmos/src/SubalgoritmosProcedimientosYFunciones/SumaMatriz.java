package SubalgoritmosProcedimientosYFunciones;

public class SumaMatriz {
	
public static void main(String[] args) {
		
		//variables
		
		int m = 0;
		
		int a [] [] = new int [2] [2];
		int b [] [] = new int [2] [2];
		int c [] [] = new int [2] [2];
		
		//entrada
		
		System.out.println("Introduzca los valores de la matriz: ");
		
		a [0] [0] = Utilidades.teclado.leer_entero("Introduzca el  numero: ");
		a [0] [1] = Utilidades.teclado.leer_entero("Introduzca el  numero: ");
		a [1] [0] = Utilidades.teclado.leer_entero("Introduzca el  numero: ");
		a [1] [1] = Utilidades.teclado.leer_entero("Introduzca el  numero: ");
		
		System.out.println("Introduzca los valores de la matriz: ");
		
		b [0] [0] = Utilidades.teclado.leer_entero("Introduzca el  numero: ");
		b [0] [1] = Utilidades.teclado.leer_entero("Introduzca el  numero: ");
		b [1] [0] = Utilidades.teclado.leer_entero("Introduzca el  numero: ");
		b [1] [1] = Utilidades.teclado.leer_entero("Introduzca el  numero: ");
		
		//proceso
		
		c = Sumar (a, b);
		
		//salida
		
		System.out.println("El numero mayor es: " + m);
	}
	
	//metodo Mayor
	
	private static int[][] Sumar (int ArrA [] [], int ArrB [] []) {
		
		//variable
		
		int i, j;
		
		int s [] [] = new int [2] [2];
		
		//proceso
		
		for (i = 0; i < 2; i++) {
			
			for (j = 0; j < 2; j++) {
		
				s [i] [j] = ArrA [i] [j] + ArrB [i] [j];
				
			}
			
		}
		
		//salida
		
		return s;
		
	}

}
