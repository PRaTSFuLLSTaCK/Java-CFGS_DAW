package EstructuraDeDatosArreglosVectoresYMatrices;

public class SumaDeCincoNumeros {
	
	public static void main (String [] args) {
		
		//variables
		
		int s = 0, i;
		
		//vectores
		
		int n [] = new int [5];
		
		//entrada
		
		n [0] = Utilidades.teclado.leer_entero("Introduzca el primer valor: ");
		n [1] = Utilidades.teclado.leer_entero("Introduzca el segundo valor: ");
		n [2] = Utilidades.teclado.leer_entero("Introduzca el tercer valor: ");
		n [3] = Utilidades.teclado.leer_entero("Introduzca el cuarto valor: ");
		n [4] = Utilidades.teclado.leer_entero("Introduzca el quinto valor: ");
		
		//proceso
		
		for ( i = 0; i < 5; i++) {
			
			s += n [i];
			
		}
		
		//salida
		
		System.out.println("La suma de los valores introducidos es: " + s);
		
	}

}
