package EstructuraSelectivaSimpleYDoble;

public class DevolverDobleSiImparDevolverTripeSiPar {
	
	public static void main (String [] args) {
		
		//variables
		
		int n, r;
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca el numero a comprobar: ");
		
		//proceso
		
		if (! (n % 2 == 0)) {
			
			r = n * 2;
			
		} else {
			
			r = n * 3;
			
		}
		
		//salida
		
		System.out.println("El resultado es: " + r);
		
	}

}
