package EstructuraSelectivaMultiple;

public class IntroducirLetraYVerSiEsVocal {
	
	public static void main (String [] args) {
		
		//variables
		
		char l;
		
		String r = "";
		
		//entrada
		
		l = Utilidades.teclado.leer_caracter("Introduzca el caracter que desea revisar: ");
		
		//proceso
		
		if (l == 'a' || l == 'A') 
			
			r = "ES VOCAL";
		
		else if (l == 'e' || l == 'E') 
		
		r = "ES VOCAL";

		else if (l == 'i' || l == 'I') 
		
			r = "ES VOCAL";
		
		else if (l == 'o' || l == 'O') 
		
			r = "ES VOCAL";
		
		else if (l == 'u' || l == 'U') 
		
			r = "ES VOCAL";
		
		else 
			
			r = "NO ES VOCAL";
		
		//salida
		
		System.out.println("El caracter introducido, " + r);
		
	}

}
