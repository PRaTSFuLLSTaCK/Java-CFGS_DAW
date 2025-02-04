package CadenasDeCaracteres;

public class CodigoNombreCadena {
	
	public static void main(String[] args) {
		
		// variables
		
		String p,t, u, l, n= "" , c;
		
		//entrada
		
		n = Utilidades.teclado.leer_cadena2("INTRODUZCA LA CADENA DE CARACTERES PARA CODIFICAR: ");
		
		//proceso
		
		p = n.substring(0, 1);
		t = n.substring(2, 3);
		u = n.substring(n.length() - 1);
		
		l = String.valueOf(n.trim() .length());
		
		c = (p + t + u + l) .toUpperCase();
		
		//salida
		
		System.out.println("El codigo es: " + c);
		
	}

}
