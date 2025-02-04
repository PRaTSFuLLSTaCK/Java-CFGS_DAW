package SubalgoritmosProcedimientosYFunciones;

public class Sumar5Numeros {
	
public static void main(String[] args) {
		
		//variables
		
		int n [] = new int [5], s;
		
		//entrada
		
		n [0] = Utilidades.teclado.leer_entero("Introduzca el primer numero: ");
		n [1] = Utilidades.teclado.leer_entero("Introduzca el segundo numero: ");
		n [2] = Utilidades.teclado.leer_entero("Introduzca el tercer numero: ");
		n [3] = Utilidades.teclado.leer_entero("Introduzca el cuarto numero: ");
		n [4] = Utilidades.teclado.leer_entero("Introduzca el quinto numero: ");
		
		
		
		//proceso
		
		s = Sumar (n);
		
		//salida
		
		System.out.println("La suma de los dos numeros es: " + s);
	}
	
	//metodo sumar
	
	private static int Sumar (int Num []) {
		
		//variable
		
		int s = 0, i;
		
		//proceso
		
		for (i = 0; i < 4; i++) {
			
			s += Num [i];
			
		}
		
		//salida
		
		return s;
		
	}

}
