package EstructuraRepetitivaPara;

public class MultiplosDe5 {
	
	public static void main (String [] args) {
		
		//variables
		
		int i, n, c = 0;
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca cuantos numeros desea revisar: ");
		
		//proceso
		
		for (i = 1; i <= n; i++) {
			
			c +=1;
			
		}
		
		//salida
		
		System.out.println("Tenemos "+ c + " multiplos de 5.");
		
	}

}
