package SubalgoritmosProcedimientosYFunciones;

public class DigitosDeUnNumero {
	
public static void main(String[] args) {
		
		//variables
		
		int n, c = 0;
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca el numero a revisar: ");
		
		//proceso
		
		c = CantidadDigitos (n);
		
		//salida
		
		System.out.println("El numero introducido tiene: " + c + " digitos.");
	}
	
	//metodo CantidadDigitos
	
	private static int CantidadDigitos (int Num) {
		
		//variable
		
		int c = 0;
		
		//proceso
		
		while (Num > 0) {
			
			Num = Num / 10;
			
			c += 1;	
			
		}
		
		//salida
		
		return c;
		
	}

}
