package CadenasDeCaracteres;

public class VerNPrimerosCaracteresDeUnaCadena {
	
	public static void main(String[] args) {
		
		String n, r;
		int c;
		
		n = Utilidades.teclado.leer_cadena2("Introduzca la cadena de caracteres: ");
		c = Utilidades.teclado.leer_entero("Introduzca el numero de caracteres a mostrar de la cadena: ");
		
		//proceso
		
		r = n.substring(0, c);
		
		//salida
		
		System.out.println("Los caracteres son: " + r);
		
	}

}
