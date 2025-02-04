package EstructuraSecuencial;

public class CalcularAreaDeUnCirculo {
	
	public static void main (String [] args) {
		
		//constante
		
		final float PI = 3.14159F;
		
		//variables
		
		double a, r;
		
		//entrada
		
		r = Utilidades.teclado.leer_double("Introduzca el radio del circulo: ");
		
		//Proceso
		
		a = (float) (PI * (Math.pow((double) r, 2.0)));
		
		//salida
		
		System.out.println("El area es: " + a);
		
	}

}
