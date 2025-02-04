package EstructuraRepetitivaMientras;

public class NumeroYSuBase {
	
	public static void main (String [] args) {
		
		//Un numero pertenece a una base si sus digitos son menores a su base
		
		//variables
		
		int n, b, d;
		boolean flag;
		String r = "";
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca el numero que desea revisar: ");
		b = Utilidades.teclado.leer_entero("Introduzca la base para revisar: ");
		
		//proceso
		
		flag = true;
		
		while (n > 0) {
			
			d = n % 10;
			n /= 10;
			if (d >= b) {
				
				flag = false;
				break;
				
			}
			
		}
		
		if (flag) 
			
			r = "Base correcta.";
		
		else
			
			r = "Base incorrecta.";
		
		//salida
		
		System.out.println(r);
		
	}

}
