package EstructuraRepetitivaMientras;

public class NumeroCapicua {
	
	public static void main (String [] args) {
		
		//variables
		
		int  n, i = 0, d, t;
		String r = "";
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca el numero a revisar: ");
		
		//proceso
		
		t = n;
		
		while (t > 0) {
			
			d = t % 10;
			t = t / 10;
			i = i * 10 + d;
			
		}
		
		if (n == i)
			
			r = "El numero introducido es capicua";
		
		else
			
			r = "El numero introducido no es capicua";
		
		//salida
		
		System.out.println(r);
		
	}

}
