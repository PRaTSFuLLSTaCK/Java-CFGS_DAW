package EstructuraRepetitivaPara;

public class CantidadDeNumerosDelIntervaloPositivosYNegativos {
	
	public static void main (String [] args) {
		
		//variables
		
		int ni, nf, cp = 0, cn = 0, i;
		
		//entrada
		
		ni = Utilidades.teclado.leer_entero("Introduzca el valor inicial del intervalo: ");
		nf = Utilidades.teclado.leer_entero("Introduzca el valor final del intervalo: ");
		
		//proceso
		
		for (i = ni; i <= nf; i++) {
			
			if (i != 0) {
				
				if (i < 0) 
					
					cn += 1;
					
				 else
					
					cp += 1;
				
			}
			
		}
		
		//salida
		
		System.out.println("La cantidad de numeros negativos del intervalo es: " + cn);
		System.out.println("La cantidad de numeros positivos del intervalo es: " + cp);
		
	}

}
