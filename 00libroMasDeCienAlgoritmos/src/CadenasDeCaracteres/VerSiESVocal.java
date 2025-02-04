package CadenasDeCaracteres;

import java.util.Scanner;

public class VerSiESVocal {
	
	public static void main(String[] args) {
		
		String l, r;
		
		//entrada
		
		l = Utilidades.teclado.leer_cadena2("Introduzca el caracter a revisar: ");
		
		//proceso
		
		l = l.toUpperCase();
		
		if (l.equals ("A"))
			
			r = "ES VOCAL";
		
		else if (l.equals ("E"))
			
			r = "ES VOCAL";
		
		else if (l.equals ("I"))
			
			r = "ES VOCAL";
		
		else if (l.equals ("O"))
			
			r = "ES VOCAL";
		
		else if (l.equals ("U"))
			
			r = "ES VOCAL";
		
		else
			
			r = "NO ES VOCAL";
		
		//salida
		
		System.out.println("El caracter, " + r);
		
	}

}
