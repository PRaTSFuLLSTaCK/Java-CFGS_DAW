package EjerciciosCadenas;

/* Ejer 2: Recibe una palabra y encripta dicha palabra, en otra cadena. 
 * Esta función no devuelve nada (recibe dos cadenas de caracteres), 
 * la longitud de la cadena encriptada debe ser igual o mayor que la de la cadena a encriptar.
 * Realiza la función que desencripta la cadena encriptada anteriormente
 * */


import Utilidades.consola.teclado;


public class ejer2_encriptar {
		
	// E: original => cadena de caracteres	
	// S: devuelve la cadena original encriptada
	public static StringBuffer encriptar (String original) {
		
		// reserva de memoria para la cadena encriptada
		StringBuffer encriptada = new StringBuffer (0);
		
		// Depuración
		// System.out.println ("\nLongitud cadena*** = " + encriptada.length());
		
		char car;
		
		// recorrer la cadena de caracteres original y transformarla (encriptarla)		
		for (int i=0; i<original.length(); i++) {
			// cada caracter se encripta con 1 carácter más
			// forzado de tipo
			car = (char) (original.charAt(i) + 1);
			encriptada.append (car);
		}
		
		// Depuración
		// System.out.println ("\nCadena encriptada**** = " + encriptada);
		// System.out.println ("\nLongitud cadena*** = " + encriptada.length());
		
		return encriptada;
	} // fin encriptar
	
	
	// E: original => cadena de caracteres a encriptar
	//    encriptada => cadena de caracteres encriptada
	// S: nada, encripta la cadena original en la cadena encriptada
	// NOTA: esta función no funciona, el paso de parámetros en Java es por valor,
	//       el parámetro encriptada se cambia dentro del método => se hace una reserva con el constructor => new()
	//       pero fuera de él conserva el valor que tenía antes de llamar a este método
	//       puedes comprobarlo descomentado las líneas debajo de "Depuración"
	public static void encriptar2 (String original, StringBuffer encriptada) {
		
		// reserva de memoria para la cadena encriptada
		// como el paso de parámetros es por valor se pierde la dirección de memoria 
		// del objeto encriptada de la clase StringBuffer
		encriptada = new StringBuffer (0);
		
		// Depuración
		// System.out.println ("\nLongitud cadena*** = " + encriptada.length());
		
		char car;
		
		// recorrer la cadena de caracteres original y transformarla (encriptarla)		
		for (int i=0; i<original.length(); i++) {
			// cada caracter se encripta con 1 carácter más
			// forzado de tipo
			car = (char) (original.charAt(i) + 1);
			encriptada.append (car);
		}
		
		// Depuración
		// System.out.println ("\nCadena encriptada**** = " + encriptada);
		// System.out.println ("\nLongitud cadena*** = " + encriptada.length());	
			
	} // fin encriptar2
	
	
	// E: original => cadena de caracteres a encriptar
	//    encriptada => cadena de caracteres encriptada (se pasa cualquier cadena)
	// S: nada, encripta la cadena original en la cadena encriptada
	// NOTA: esta función SI funciona, el paso de parámetros en Java es por valor,
	//       pero el parámetro encriptada NO se cambia dentro del método => NO se hace una reserva con el constructor => new()	
	public static void encriptar3 (String original, StringBuffer encriptada) {
		
		// borrar la cadena encriptada para que esté vacía
		encriptada.delete (0, encriptada.length());
						
		// Depuración
		// System.out.println ("\nLongitud cadena*** = " + encriptada.length());
		
		char car;
		
		// recorrer la cadena de caracteres original y transformarla (encriptarla)		
		for (int i=0; i<original.length(); i++) {
			// cada caracter se encripta con 1 carácter más
			// forzado de tipo
			car = (char) (original.charAt(i) + 1);
			encriptada.append (car);
		}
		
		// Depuración
		// System.out.println ("\nCadena encriptada**** = " + encriptada);
		// System.out.println ("\nLongitud cadena*** = " + encriptada.length());	
			
	} // fin encriptar3
	
	
	// E: encriptada => cadena de caracteres encriptada	
	// S: devuelve la cadena original desencriptada
	public static StringBuffer desencriptar (StringBuffer encriptada) {
		
		// reserva de memoria para la cadena encriptada
		StringBuffer original = new StringBuffer (0);
		
		// Depuración
		// System.out.println ("\nLongitud cadena*** = " + encriptada.length());
		
		char car;
		
		// recorrer la cadena de caracteres encriptada y transformarla (desencriptarla)		
		for (int i=0; i<encriptada.length(); i++) {
			// cada caracter se desencripta con 1 carácter menos
			// forzado de tipo
			car = (char) (encriptada.charAt(i) - 1);
			original.append (car);
		}
		
		// Depuración
		// System.out.println ("\nCadena encriptada**** = " + encriptada);
		// System.out.println ("\nLongitud cadena*** = " + encriptada.length());		
		return original;
		
	} // fin desencriptar
	
	
	
	public static void main (String args[]) {
		
		// A) esto funciona
		// si queremos obtener un valor nuevo (en este caso la cadena encriptada se crea con new() dentro del método) 
		// en un método se devuelve a través de return
		StringBuffer cad_encriptada;
		String cad_original = teclado.leer_cadena2("Introduce la cadena a encriptar: ");		
		
		cad_encriptada = encriptar (cad_original);
		
		System.out.println ("\nCadena encriptada = " + cad_encriptada); 
		
		
		// B) esto no funciona
		
		cad_original = teclado.leer_cadena2("Introduce la cadena 2ª a encriptar: ");		
		
		// puedes probar con este valor
		// StringBuffer cad_encriptada2 = new StringBuffer("hola");
		StringBuffer cad_encriptada2 = null;
		
		// MAL paso de parámetros es por valor
		// (la cadena cad_encriptada2 se modifica dentro del método encriptar2 con new()
		// lo que Java conserva de un parámetro es la dirección de memoria donde está ese objeto o el valor de la variable)
		// como antes de la llamada el objeto cad_encriptada2 de la clase StringBuffer vale la dirección de memoria
		// del objeto => null 
		// fuera conserva el valor antes de la llamada en este caso null
		encriptar2 (cad_original, cad_encriptada2); 
		
		System.out.println ("\nCadena encriptada = " + cad_encriptada2); 
		
		// C) esto funciona
		// ya que la cadena encriptada no se crea con new() dentro del método,		 
		// no cambia la dirección de memoria del objeto StringBuffer
		// la cadena encriptada se ha creado antes de llamar al método
		
		cad_original = teclado.leer_cadena2("Introduce la cadena a encriptar: ");		
		
		// crear la cadena encriptada antes de llamar al método encriptar3()
		cad_encriptada2 = new StringBuffer (0);
		encriptar3 (cad_original, cad_encriptada2);
		
		System.out.println ("\nCadena encriptada = " + cad_encriptada2); 
		
		
		// desencriptar la cadena encriptada 1
		StringBuffer desencriptada = desencriptar (cad_encriptada);
		System.out.println ("\nCadena encriptada " + cad_encriptada +  " , desencriptada = " + desencriptada); 
		
		// desencriptar la cadena encriptada 2
		StringBuffer desencriptada2 = desencriptar (cad_encriptada2);
		System.out.println ("\nCadena encriptada " + cad_encriptada2 +  " , desencriptada = " + desencriptada2); 
		
	}
}

