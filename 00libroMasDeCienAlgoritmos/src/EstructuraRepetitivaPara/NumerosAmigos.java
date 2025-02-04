package EstructuraRepetitivaPara;

public class NumerosAmigos {
	
	public static void main (String [] args) {
		
		//variables
		
		int i, n1, n2, s1 = 0, s2 = 0;
		String r = "";
		
		//entrada
		
		n1 = Utilidades.teclado.leer_entero("Introduzca el primer numero: ");
		n2 = Utilidades.teclado.leer_entero("Introduzca el segundo numero: ");
		
		//proceso
		
		for (i = 1; i <= n1/2; i++) {
			
			if (n1 % i == 0)
				
				s1 += i;
			
		}
		
		for (i = 1; i <= n2/2; i++) {
			
			if (n2 % i == 0)
				
				s2 += i;
			
		}
		
		if (n1 == s2 && n2 == s1)
			
			r = "Los numeros son amigos";
		
		else
			
			r = "Los numeros no son amigos";
		
		//salida
		
		System.out.println(r);
		
	}

}
