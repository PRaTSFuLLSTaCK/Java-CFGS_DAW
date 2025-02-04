package EstructuraRepetitivaMientras;

public class CuantosDigitosParesTieneUnNumero {
	
public static void main (String [] args) {
		
		//variables
		
		int i, d, c = 0, n;
		
		n = Utilidades.teclado.leer_entero("Introduzca el numero que desea revisar: ");
		
		//proceso
		
		while (n > 0) {
			
			d = n % 10;
			
			if (d % 2 == 0) {
			
			c += 1; 
			
			}
			
			n /= 10;
			
		}
		
		//salida
		
		System.out.println("La cantidad de digitos pares que tiene el numero itroducido son: " + c);
		
	}

}
