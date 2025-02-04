package EstructuraRepetitivaMientras;

public class CocienteYRestoDeRestasSucesivas {
	
	public static void main (String [] args) {
		
		//variables
		
		int n, d, c = 0, r;
		
		// entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca el numerador: ");
		d = Utilidades.teclado.leer_entero("Introduzca el denominador: ");
		
		//proceso
		
		while (n >= d) {
			
			n -= d;
			c++;
			
		}
		
		r = n;
		
		//salida
		
		System.out.println("El numero de divisiones que se han podido realizar es: " + c);
		System.out.println("El resto que ha quedado tras realiar esas divisiones es: " + r);
		
	}

}
