package EstructuraRepetitivaMientras;

public class DevolverDigitoMayorDeUnNumero {
	
	public static void main (String [] args) {
		
		//variables
		
		int d, m = 0, n;
		
		n = Utilidades.teclado.leer_entero("Introduzca el numero que desea revisar: ");
		
		//proceso
		
		while (n > 0) {
			
			d = n % 10;
			
			if (d < m) {
			
				m = d; 
			
			}
			
			n /= 10;
			
		}
		
		//salida
		
		System.out.println("El digito mayor del numero introducido es: " + m);
		
	}

}
