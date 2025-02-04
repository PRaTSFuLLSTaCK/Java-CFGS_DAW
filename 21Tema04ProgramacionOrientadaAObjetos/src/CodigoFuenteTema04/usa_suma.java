package CodigoFuenteTema04;

public class usa_suma {
	
	public static void main (String args[]) {
		
		// llamada al método de clase sumaEnteros desde una clase
		// distinta a la que se creo el método
		int suma;		
		
		// para llamar al método hay que anteponer el nombre de la clase donde se creo		
		suma = Suma.sumaEnteros (2,3);
		
		System.out.println ("El valor de la suma de 2+3 es: " + suma);	
		
	}
	
}
