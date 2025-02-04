package EstructuraRepetitivaMientras;

public class NumerosEnterosEntreDosDados {
	
	public static void main (String [] args) {
		
		//variables
		
		int i, ni, nf, c = 0;
		
		//entrada
		
		ni = Utilidades.teclado.leer_entero("Introduzca el valor inicial del rango de numeros a operar: ");
		nf = Utilidades.teclado.leer_entero("Introduzca el valor final del rango de numeros a operar: ");
		
		//proceso
		
		i = ni + 1;
		
		while (i < nf) {
			
			c += 1;
			i++;
			
		}
		
		//salida
		
		System.out.println("La cantidad de numeros naturales del intervalo es: " + c);
		
	}

}
