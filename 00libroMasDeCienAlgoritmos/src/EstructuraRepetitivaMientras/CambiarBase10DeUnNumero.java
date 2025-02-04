package EstructuraRepetitivaMientras;

public class CambiarBase10DeUnNumero {
	
	public static void main (String [] args) {
		
		//variable
		
		int b, n, d, i, r;
		i = 0;
		r=0;
		
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca el numero en base 10 para revisar: ");
		b = Utilidades.teclado.leer_entero("Introduzca la base que desea a la que desea cambiar el numero: ");
		
		//proceso
		
		
		while (n > 0) {
			
			d = n % b;
			n /= b;
			
			i = i * 10 + d;
			
		}
		
		while (i > 0) {
			
			d = i % 10;
			i /= 10;
			
			r = r * 10 + d;
			
		}
		
		//salida
		
		System.out.println("El resultado es: " + r);
		
	}

}
