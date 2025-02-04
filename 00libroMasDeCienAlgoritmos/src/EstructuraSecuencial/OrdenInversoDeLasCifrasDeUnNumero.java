package EstructuraSecuencial;

public class OrdenInversoDeLasCifrasDeUnNumero {
	
	public static void main (String [] args) {
		
		//variables
		
		int n, ni, r;
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca el numero: ");
		
		//proceso
		
		r = n % 10;
		n = n / 10;
		ni = r * 10;
		
		r = n % 10;
		n = n / 10;
		ni = (ni + r) * 10;
		
		r = n % 10;
		n = n / 10;
		ni = (ni + r) * 10;
		
		r = n % 10;
		n = n / 10;
		ni = (ni + r) * 10;
		
		ni = ni + n;
		
		//salida
		
		System.out.println("El numero inverso es: " + ni);
		
	}

}
