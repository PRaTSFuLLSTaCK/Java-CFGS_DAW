package SubalgoritmosProcedimientosYFunciones;

public class NumeroMayor {
	
public static void main(String[] args) {
		
		//variables
		
		int n1, n2, m = 0;
		
		//entrada
		
		n1 = Utilidades.teclado.leer_entero("Introduzca el primer numero: ");
		
		n2 = Utilidades.teclado.leer_entero("Introduzca el segundo numero: ");
		
		//proceso
		
		m = Mayor (n1, n2);
		
		//salida
		
		System.out.println("El numero mayor es: " + m);
	}
	
	//metodo Mayor
	
	private static int Mayor (int Num1, int Num2) {
		
		//variable
		
		int m = 0;
		
		//proceso
		
		if (Num1 > Num2)
			
			m = Num1;
		
		if (Num2 > Num1)
			
			m = Num2;
		
		//salida
		
		return m;
		
	}

}
