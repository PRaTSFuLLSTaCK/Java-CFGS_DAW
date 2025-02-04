package EstructuraDeDatosArreglosVectoresYMatrices;

public class NumeroMayorIntroducido {
	
public static void main (String [] args) {
		
		//variables
		
		int m, i, j;
		
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
		
		m = n [0] [0];
		
		for ( i = 0; i < 3; i++) {
			
			for (j = 0; j < 2; j++) {
				
				if (n [i] [j] > m)
					
					m = n [i] [j];
				
			}
		}
		
		System.out.println("El numero mayor introducido es: " + m);
	}

}
