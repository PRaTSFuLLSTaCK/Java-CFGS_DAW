package EjerciciosCadenas;

/* Ejer 2: Recibe una palabra y encripta dicha palabra, en otra cadena. 
 * Esta función no devuelve nada (recibe dos cadenas de caracteres), 
 * la longitud de la cadena encriptada debe ser igual o mayor que la de la cadena a encriptar.
 * */





public class ejer1_encriptar {
	
	// prototipo o cabecera del método
	// E: original => cadena de caracteres
	//	  encriptada => cadena a encriptar => cada caracter se encripta con 1 carácter más
	// S: nada, encripta la cadena original en la cadena encriptada
	public static void encriptar (String original, StringBuffer encriptada) {
		
		// reserva de memoria para la cadena encriptada
		StringBuffer encriptada1 = new StringBuffer (0);
		
		char car;
		
		// recorrer la cadena de caracteres original y transformarla (encriptarla)		
		for (int i=0; i<original.length(); i++) {
			// cada caracter se encripta con 1 carácter más
			car = (char) (original.charAt(i) + 1);
			encriptada1.append (car);
		}
		
	}
	
	public static void main (String args[]) {
		
	}
}

