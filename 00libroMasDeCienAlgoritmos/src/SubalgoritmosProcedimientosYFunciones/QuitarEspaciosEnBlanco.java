package SubalgoritmosProcedimientosYFunciones;

public class QuitarEspaciosEnBlanco {
	
	public static void main(String[] args) {
		
		//variables
		
		String f1, f2;
		
		//entrada
		
		f1 = Utilidades.teclado.leer_cadena2("Introduzca la cadena de caracteres que desee: ");
		
		//proceso
		
		f2 = FraseSinEspacios (f1);
		
		//salida
		
		System.out.println("La frase sin espacios es:" + f1);
		
	}
	
	// metodo FraseSinEspacios
	
	private static String FraseSinEspacios (String Frase) {
		
		//variables
		
		String f = "", t;
		int i, p;
		
		//proceso
		
		p = 0;
		Frase = Frase.trim();
		
		for (i = 0; i < Frase.length (); i++) {
			
			t = Frase.substring(p, i);
			f = f + t;
			
		}
		
		return f;
		
	}

}
