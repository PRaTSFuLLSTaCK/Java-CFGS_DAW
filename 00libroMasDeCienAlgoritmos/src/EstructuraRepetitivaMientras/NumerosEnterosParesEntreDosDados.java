package EstructuraRepetitivaMientras;

public class NumerosEnterosParesEntreDosDados {
	
public static void main (String [] args) {
		
		//variables
		
		int i, ni, nf, cp = 0;
		
		//entrada
		
		ni = Utilidades.teclado.leer_entero("Introduzca el valor inicial del rango de numeros a operar: ");
		nf = Utilidades.teclado.leer_entero("Introduzca el valor final del rango de numeros a operar: ");
		
		//proceso
		
		i = ni + 1;
		
		while (i < nf) {
			
			if (i % 2 == 0) {
			
				cp += 1;
			
			}
			
			i++;
			
		}
		
		//salida
		
		System.out.println("La cantidad de numeros naturales pares del intervalo es: " + cp);
		
	}

}
