package CadenasDeCaracteres;

public class CuantasVecesSeRepiteUnCaracter {
	
	public static void main(String[] args) {
		
		//variables
		
		String f, l;
		int c = 0, i;
		
		// entrada
		
		f = Utilidades.teclado.leer_cadena2("Introduzca la frase: ");
		l = Utilidades.teclado.leer_cadena2("Introduzca la letra a buscar: ");
		
		for (i = 0; i < f.length (); i++) {
			
			if (f.toUpperCase() .substring(i, i + 1) .equals(l.toUpperCase()))

				c++;
			
		}
		
		//salida
		
		System.out.println("La cantidad de veces que se repite el caracter es: " + c);
		
	}

}
