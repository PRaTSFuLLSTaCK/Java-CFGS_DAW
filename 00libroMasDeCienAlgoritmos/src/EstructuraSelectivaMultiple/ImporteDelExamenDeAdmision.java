package EstructuraSelectivaMultiple;

public class ImporteDelExamenDeAdmision {
	
	public static void main (String [] args) {
		
		//variables
		
		char c, n;
		int mp = 0;
		
		//entrada
		
		c = Utilidades.teclado.leer_caracter("Introduzca si el tipo de examen que desea pagar Nacional o Publico: ");
		n = Utilidades.teclado.leer_caracter("Introduzca si el nivel de examen que desea pagar A, B, C: ");
		
		//proceso
		
		if (c == 'n' || c == 'N') {
			
			if (n == 'a' || n == 'A')
				
				mp = 300;
			
			else if (n == 'b' || n == 'B')
				
				mp = 200;
			
			else if (n == 'c' || n == 'C')
				
				mp = 100;
			
		} else if (c == 'p' || c == 'P') {
			
			if (n == 'a' || n == 'A')
				
				mp = 400;
			
			else if (n == 'b' || n == 'B')
				
				mp = 300;
			
			else if (n == 'c' || n == 'C')
				
				mp = 200;
		}
		
		// salida
		
		System.out.println("El coste del examen en el que se va a matricular es: " + mp);
		
	}

}
