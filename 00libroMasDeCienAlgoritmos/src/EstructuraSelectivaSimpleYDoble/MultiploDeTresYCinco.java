package EstructuraSelectivaSimpleYDoble;

public class MultiploDeTresYCinco {
	
	public static void main (String [] args) {
		
		//variables
		
		int n;
		String r;
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca el numer que desee comprobar: ");
		
		//proceso
		
		if (n % 3 == 0 && n % 5 == 0) {
			
			r = "SI ES MULTIPLO DE 3 Y 5. ";
		
		} else {
			
			r = "NO ES MULTIPLO DE 3 Y 5. ";
			
		}
		
		//salida
		
		System.out.println(r);
		
	}

}
