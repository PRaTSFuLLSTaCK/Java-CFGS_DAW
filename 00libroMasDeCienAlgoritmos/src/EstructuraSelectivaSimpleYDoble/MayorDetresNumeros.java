package EstructuraSelectivaSimpleYDoble;

public class MayorDetresNumeros {
	
	public static void main (String [] args) {
		
		//variables
		
		int n1, n2, n3, m;
		
		//entradas
		
		n1 = Utilidades.teclado.leer_entero("Introduzca el primer numero a comparar: ");
		n2 = Utilidades.teclado.leer_entero("Introduzca el segundo numero a comparar: ");
		n3 = Utilidades.teclado.leer_entero("Introduzca el tercer numero a comparar: ");
		
		//proceso
		
		if (n1 > n2) {
			
			if (n1 > n3) {
				
				m = n1;
						
			} else {
				
				if (n2 > n3) {
					
					m = n2;
					
				} else {
					
					m = n3;
				}
			}
			
			//salida
			
			System.out.println("El numero mayor de los tres es: " + m);
		}
		
	}

}
