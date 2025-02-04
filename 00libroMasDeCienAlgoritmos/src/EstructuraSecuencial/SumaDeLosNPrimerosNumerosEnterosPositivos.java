package EstructuraSecuencial;

public class SumaDeLosNPrimerosNumerosEnterosPositivos {
	
	public static void main (String [] args) {
		
		//variables
		
		int n, s;
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca la cantidad de numeros que desea mostrar: ", 0, 32767);
		
		//proceso
		
		s = (n * (n + 1)) / 2;
		
		//salida
		
		System.out.println("El resultado de la suma es: " + s);
			
	}

}
