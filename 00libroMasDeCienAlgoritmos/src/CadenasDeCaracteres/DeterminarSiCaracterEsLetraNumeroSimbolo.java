package CadenasDeCaracteres;

public class DeterminarSiCaracterEsLetraNumeroSimbolo {
	
	public static void main(String[] args) {
		
		//variables
		
		String c, r;
		int a;
		
		//entrada
		
		c = Utilidades.teclado.leer_cadena2("Introduzca el caracter a revisar: ");
		
		//proceso
		
		a = c.toUpperCase() .codePointAt(0);
		
		if (a >= 48 && a <= 57)
			
			r = "ES NUMERO";
		
		else if (a >= 65 && a <= 90)
			
			r = "ES LETRA";
		
		else
			
			r = "ES SIMBOLO";
		
		//salida
		
		System.out.println("El caracter introducido, " + r);
	}

}
