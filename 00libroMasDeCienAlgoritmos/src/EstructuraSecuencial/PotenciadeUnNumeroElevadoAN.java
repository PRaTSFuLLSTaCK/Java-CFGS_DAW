package EstructuraSecuencial;

public class PotenciadeUnNumeroElevadoAN {
	
	public static void main (String [] args) {
		
		//variables
		
		int a, n, p;
		
		//entrada
		
		a = Utilidades.teclado.leer_entero("Introduzca la base de la potencia: ", 0, 32767);
		
		n = Utilidades.teclado.leer_entero("Introduzca el exponente de la potencia: ", 0, 32767);
		
		p = (int)Math.pow(a, n);
		
		//salida
		
		System.out.println("El resultado es: " + p);
		
	}

}
