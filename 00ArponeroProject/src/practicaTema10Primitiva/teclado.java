package practicaTema10Primitiva;
// Esta es la forma indicada para leer desde consola a partir de la versi�n Java 1.5
// importar la clase Scanner
import java.util.Scanner;

public class teclado {

	public static String leer_cadena (String mensaje) {
		System.out.print (mensaje);
		String cadena = System.console().readLine();		
		return (cadena);	
	}
	
	public static int leer_entero (String mensaje, int min, int max) {
		int n = 0;
		do {
			n = leer_entero(mensaje);
			if(n < min || n > max) {
				System.out.println("Debe introducir un numero entre "+min+" y "+max);
			}else {
				return n;
			}
		} while (true);
	}
	
	public static int leer_entero (String mensaje) {
		// crea objeto entrada de la clase Scanner para obtener la entrada de la terminal de comandos
		Scanner entrada = new Scanner (System.in);		
				
		int num1 = 0;		
		
		System.out.print (mensaje);

		// nos aseguramos de controlar posibles errores en la lectura
		try {
			num1 = entrada.nextInt();
		}
		// mostramos mensaje de error en caso de lectura incorrecta (p.e leer una letra en vez de un n�) 
		catch (Exception e){
			System.err.println ("Error de lectura del n�mero. C�digo de error = " + e);
	    e.printStackTrace();
			System.exit(1);
		}			
		
 		return num1;
	} // fin leer entero
	
	public static int leer_entero_error (String mensaje, String error, int min, int max) {
		int n = 0;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.print(mensaje);
			try {
				n = entrada.nextInt();
				if(n < min || n > max) {
					System.out.println("Debe introducir un numero entre "+min+" y "+max);
				}else {
					return n;
				}
			} catch (Exception e) {
				System.out.println(error);
				entrada.nextLine();
			}
		} while (true);
	}
	
	public static String leer_cadena2 (String mensaje) {
		// ************* LEER CADENAS DE CARACTERES con nextLine de Scanner, FALLA a veces **********
		// OjO!!! puede que te falle la lectura de texto,
		// al leer muchas veces (si el buffer de entrada se llena)
		
		// crea objeto entrada de la clase Scanner para obtener la entrada de la terminal de comandos
		Scanner entrada = new Scanner (System.in);		
		
		String texto="";
		
		System.out.print (mensaje);
		// nos aseguramos de controlar posibles errores en la lectura
		try {
			texto = entrada.nextLine();
		}		
		// mostramos mensaje de error en caso de lectura incorrecta 
		catch (Exception e){
			System.err.println ("Error de lectura del n�mero. C�digo de error = " + e);
	    e.printStackTrace();
			System.exit(1);
		}			
		
		return texto;
	
	}// fin leer_cadena2
	
	/* in: recibe una cadena
		 out: devuelve un double le�do desde teclado, muestra por pantalla mensaje
		*/
	public static double leer_double (String mensaje) {			
			Scanner entrada = new Scanner (System.in);			

			// leer un real de doble precisi�n desde la consola 
			double real1=0;
			System.out.print (mensaje);	

			// nos aseguramos de controlar posibles errores en la lectura
			try {
				real1 = entrada.nextDouble(); // OjO hay que poner la coma como separador decimal
			}
			// mostramos mensaje de error en caso de lectura incorrecta (p.e leer una letra en vez de un n�) 
			catch (Exception e){
				System.err.println ("Error de lectura del n�mero. C�digo de error = " + e);
		    e.printStackTrace();
				System.exit(1);
			}	

			// devolver el real le�do desde teclado
			return real1;
	} // fin leer_double

	public static char leer_caracter(String mensaje, int i, int j){
		Scanner entrada= new Scanner (System.in);
		String texto="";
		
		System.out.print (mensaje);
		try {
			texto = entrada.nextLine();
		}
		catch (Exception e) {
			System.err.println("error de lectura. codigo de error = " +e);
			e.printStackTrace();
		}
		char caracter=texto.charAt(0);
		return caracter;
	}
	

	public static void main (String args[]) {	
	
		String cadena = leer_cadena2 ("Introduce una cadena2: ");		
		System.out.println ("La cadena leida es: " + cadena);	
	
		String palabras = leer_cadena ("Introduce una cadena: ");		
		System.out.println ("La cadena leida es: " + palabras);	
		
		int numero = leer_entero ("Introduce un n�mero: ");
		System.out.println ("El n�mero leido es: " + numero);			
			
	} // fin m�todo main
	
} // fin clase teclado
