package EstructuraRepetitivaMientras;

public class NumeroInverso {
	
	public static void main (String [] args) {
		
		//variables
		
		int d, n, i = 0;
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca el numero con el que desea operar: ");
		
		//proceso
		
		while (n > 0) {
			
			d = n % 10;
			n = n / 10 ;
			i = i * 10 + d;
			
		}
		
		//salida
		
		System.out.println("El numero inverso es: " + i);
		
	}

}
