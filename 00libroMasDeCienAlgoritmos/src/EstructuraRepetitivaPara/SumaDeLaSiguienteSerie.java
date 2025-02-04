package EstructuraRepetitivaPara;

public class SumaDeLaSiguienteSerie {
	
	public static void main (String [] args) {
		
		//variables
		
		float n, i, s = 0;
		
		//entrada
		
		n = Utilidades.teclado.leer_caracter("Introduzca el numero que desea utilizar para la serie: ");
		
		//proceso
		
		for (i = 1; i <= n; i++) {
			
			s = s + (i / (i + 1));
			
		}
		
		//salida
		
		System.out.println("La suma es: " + s);
		
	}

}
