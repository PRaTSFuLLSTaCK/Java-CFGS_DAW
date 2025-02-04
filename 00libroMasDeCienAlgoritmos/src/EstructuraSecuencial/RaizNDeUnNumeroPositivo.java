package EstructuraSecuencial;

public class RaizNDeUnNumeroPositivo {

	public static void main (String [] args) {

		//variables

		int a, n;
		double r;

		//entrada

		a = Utilidades.teclado.leer_entero("Introduzca el numero con el que desea operar: ", 0, 32767);

		n = Utilidades.teclado.leer_entero("Introduzca el exponente de la operacion: ", 0, 32767);

		r = (double)Math.pow(a, (1/(int) n));

		//salida

		System.out.println("El resultado es: " + r);

	}

}
