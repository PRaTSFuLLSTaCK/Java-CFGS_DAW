package buclesSencillos;

public class StartEjercicio8 {
	
	/**
	 * Ejercicio 8 
	 */
	public static void main(String[] args) {
		
		// cuanto numeros he conseguido encontrar primos
		int cuantosPrimosLlevo = 0;
		
		// el numero en el que empiezo
		int numero = 2;
		
		while (cuantosPrimosLlevo<1000) {
			
			boolean esPrimo = true;
			int divisor = 2;
			
			// miro dividores mientras que no sea primo
			while(esPrimo==true) {
				
				// si encuentro un divisor, levanto la bandera
				if(numero%divisor==0) {
					
					esPrimo=false;
				}
				// el caso contrario avanzo el dividor
				else divisor++;
			}
			
			if(numero==divisor) {
				
				System.out.println(numero);
				cuantosPrimosLlevo++;
			}
			numero++;
		}
		
		
		
		
		
		
		
		
		
		
	}
}
