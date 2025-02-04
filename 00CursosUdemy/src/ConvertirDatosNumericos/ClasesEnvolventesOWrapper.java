package ConvertirDatosNumericos;

/*
 * Proveen funciones para realizar conversiones de cadena a numero y viceversa.
 * Por cada tipo primitivo existe su equivalente en clase envolvente, es nombrada
 * igual que su dato primitivo pero sunombre empieza con mayuscula (ya que es una clase
 * y por lo tanto la primera letra se escribe en mayuscula).
 * 
 * Primitivo        -        Wrapper
 * 
 * boolean          -        Boolean
 * byte             -        Byte
 * char             -        Character
 * double           -        Double
 * float            -        Float
 * int              -        Integer
 * long             -        Long
 * short            -        Short
 * String           -        String
 * 
 * Ejemplo:
 * 
 * int numero = Integer.parseInt("10"); pasamos de cadena a entero
 * 
 * string cadena = Integer.toString (10); pasamos de entero a cadena
 * 
 * 
 */

public class ClasesEnvolventesOWrapper {
	
	public static void main (String [] args) {
		
		int numero = Integer.parseInt ("10"); //pasamos de una cadena de caracteres en este caso 10 a un entero numerico 10
		
		System.out.println(numero * 3);
		
		String cadena = Integer.toString (10);//pasamos un numero en este caso 10 a cadena de caracteres "10"
		
		System.out.println(cadena + " valor");
		
		
		
		
	}

}
