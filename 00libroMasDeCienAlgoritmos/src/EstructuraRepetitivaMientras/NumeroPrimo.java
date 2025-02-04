package EstructuraRepetitivaMientras;

public class NumeroPrimo {
	
	public static void main (String [] args) {
		
		//variables
		
		int n, i;
		boolean flag;
		String r = "";
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca el numero que desea revisar: ");
		
		//progreso
		
		flag = true;	
		i = 2;
		
		while (i <= n / 2) {
			
			if (n % i == 0) {
				
				flag = false;
				break;
			}
			
			i++;
			
		}
		
		if (flag) 
			
			r = "El numero introducido es primo";
		
		else
			
			r = "El numero introducido no es primo";
		
		//salida
		
		System.out.println(r);
		
	}

}
