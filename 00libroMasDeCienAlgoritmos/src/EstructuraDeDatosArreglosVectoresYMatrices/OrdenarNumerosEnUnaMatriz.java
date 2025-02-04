package EstructuraDeDatosArreglosVectoresYMatrices;

public class OrdenarNumerosEnUnaMatriz {
	
public static void main (String [] args) {
		
		//variables
		
		int tmp, i, j, k, x;
		
		//matriz
		
		int n [] []= new int [3] [3];
		int o [] = new int [9];
		
		//entrada
		
		n [0] [0]= Utilidades.teclado.leer_entero("Introduzca el primer valor: ");
		n [0] [1] = Utilidades.teclado.leer_entero("Introduzca el segundo valor: ");
		n [0] [2] = Utilidades.teclado.leer_entero("Introduzca el tercer valor: ");
		n [1] [0] = Utilidades.teclado.leer_entero("Introduzca el cuarto valor: ");
		n [1] [1] = Utilidades.teclado.leer_entero("Introduzca el quinto valor: ");
		n [1] [2] = Utilidades.teclado.leer_entero("Introduzca el sexto valor: ");
		n [2] [0] = Utilidades.teclado.leer_entero("Introduzca el septimo valor: ");
		n [2] [1] = Utilidades.teclado.leer_entero("Introduzca el octavo valor: ");
		n [2] [2] = Utilidades.teclado.leer_entero("Introduzca el noveno valor: ");
		
		//proceso
		
		x = 0;
		
		for ( i = 0; i < 3; i++) {
			
			for (j = 0; j < 3; j++) {
				
				o [x] = n [i] [j];
				
				x++;
				
			}
		}
		
		for ( i = 0; i < 3; i++) {
			
			for (j = 0; j < 3; j++) {
				
				if (o [j] > o [j + 1]) {
					
					tmp = o [j + 1];
					o [j + 1] = o [j];
					o [j] = tmp;
					
				}
				
			}
			
		}
		
		x = 0;
		
		for (i = 0; i < 3; i++) {
			
			for (j = 0; j < 3; j++) {
				
				n [i] [j] = o [x];
				x++;
				
			}
			
		}
		
		//salida
		
		System.out.println("Los valores ordenados son:");
		
		for (i = 0; i < o.length; i++) {
			
			System.out.println("Numero: " + o [i]);
			
		}
		
	}

}
