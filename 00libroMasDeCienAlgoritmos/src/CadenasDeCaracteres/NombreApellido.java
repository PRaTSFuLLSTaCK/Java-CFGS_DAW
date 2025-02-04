package CadenasDeCaracteres;

public class NombreApellido {

	public static void main(String[] args) {
		
		//variables
		
		String nom, ape, nomape;
		
		//entrada
		
		nom = Utilidades.teclado.leer_cadena2("Introduzca el nombre: ");
		ape = Utilidades.teclado.leer_cadena2("Introduzca el apellido: ");
		
		//proceso
		
		nomape = (nom + ", " + ape).toUpperCase();
		
		//salida
		
		System.out.println("Nombre y Apellido: " + nomape);
	}

}
