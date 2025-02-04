package EjerciciosCadenas;

/* 1.) Palíndromo. Dos cadenas son palíndromos si se pueden leer igual de izquierda a derecha, 
 * que al revés: de derecha a izquierda, sin tener en cuenta los espacios en blancos,
 * ni acentos, ni mayúsculas o minúsculas.
 * Ejemplo: Dábale arroz a la zorra el abad */


public class ejer1_palindromo {
				
	/* E: cad => cadena de caracteres
	 * S: devuelve la cadena cad en en minúsculas, sin acentos y sin espacios en blanco 
	 *    null, si la cadena cad es todo espacios en blanco */
	public static StringBuffer prepara_cadena (String cad) {		
		
		int blancos = 0;
		char car;
		
		// averiguar cuantos espacios en blanco hay
		for (int i=0; i < cad.length(); i++) {
			car = cad.charAt(i); // guardar el caracter de la posición i de cad
			if ( car == ' ')
				// es un espacio en blanco
				blancos ++;			
		}
		
		// Depuración del programa	
		// System.out.println ("Hay " + blancos + " espacios en blanco ");
		
		// hay que evitar que la cadena sea todo espacios en blanco
		StringBuffer aux;
		if (blancos == cad.length())
			// todo blancos
			aux = null;
		else {
			// pasar la cadena a minúsculas
			cad = cad.toLowerCase();						
			
			// reservar una cadena auxiliar aux de longitud cero
			aux = new StringBuffer(0);				
			
			// Pasar la cadena a minúsculas (ñ y acentuadas) y sin acentos
			for (int i=0; i < cad.length(); i++) {
				car = cad.charAt(i); // guardar el caracter de la posición i de cad
				if (car != ' ') {
					// No es un espacio en blanco
					
					// Pasar a minúsculas las vocales acentuadas
					// se considerá solo el tipo de acento normal
					if (car == 'Á' || car == 'á')
						car = 'a';
					else if (car == 'É' || car == 'é')
						car = 'e';
					else if (car == 'Í' || car == 'í')
						car = 'i';
					else if (car == 'Ó' || car == 'ó')
						car = 'o';
					else if (car == 'Ú' || car == 'ú')
						car = 'u';	
					
					// añadir el caracter car a aux
					aux.append (car);					
				} // fin if
				
			} // fin for
		}
		
		return aux;
	}
	
	
	/* E: cad => cadena de caracteres	 *   
	 * S: true => si cad es un palíndromo 
	 *    false => si cad no es un palíndromo */
	public static boolean palindromo (String cad){
		// en aux está la cadena cad sin espacios en blanco y en minúsculas sin acentos
		StringBuffer aux = prepara_cadena (cad); 
		
		// Depuración del programa
		// System.out.println ("\n aux = " + aux);
		
		boolean espalindromo = true; // interruptor que supone que la cadena es palíndroma
		
		// recorrer la cadena de izquierda a derecha => izda
		// recorrer la cadena de derecha izquierda => dcha
		
		int izda = 0; // principio de la cadena cad
		int dcha = aux.length() - 1; // final de la cadena cad
		
		char car_izda, car_dcha; // caracteres de la izquierda y derecha
		
		// mientras que los índices izda y derecha no se cruzen o sean iguales
		// y la cadena cad sea un palindromo
		// poner espalindromo es como => espalindromo == true
		while (izda < dcha && espalindromo) {
			// almacenar caracter de la izquierda
			car_izda = aux.charAt(izda);
			// almacenar caracter de la derecha
			car_dcha= aux.charAt(dcha);
			
			// si el caracter de la izda es distinto al de la derecha
			// no es un palíndromo
			if (car_izda != car_dcha) {
				espalindromo = false;
				// Depuración del programa
				// System.out.println ("\n izda = " + izda + " dcha = " + dcha);
				// System.out.println ("\n car_izda = " + car_izda + " car_dcha = " + car_dcha);
			}
			
			izda ++; // ir al caracter siguiente de la izquierda
			dcha --; // ir al caracter siguiente de la derecha
		}
		
		// Transformar la cadena cad1 en otra en minúsculas, sin acentos y sin espacios en blanco
		return espalindromo;
	} 
	
	
	public static void main (String args[]) {
		
		// Pruebas de funcionamiento 
		
		String cad = "Almería ÁÉÍíóÓÚÑ ä Ä";
		
		cad = cad.toLowerCase();
		
		System.out.println (cad);	
		
		StringBuffer aux = new StringBuffer(0);
		
		aux.append ('a');
		aux.append ('b');
		
		System.out.println (aux);
		
		
		String cad2 = "Almería ÁÉÍíóÓÚÑ ä Ä";
		StringBuffer aux2;
		
		aux2 = prepara_cadena (cad2);
		
		System.out.println (aux2);
		
		// Prueba del programa del palíndromo
		
		String cad3 = "Dábale arroz a la zorra el abad";
		if (palindromo (cad3))
			System.out.println ("\n" + cad3 + " es palíndromo");
		else
			System.out.println ("\n" + cad3 + " no es palíndromo");
			
		
		cad3 = "Dábale arroz a la zorra gel abad";
		if (palindromo (cad3))
			System.out.println ("\n" + cad3 + " es palíndromo");
		else
			System.out.println ("\n" + cad3 + " no es palíndromo");
		
		
	}
}

