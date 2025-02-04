package StringStringBuffer;

public class Metodos_cadenas {
	
	public static void main (String args[]) {
		
		/* char charAt(int index) Devuelve el carácter en la posición indicada por index. 
		 * El rango de index va de 0 a length() - 1. */
		
		String cad = "Tomate Verde";
		
		// Mostrar un carácter de cad con charAt()
		System.out.println ("El carácter primero de " + cad + " es : " + cad.charAt(0));
		
		/* boolean equals(Object obj) 	
		 * Compara el String con el objeto especificado. 
		 * El resultado es true si y solo si el argumento es no nulo 
		 * y es un objeto String que contiene la misma secuencia de caracteres.*/
		
		String cad2 = "tomate verde";
		
		if (cad.equals (cad2) )  // equivalente a if (cad.equals ("Tomate verde") == true) 
			System.out.println ("Las cadenas " + cad + " y " + cad2 + " son iguales ");
		else
			System.out.println ("Las cadenas " + cad + " y " + cad2 + " son distintas ");
			
		
		/* boolean equalsIgnoreCase(String s) 	
		 * Compara el String con otro, ignorando consideraciones de mayúsculas y minúsculas. 
		 * Los dos Strings se consideran iguales si tienen la misma longitud y, 
		 * los caracteres correspondientes en ambos Strings son iguales 
		 * sin tener en cuenta mayúsculas y minúsculas.*/
		 
		System.out.println ("\n Sin tener en cuenta mayúsculas y minúsculas:\n");
		
		if (cad.equalsIgnoreCase (cad2) ) 
			System.out.println ("Las cadenas " + cad + " y " + cad2 + " son iguales ");
		else
			System.out.println ("Las cadenas " + cad + " y " + cad2 + " son distintas ");
		
		/* int indexOf(char c) 	
		 * Devuelve el indice donde se produce la primera aparición de c. 
		 * Devuelve -1 si c no está en el string. 
		 *  Ten en cuenta que la primera posición es la cero => 0 */
		
		int pos = cad.indexOf ('V');
		if (pos == -1)
			System.out.println ("\nNo se encuentra el carácter V en " + cad);
		else
			System.out.println ("\nEl carácter V está  en la posición " + (pos+1) + " en " + cad);
			
		pos = cad2.indexOf ('V');
		if (pos == -1)
			System.out.println ("\nNo se encuentra el carácter V en " + cad2);
		else
			System.out.println ("\nEl carácter V está  en la posición " + (pos+1) + " en " + cad2);
			
		/* int indexOf(String s) 	
		 * Igual que el anterior pero buscando la subcadena representada por s.*/
		 
		pos = cad2.indexOf ("verde");
		if (pos == -1)
			System.out.println ("\nNo se encuentra la cadena 'verde' dentro de " + cad2);
		else
			System.out.println ("\nLa cadena 'verde' está dentro de " + cad2 + " en la posición " + (pos+1) );
			
			
		/* int length() 	Devuelve la longitud del String (número de caracteres) */
		
		System.out.println ("\nLa longitud de la cadena " + cad + " es: " + cad.length() );
		
		/* String substring(int begin, int end) 	
		 * Devuelve un substring desde el índice begin hasta el end */
		String subcadena = cad.substring (0,2);
		System.out.println ("\nLa subcadena extraida es: " + subcadena);
		
		/* static String valueOf(int i) 	
		 * Devuelve un string que es la representación del entero i. 
		 * Observese que este método es estático. 
		 * Hay métodos equivalentes donde el argumento es un float, double, etc. */
		
		String cad_numerica = String.valueOf (727);
		System.out.println ("\n La cadena numérica es: " + cad_numerica);
		
		cad_numerica = String.valueOf (727.45);
		System.out.println ("\n La cadena numérica es: " + cad_numerica);
		
		/* char[] toCharArray()
		 * String toLowerCase()
		 * String toUpperCase() 	
		 * Transforman el string en un array de caracteres, o a mayúsculas o a minúsculas. */
		 
		char [] vector_caracteres = cad.toCharArray();
		
		System.out.println ("\n El vector de caracteres es: ");
		// recorrer el vector de caracteres y mostrar sus elementos
		for (int i=0; i<vector_caracteres.length; i++)
			System.out.print (vector_caracteres[i] + " ");
			
			
		// pasar a mayúsculas
		System.out.println ("\n\n La cadena en mayúsculas es: " + cad.toUpperCase());
		
		// pasar a minúsculas
		System.out.println ("\n\n La cadena en minúsculas es: " + cad.toLowerCase());
		
	}
}

