package EstructuraRepetitivaMientras;

public class CuantosDigitosTieneUnNumero {
	
	public static void main (String [] args) {
		
		//variables
		
		int i, n, c = 0;
		
		n = Utilidades.teclado.leer_entero("Introduzca el numero que desea revisar: ");
		
		//proceso
		
		while (n > 0) {
			
			n = n / 10;
			c += 1; 
			
		}
		
		//salida
		
		System.out.println("La cantidad de digitos que tiene el numero itroducido son: " + c);
		
	}

}
