package StringStringBuffer;

import Utilidades.consola.teclado;

public class compara_cadena2 {
	public static void main (String args[]) {
		String cadena2 ="hola";
		String cadena = teclado.leer_cadena ("Introduce la cadena");		
		
		// comparar dos cadenas de forma correcta con equals
		if (cadena.equals("Hola que tal"))
			System.out.println ("Usando equals() Es la cadena Hola que tal");	
		else
			System.out.println ("Usando equals() No es la cadena Hola que tal");	
		
		// comparar dos cadenas de forma incorrecta con ==	
		if (cadena == "Hola que tal") // false => no son el mismo objeto
			System.out.println ("Usando == Es la cadena Hola que tal");	
		else
			System.out.println ("Usando == No es la cadena Hola que tal");
			
		// Fijate que sucede si en vez de introducir la cadena por teclado
		// le damos un valor a cadena
		
		cadena = "Hola que tal";	
		
		
		System.out.println ("Cuando le damos el valor 'Hola que tal' a cadena");
		
		// comparar dos cadenas de forma correcta con equals
		if (cadena.equals("Hola que tal"))
			System.out.println ("Usando equals() Es la cadena Hola que tal");	
		else
			System.out.println ("Usando equals() No es la cadena Hola que tal");	
		
		// comparar dos cadenas de forma incorrecta con ==	
		// (En este caso funciona) pero no se debe usar ==
		if (cadena == "Hola que tal") 
			System.out.println ("Usando == Es la cadena Hola que tal");	
		else
			System.out.println ("Usando == No es la cadena Hola que tal");				
		
	} // fin main
	
} // fin clase compara_cadena2
