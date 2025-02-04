package CadenasDeCaracteres;

public class CantidadCaracteres {
	
	public static void main (String [] args) {
		
		//variables
		
		String nom;
		int can;
		
		//entrada
		
		nom = Utilidades.teclado.leer_cadena2("Introduzca su nombre");
		
		//proceso
		
		can = nom.length();
		
		//salida
		
		System.out.println("La cantidad de caracteres es: " + can);
	}

}
