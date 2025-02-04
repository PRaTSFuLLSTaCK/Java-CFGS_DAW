package EstructuraRepetitivaPara;

public class NumerosPrimosDeUnIntervaloN {
	
	public static void main (String [] args) {
		
		//variables
		
		int n, c = 0, i, j;
		boolean flag;
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca cuantos numeros va a querer revisar: ");
		
		//proceso
		
		for (i = 2; i <= n; i++) {
			
			flag = true;
			
			for (j = 2; j <= n; j++) {
				
				if (i % j == 0) {
					
					flag = false;
					break;
					
				}
				
			}
			
			if (flag) {
				
				c += 1;
				flag = true;
			
			}
			
		}
		
		//salida
		
		System.out.println("La cantidad de numeros primos es: " + c);
		
	}

}
