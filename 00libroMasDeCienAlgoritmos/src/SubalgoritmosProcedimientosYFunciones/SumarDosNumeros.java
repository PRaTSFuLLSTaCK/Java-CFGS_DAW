package SubalgoritmosProcedimientosYFunciones;

public class SumarDosNumeros {
	
	//principal
	
	public static void main(String[] args) {
		
		//variables
		
		int n1, n2, s;
		
		//entrada
		
		n1 = Utilidades.teclado.leer_entero("Introduzca el primer numero: ");
		
		n2 = Utilidades.teclado.leer_entero("Introduzca el segundo numero: ");
		
		//proceso
		
		s = Sumar (n1, n2);
		
		//salida
		
		System.out.println("La suma de los dos numeros es: " + s);
	}
	
	//metodo sumar
	
	private static int Sumar (int Num1, int Num2) {
		
		//variable
		
		int s;
		
		//proceso
		
		s = Num1 + Num2;
		
		//salida
		
		return s;
		
	}

}
