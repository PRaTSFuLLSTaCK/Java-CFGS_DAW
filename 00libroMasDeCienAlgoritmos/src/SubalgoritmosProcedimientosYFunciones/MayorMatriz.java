package SubalgoritmosProcedimientosYFunciones;

public class MayorMatriz {
	
public static void main(String[] args) {
		
		//variables
		
		int m = 0;
		
		int n [] [] = new int [3] [2];
		
		//entrada
		
		n [0] [0] = Utilidades.teclado.leer_entero("Introduzca el  numero: ");
		n [0] [1] = Utilidades.teclado.leer_entero("Introduzca el  numero: ");
		n [1] [0] = Utilidades.teclado.leer_entero("Introduzca el  numero: ");
		n [1] [1] = Utilidades.teclado.leer_entero("Introduzca el  numero: ");
		n [2] [0] = Utilidades.teclado.leer_entero("Introduzca el  numero: ");
		n [2] [1] = Utilidades.teclado.leer_entero("Introduzca el  numero: ");
		
		//proceso
		
		m = Mayor (n);
		
		//salida
		
		System.out.println("El numero mayor es: " + m);
	}
	
	//metodo Mayor
	
	private static int Mayor (int Num [] []) {
		
		//variable
		
		int m = 0, i, j;
		
		//proceso
		
		m = Num [0] [0];
		
		for (i = 0; i < 2; i++) {
			
			for (j = 0; j < 1; j++) {
		
				if (Num [i] [j] > m)
			
					m = Num [i] [j];
			}
			
		}
		
		//salida
		
		return m;
		
	}

}
