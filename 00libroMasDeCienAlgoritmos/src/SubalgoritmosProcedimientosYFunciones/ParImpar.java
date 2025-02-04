package SubalgoritmosProcedimientosYFunciones;

public class ParImpar {
	
public static void main(String[] args) {
		
		//variables
		
		int n;
		
		String r [] = new String [1];
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca el numero a revisar: ");
		
		//proceso
		
		 ParImpar (n, r);
		
		//salida
		
		System.out.println("El numero introducido es: " + r [0]);
	}
	
	//metodo ParImpar
	
	private static void ParImpar (int Num, String res []) {
		
		//variable
		
		String r = "";
		
		//proceso
		
		if (Num % 2 == 0 )
			
			r = "PAR";
		
		else 
			
			r = "IMPAR";
		
		//salida
		
		res [0] = r;
		
	}

}
