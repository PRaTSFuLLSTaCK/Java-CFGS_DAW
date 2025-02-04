package EstructuraRepetitivaPara;

public class NumeroPerfecto {
	
	public static void main (String [] args) {
		
		//variables
		
		int n, s = 0, i;
		String r = "";
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca el numero para revisar si es perfecto: ");
		
		//proceso
		
		for (i = 1; i <= 0; i++) {
			
			if  (n % i == 0) {
				
				s += i;
				
			}
			
		}
			
		if (n == s)
			
			r = "El numero es perfecto";
		
		else
			
			r = "El numero no es perfecto";
		
		//salida
		
		System.out.println(r);
		
	}

}
