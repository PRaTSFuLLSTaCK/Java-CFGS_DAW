package SimulacroExamenPrimerTrimestre;

public class serie {
	
	public static void main (String [] args) {
		
		int n = 0;
		
		do {
			
			n = utilidades.teclado.leer_entero("Introduzca un numero mayor que 2: ");
			
		} while (n <= 2);
		
		System.out.println("Elemento 1: 2");
		
		System.out.println("Elemento 2: 5");
		
		int anterior = 5;
		
		for (int i = 3; i <= n ; i++) {
			
			if (anterior % 2 != 0 ) {
				
				System.out.print("Elemento " + i + "= (2 * Elemento anterior" + anterior +  ") = ");
				anterior = 2 * anterior;
				System.out.println(anterior);
			
			} else {
				
				System.out.print("Elemento " + i + "= (3 + Elemento anterior" + anterior +  ") = ");
				anterior = 3 + anterior;
				System.out.println(anterior);
				
			}
					
		}
		
	}

}
