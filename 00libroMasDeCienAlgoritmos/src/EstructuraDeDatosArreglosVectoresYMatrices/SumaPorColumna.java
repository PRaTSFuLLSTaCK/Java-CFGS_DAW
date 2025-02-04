package EstructuraDeDatosArreglosVectoresYMatrices;

public class SumaPorColumna {
	
public static void main (String [] args) {
		
		//variables
		
		int s0 = 0, s1 = 0, s2 = 0, i;
		
		//matriz
		
		int n [] [] = new int [4] [3];
		
		//entrada
		
		n [0] [0]= Utilidades.teclado.leer_entero("Introduzca el primer valor: ");
		n [0] [1] = Utilidades.teclado.leer_entero("Introduzca el segundo valor: ");
		n [0] [2] = Utilidades.teclado.leer_entero("Introduzca el tercer valor: ");
		n [1] [0]= Utilidades.teclado.leer_entero("Introduzca el cuarto valor: ");
		n [1] [1] = Utilidades.teclado.leer_entero("Introduzca el quinto valor: ");
		n [1] [2] = Utilidades.teclado.leer_entero("Introduzca el sexto valor: ");
		n [2] [0]= Utilidades.teclado.leer_entero("Introduzca el septimo valor: ");
		n [2] [1] = Utilidades.teclado.leer_entero("Introduzca el octavo valor: ");
		n [2] [2] = Utilidades.teclado.leer_entero("Introduzca el novemo valor: ");
		n [3] [0]= Utilidades.teclado.leer_entero("Introduzca el decimo valor: ");
		n [3] [1] = Utilidades.teclado.leer_entero("Introduzca el decimo primer valor: ");
		n [3] [2] = Utilidades.teclado.leer_entero("Introduzca el decimo segundo valor: ");
		
		//proceso
		
		for ( i = 0; i < 4; i++) {
			
			s0 += n [i][0];
			s1 += n [i][1];
			s2 += n [i][2];
			
		}
		
		System.out.println("La suma de los valores de la primera columna es: " + s0);
		System.out.println("La suma de los valores de la segunda columna es: " + s1);
		System.out.println("La suma de los valores de la tercera columna es: " + s2);
	}

}


