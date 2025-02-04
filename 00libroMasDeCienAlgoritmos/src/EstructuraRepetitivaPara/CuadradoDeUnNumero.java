package EstructuraRepetitivaPara;

public class CuadradoDeUnNumero {
	
	public static void main (String [] args) {
		
		//variable
		
		int i, n, c = 0;
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca el numero con el que desea operar: ");
		
		//proceso
		
		for (i = 1; i <= n; i++) {
			
			c = c + (2 * i -1);
			
		}
		
		//salida
		
		System.out.println("El cuadrado es: " + c);
		
	}

}
