package EstructuraRepetitivaMientras;

public class NumerosAmigos {
	
	public static void main (String [] args) {
		
		//variables
		
		int i, n1, n2, s1 = 0, s2 = 0;
		
		String r = "";
		
		n1 = Utilidades.teclado.leer_entero("Introduzca el primer numero que desea revisar: ");
		n2 = Utilidades.teclado.leer_entero("Introduzca el segundo numero que desea revisar: ");
		
		//proceso
		
		i = 1;
		
		while (i <= n1 / 2) {
			
			if (n1 % i == 0) {
			
				s1 += 1;
			
			}
			
			i++;
			
		}
		
		i = 1;
		
		while (i <= n2 / 2) {
			
			if (n2 % i == 0) {
			
				s2 += 1;
			
			}
			
			i++;
			
		}
		
		if (n1 == s2 && n2 == s1) {
			
			r = "Los numeros son amigos.";
		} else {
			
			r = "Los numeros no son amigos.";
			
		}
		
		//salida
		
		System.out.println(r);
		
	}

}
