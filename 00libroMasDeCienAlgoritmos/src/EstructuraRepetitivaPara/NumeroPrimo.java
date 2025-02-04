package EstructuraRepetitivaPara;

public class NumeroPrimo {
	
	public static void main (String [] args) {
		
		//variables
		
		int n, i;
		boolean flag;
		String r = "";
		
		n = Utilidades.teclado.leer_entero("Introduzca el numero que desea revisar: ");
		
		//proceso
		
		flag = true;
		
		i = 2;
		
		for (i = 2; i <= n/2; i++) {
			
			if (n % i == 0) {
				
				flag = false;
				break;
				
			}
			
		}
		
		if (flag) {
			
			r = "El numero es primo";
			
		} else {
			
			r = "El numero no es primo";
			
		}
		
		//salida
		
		System.out.println(r);
		
	}

}
