package CodigoFuenteTema04;

public class Excepcion {
	
	public static void main (String args[]) {
		
		// ejemplo de excepción => realizar una división entre cero		
		
		
		// Puedes probar con num2 = a otro valores distintos de cero
		int num1 = 7, num2 = 0, division=1;
		
		// Se captura la excepción, para evitar un posible error
		try {
			division = num1 / num2; // oJo se va a dividir por cero
		}
		catch (ArithmeticException e) {
			// en este momento se ha producido un error con una expresión aritmética			
			
			/* System.err => muestra el mensaje en la salida de error estándar 
			 * => la pantalla normalmente */
			System.err.println ("Error en una expresión aritmética: " + e.getMessage() );
			return; // acaba el programa aquí
		}		
		
		// Si no se ha producido un error muestra el resultado de la división
		System.out.println ("Resultado = " + division);				
		
		
	} // fin main
	
} // fin clase Excepcion


