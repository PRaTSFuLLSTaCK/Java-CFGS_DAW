package StringStringBuffer;

import EjerciciosCadenas.teclado;

public class cadenas {

	/* E: cad una cadena fija, cad2 cadena variable
	   S: no devuelve nada, cambia el valor de cad2 añadiendolo la cadena cad al final */
	public static void cambia (String cad, StringBuffer cad2) {	
		cad2.append (cad);
	}
	
	/* E: cad una cadena fija
	   S: no devuelve nada, intenta cambiar el valor de cad leyendo desde teclado */
	public static void cambia2 (String cad) {	
		cad = teclado.leer_cadena ("Introduce una cadena (desde cambia2): ");
		System.out.println ("El valor de la cadena (dentro de cambia2): " + cad);
	}
	
	public static void main (String args[]) {
		
		// String es una clase que puede crear objetos o cadenas fijas 
		// => no pueden cambiar su valor una vez creados
		String cadena_fija = "Hola Mundo";
		System.out.println ("La cadena fija es: " + cadena_fija);
		System.out.println ("La longitud de la cadena fija es: " + cadena_fija.length() );
		
		// parece una contradicción pero no lo es, se puede cambiar el valor de cadena_fija??
		cadena_fija = teclado.leer_cadena("Introduce una cadena: ");	
		// en realidad no se cambia, solo se cambia a donde apunta, pero no se modifica el objeto
		System.out.println ("La cadena fija es: " + cadena_fija);
		System.out.println ("La longitud de la cadena fija es: " + cadena_fija.length() );	
		
		// fijate ahora que sucede cuando se llama al método 'cambia2'
		// debería cambiar el valor de cadena_fija??
		cambia2 (cadena_fija);
		System.out.println ("La cadena fija es: " + cadena_fija);
		System.out.println ("La longitud de la cadena fija es: " + cadena_fija.length() );			
		
		
		// StringBuffer es una clase que crear objetos o cadenas variables => pueden cambiar su valor
		StringBuffer cadena_variable = new StringBuffer ("Toro");
		System.out.println ("La cadena variable es: " + cadena_variable);	
		System.out.println ("La longitud de la cadena variable es: " + cadena_variable.length() );
		
		cadena_variable.setCharAt (0, 'L'); // sustituye el primer caracter posición 0, por 'L' 
		System.out.println ("La cadena variable es: " + cadena_variable);	
		System.out.println ("La longitud de la cadena variable es: " + cadena_variable.length() );
		
		cadena_variable.append (" verde"); // añade al final de la cadena la cadena " verde"
		System.out.println ("La cadena variable es: " + cadena_variable);	
		System.out.println ("La longitud de la cadena variable es: " + cadena_variable.length() );
		
		// comparar una cadena StringBuffer
		if (cadena_variable.toString().equals("Loro verde"))
			System.out.println ("Las cadena variable es igual a 'Loro verde'");
		else
			System.out.println ("Las cadena variable NO es igual a 'Loro verde'");
		
		// comparar una cadena String	
		if (cadena_fija.equals("Hola Mundo"))
			System.out.println ("Las cadena fija es igual a 'Hola Mundo'");
		else
			System.out.println ("Las cadena fija NO es igual a 'Hola Mundo'");
			
		// El método 'cambia' si funciona con StringBuffer
		cambia (" Olivo" , cadena_variable);
		System.out.println ("La cadena variable es: " + cadena_variable);	
		System.out.println ("La longitud de la cadena variable es: " + cadena_variable.length() );	
		
		
		
		
	} // fin main

} // fin clase cadenas
