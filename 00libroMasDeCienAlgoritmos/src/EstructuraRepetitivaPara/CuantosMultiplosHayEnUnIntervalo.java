package EstructuraRepetitivaPara;

public class CuantosMultiplosHayEnUnIntervalo {
	
	public static void main (String [] args) {
		
		// variables
		
		int ni, nf, nm, c = 0, i;
		
		//entrada
		
		ni = Utilidades.teclado.leer_entero("Introduzca el valor inicial del intervalo: ");
		nf = Utilidades.teclado.leer_entero("Introduzca el valor final del intervalo: ");
		nm = Utilidades.teclado.leer_entero("Introduzca el valor del que desea entonctar multipos del intervalo: ");
		
		//proceso
		
		for (i = ni; i <= nf; i++) {
			
			if (i % nm == 0) {
				
				c += 1;
				
			}
			
		}
		
		//salida
		
		System.out.println("La cantidad de multiplos del numero seleccionado en el intervalo es: " + c);
		
	}

}
