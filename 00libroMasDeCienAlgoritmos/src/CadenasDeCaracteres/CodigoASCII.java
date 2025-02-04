package CadenasDeCaracteres;

public class CodigoASCII {
	
	public static void main(String[] args) {
		
		//variables
		
		String c;
		int a;
		
		//entrada
		
		c = Utilidades.teclado.leer_cadena2("Introduzca un caracter: ");
		
		//proceso
		
		a = c.codePointAt(0);
		
		//salida
		
		System.out.println("El codigo ASCII de ese caracter es: " + a);
		
	}

}
