package EstructuraSelectivaMultiple;

public class OperarConDosNumeros {
	
	public static void main (String [] args) {
		
		//variables
		
		int n1, n2, r = 0;
		
		char op;
		
		//entrada
		
		op = Utilidades.teclado.leer_caracter("que operacion quiere realizar: ");
		
		n1 = Utilidades.teclado.leer_entero("Introduzca el primer numero: ");
		
		n2 = Utilidades.teclado.leer_entero("Introduzca el segundo numero: ");
		
		//proceso
		
		if (op == '+') {
			
			r = n1 + n2;
			
		} else if (op == '-') {
			
			r = n1 - n2;
			
		} else if (op == '*') {
			
			r = n1 * n2;
			
		} else if (op == '/') {
			
			r = n1 / n2;
			
		}
		
		//salida
		
		System.out.println("El resultado es: " + r                                                                                                                                             );
	
	}

}                                                                                            
                                                                                                                        
