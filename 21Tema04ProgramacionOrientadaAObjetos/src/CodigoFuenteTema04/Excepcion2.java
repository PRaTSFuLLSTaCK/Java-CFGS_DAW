package CodigoFuenteTema04;

//importar la clase Scanner para la lectura
import java.util.Scanner;

public class Excepcion2 {
	
	public static void main (String args[]) {
		
		// ejemplo de excepción => realizar una lectura incorrecta de un número
		boolean error_lectura = false;
		
		int numero = 0;
		
		do {
			// crea objeto entrada de la clase Scanner para obtener la entrada de la terminal de comandos
			Scanner entrada = new Scanner (System.in);	
			
			
			System.out.print ("Introduce un número entero: ");
			// nos aseguramos de controlar posibles errores en la lectura
			try {
				// leer un entero desde la consola
				numero = entrada.nextInt();
				error_lectura = false;		
			}		
			catch (Exception e){
				/* mostramos mensaje de error en caso de lectura incorrecta 
				 * (p.e leer una letra en vez de un número), o leer un número real en vez de entero */
				System.err.println ("Error de lectura del número. Código de error = " + e);
				e.printStackTrace();
				System.out.println ("Debes volver a introducir el número");
				error_lectura = true;
				// System.exit (1); // salida incondicional del programa
			}		
		} while (error_lectura == true);
		// Si no se ha producido un error muestra el número leído
		System.out.println ("Número leido = " + numero);				
		
		
	} // fin main
	
} // fin clase Excepcion



