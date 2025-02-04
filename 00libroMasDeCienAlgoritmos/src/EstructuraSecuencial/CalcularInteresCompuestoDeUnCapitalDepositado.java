package EstructuraSecuencial;

public class CalcularInteresCompuestoDeUnCapitalDepositado {
	
	public static void main (String [] args) {
		
		//variables
		
		double c, r, t, i, m;
		
		//entrada
		
		c = Utilidades.teclado.leer_double("Introduzca el capital:");
		r = Utilidades.teclado.leer_double("Introduzca el Interes:");
		t = Utilidades.teclado.leer_double("Introduzca el tiempo de deposito:");
		
		//proceso
		
		m = (double) (Math.pow((double) (1 + r/100), (double) t)) * c;
		
		i = m - c;
		
		//salida
		
		System.out.println("El interes es: " + i);
		System.out.println("El total es: " + m);
		
	}

}
