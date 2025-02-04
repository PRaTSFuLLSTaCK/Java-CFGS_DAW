package EstructuraSecuencial;

public class MostrarCocienteYRestoDeDosNumerosEnteros {
	
	public static void main (String [] args) {
		
		//variables
		
		int n1, n2, c, r;
		
		n1 = -32768;
		
		n1 = Utilidades.teclado.leer_entero("Introduzca el primer valor a dividir: ", n1, 32767);
		
		n2 = Utilidades.teclado.leer_entero("Introduzca el primer valor a dividir: ", 1, n1);
		
		//proceso
		
		c = n1 / n2;
		
		r = n1 % n2;
		
		System.out.println("El cociente de la division es: " + c);
		
		System.out.println("El Resto de la division es: " + r);
	}

}
