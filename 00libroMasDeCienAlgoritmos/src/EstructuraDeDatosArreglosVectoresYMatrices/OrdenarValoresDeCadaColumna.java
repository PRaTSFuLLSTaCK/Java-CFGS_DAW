package EstructuraDeDatosArreglosVectoresYMatrices;

public class OrdenarValoresDeCadaColumna {
	
public static void main (String [] args) {
		
		//variables
		
		int tmp, i, j;
		
		//matriz
		
		int n [] [] = new int [3] [2];
		
		//entrada
		
		n [0] [0]= Utilidades.teclado.leer_entero("Introduzca el primer valor: ");
		n [0] [1] = Utilidades.teclado.leer_entero("Introduzca el segundo valor: ");
		n [1] [0] = Utilidades.teclado.leer_entero("Introduzca el tercer valor: ");
		n [1] [1] = Utilidades.teclado.leer_entero("Introduzca el cuarto valor: ");
		n [2] [0] = Utilidades.teclado.leer_entero("Introduzca el quinto valor: ");
		n [2] [1] = Utilidades.teclado.leer_entero("Introduzca el sexto valor: ");
		
		//proceso
		
		for ( i = 0; i < 3; i++) {
			
			for (j = 0; j < 2; j++) {
				
				if (n [j] [0] > n [j + 1] [0]) {
					
					tmp = n [j] [0];
					n [j] [0] = n [j + 1] [0];
					n [j + 1] [0] = tmp;
					
				}
				
				if (n [j] [1] > n [j + 1] [1]) {
					
					tmp = n [j] [1];
					n [j] [1] = n [j + 1] [1];
					n [j + 1] [1] = tmp;
					
				}
				
			}
		}
		
		//salida
		
		System.out.println("Los valores ordenados por columnas: ");
		
		System.out.println("Numero " + n [0] [0]);
		System.out.println("Numero " + n [0] [1]);
		System.out.println("Numero " + n [1] [0]);
		System.out.println("Numero " + n [1] [1]);
		System.out.println("Numero " + n [2] [0]);
		System.out.println("Numero " + n [2] [1]);
	}

}
