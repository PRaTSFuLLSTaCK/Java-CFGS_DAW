package EstructuraRepetitivaPara;

public class NumeroMultiploAntecesorAlIntroducido {
	
	public static void main (String [] args) {
		
		//variables
		
		int n, d, i, r = 0;
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca el numero que desea revisar: ");
		d = Utilidades.teclado.leer_entero("Introduzca el divisor: ");
		
		//proceso
		
		for (i = n - 1; i >= 1; i -= 1) {
			
			if (i % d == 0) {
				
				r = i;
				break;
				
			}
			
		}
		
		//salida
		
		System.out.println("Respuesta: " + r);
		
	}

}
