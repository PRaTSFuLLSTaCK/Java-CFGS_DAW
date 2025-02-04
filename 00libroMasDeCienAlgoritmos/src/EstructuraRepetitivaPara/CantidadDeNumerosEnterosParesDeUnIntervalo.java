package EstructuraRepetitivaPara;

public class CantidadDeNumerosEnterosParesDeUnIntervalo {
	
public static void main (String [] args) {
		
		//variables
		
		int i, ni, nf, c = 0;
		
		//entrada
		
		ni = Utilidades.teclado.leer_entero("Introduzca el valor inicial del intervalo: ");
		nf = Utilidades.teclado.leer_entero("Introduzca el valor final del intervalo: ");
		
		//proceso
		
		ni = ni + 1;
		nf = nf - 1;
		
		for (i = ni; i <= nf; i++) {
			
			if (i % 2 == 0) {
			
				c += 1;
			
			}
				
		}
		
		System.out.println("La cantidad de numeros que tiene el intervalo es: " + c);
		
	}

}
