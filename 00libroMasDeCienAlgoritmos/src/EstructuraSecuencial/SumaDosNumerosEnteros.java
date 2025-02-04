package EstructuraSecuencial;

public class SumaDosNumerosEnteros {
	
	public static void main (String [] args) {
		
		//variables
		
		int n1, n2, s;
		
		
		n1 = Utilidades.teclado.leer_entero("Introduzca el primer numero de la suma: ");
		
		n2 = Utilidades.teclado.leer_entero("Introduzca el Segundo numero de la suma: ");
		
		//Proceso de suma
		
		s = n1 + n2;
		
		System.out.println("La suma de los numeros es: " + s);
		
	}

}
