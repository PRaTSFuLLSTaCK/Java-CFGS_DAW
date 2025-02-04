package EstructuraRepetitivaMientras;

public class NumerosEnterosMultiplosDe5EntreDosDados {
	
	public static void main (String [] args) {
		
		//variables
		
		int i, ni, nf, c = 0;
		
		//entrada
		
		ni = Utilidades.teclado.leer_entero("Introduzca el valor inicial del rango de numeros a operar: ");
		nf = Utilidades.teclado.leer_entero("Introduzca el valor final del rango de numeros a operar: ");
		
		//proceso
		
		i = ni + 1;
		
		while (i < nf) {
			
			if (i % 5 == 0) {
			
				c += 1;
			
			}
			
			i++;
			
		}
		
		//salida
		
		System.out.println("La cantidad de numeros naturales multiplos de 5 del intervalo es: " + c);
		
	}

}
