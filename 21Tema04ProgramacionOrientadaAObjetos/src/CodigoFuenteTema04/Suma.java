package CodigoFuenteTema04;

public class Suma {
	
	/* método sumaEnteros
		Entrada:  a, b => enteros
		Salida: devuelve la suma de a+b */
    public static int sumaEnteros ( int a, int b ) {
	    int c = a + b;
	    return c;   // valor que devuelve el método (int)
    }

	public static void Mensaje ( ) { 
         System.out.println ("Bienvenido al sistema");
    } 

	
	public static void main (String args[]) {
		// llamada al método de clase sumaEnteros() desde esta clase
		int suma;		
		suma = sumaEnteros (2,3);
		
		// llamada al método Mensaje()
		Mensaje ();
		
		System.out.println ("El valor de la suma de 2+3 es: " + suma);	
		
	}
}

