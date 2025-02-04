package SubalgoritmosProcedimientosYFunciones;

public class Factorial {
	
public static void main(String[] args) {
		
		//variables
		
		int n, f, i;
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca el numero a revisar: ");
		
		//proceso
		
		f = Factorial (n);
		
		//salida
		
		System.out.println("El factorial del numero introducido es: " + f);
	}
	
	//metodo Factorial
	
	private static int Factorial (int Num) {
		
		//variable
		
		int i, f = 1;
		
		//proceso
		
		for (i = 1; i <= Num; i++) {
			
			f = f * i;
			
		}
		
		//salida
		
		return f;
		
	}

}
