package EstructuraSelectivaSimpleYDoble;

public class VerSiUnCaracterEsVovalONo {
	
	public static void main (String [] args) {
		
		//variables
		
		char c;
		
		String r = "";
		
		//entrada
		
		c = Utilidades.teclado.leer_caracter("Introduzca el caracter que desee. ");
		
		//proceso
		
		r = "EL CARACTER NO ES VOCAL.";
		
		if (c == 'a' || c == 'A')
			
			r = "EL CARACTER ES VOCAL.";
		
		if (c == 'e' || c == 'E')
			
			r = "EL CARACTER ES VOCAL.";

		if (c == 'i' || c == 'I')
	
			r = "EL CARACTER ES VOCAL.";

		if (c == 'o' || c == 'O')
	
			r = "EL CARACTER ES VOCAL.";

		if (c == 'u' || c == 'U')
	
			r = "EL CARACTER ES VOCAL.";
		
		//salida
		
		System.out.println(r);
		
	}

}
