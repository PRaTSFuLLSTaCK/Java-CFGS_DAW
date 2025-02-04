package Soluciones;


public class Serie_PI {
	
	/* E: n => número entero positivo mayor igual que 3
	 * S: el valor de la siguiente serie: 1 − 1/3 + 1/5 − 1/7 + 1/9 − ... = π / 4 
	 * que obtiene el valor de PI/4, 
	 * 
	 * Por ejemplo si N = 5
	 * Calcula 1 − 1/3 + 1/5 − 1/7 + 1 /9	 
	 * */
	 // 3 ptos
	public static double serie (int n) {
		int num = n;		
		double serie = 0;
		double divisor = 1;
		
		// para controlar si se suma o se resta
		boolean resta = true; 
		
		// calcular n elementos de la serie
		for (int i = 1; i<= n; i++) {		
			
			if (i==1) 
				serie = 1; //primer elemento de la serie
			else {
				// divisor 3, 5, 7, 9 (se calcula sumandole 2 al anterior)
				divisor = divisor + 2; 
				if (resta)
					serie = serie - 1/divisor;
				else
					serie = serie + 1/divisor;
				// para alternar entre una resta y una suma					
				resta = !resta;
			}
		
		}	
		
		return serie;
					 
	}
	
	// 0,5 ptos
	public static void main (String args[]) {
		
		int numero;
		
		double PI_entre_4, PI;
		
		do {
			numero = teclado.leer_entero ("Introduce un número entero positivo mayor igual que 3: ");
		} while (numero < 3);
		
		PI_entre_4 = serie (numero);
		
		System.out.println ("Valor de la Serie para N = " + numero + " = " + PI_entre_4);
		
		PI = PI_entre_4 * 4;
		
		System.out.println ("Valor de la PI para N = " + numero + " = " + PI);		
		
	}
}

