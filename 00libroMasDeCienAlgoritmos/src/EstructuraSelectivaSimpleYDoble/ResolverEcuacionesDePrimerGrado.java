package EstructuraSelectivaSimpleYDoble;

public class ResolverEcuacionesDePrimerGrado {
	
	public static void main (String [] args) {
		
		//variables
		
		double a, b, x;
		
		//entrada
		
		a = Utilidades.teclado.leer_double("Introduzca el primer numero: ");
		
		b = Utilidades.teclado.leer_double("Introduzca el segundo numero: ");
		
		//proceso
		
		if (a != 0) {
			
			x = -b / a;
		} else {
			
			x = 0;
		}
		
		//salida
		
		System.out.println("El valor de x es: " + x);
		
	}

}
