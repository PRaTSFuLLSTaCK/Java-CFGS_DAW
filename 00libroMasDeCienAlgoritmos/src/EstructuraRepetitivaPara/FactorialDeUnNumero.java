package EstructuraRepetitivaPara;

public class FactorialDeUnNumero {
	
	public static void main (String [] args) {
		
		//variables
		
		int n, f, i; 
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca un numero para sacar su factorial: ");
		
		//proceso
		
		f = 1;
		
		for (i = 1; i <= n; i++) {
			
			f *= i;
			
		}
		
		System.out.println("El factorial es: " + f);
		
	}
	

}
