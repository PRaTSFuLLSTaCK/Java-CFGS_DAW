package EstructuraRepetitivaMientras;

public class NumeroCuboPerfecto {
	
	public static void main (String [] args) {
		
		//variables
		
		int t, d, s = 0, n;
		String r = "";
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca el numero que desea revisar: ");
		
		//proceso
		
		t = n;
		
		while (t > 0) {
			
			d = t % 10;
			t /= 10;
			s = (int)(s + Math.pow((double) d, 3.0));
			
		}
		
		if (n == s) 
			
			r = "Es cubo perfecto.";
		
		else
			
			r = "N0 es cubo perfecto.";
		
		System.out.println(r);
		
	}

}
