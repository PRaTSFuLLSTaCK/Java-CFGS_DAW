package SubalgoritmosProcedimientosYFunciones;

public class OrdenarNumeros {
	
public static void main(String[] args) {
		
		//variables
		
		int n [] = new int [4], s;
		
		//entrada
		
		n [0] = Utilidades.teclado.leer_entero("Introduzca el primer numero: ");
		n [1] = Utilidades.teclado.leer_entero("Introduzca el segundo numero: ");
		n [2] = Utilidades.teclado.leer_entero("Introduzca el tercer numero: ");
		n [3] = Utilidades.teclado.leer_entero("Introduzca el cuarto numero: ");
		
		
		
		//proceso
		
		Ordenar (n);
		
		//salida
		
		System.out.println("Los numeros ordenados son: " );
		
		System.out.println("Primer Numero: " + n [0]);
		System.out.println("Segundo Numero: " + n [1]);
		System.out.println("Tercer Numero: " + n [2]);
		System.out.println("Cuarto numero: " + n [3]);
	}
	
	//metodo Ordenar
	
	private static void Ordenar (int Num []) {
		
		//variable
		
		int tmp, j, i;
		
		int n[] = Num;
		
		//proceso
		
		for (i = 0; i < 3; i++) {
			
			for (j = 0; j < 3; j++) {
				
				if (n [j] > n [j + 1]) {
					
					tmp = n [j];
					n [j] = n [j + 1];
					n [j + 1] = tmp;
					
				}
				
			}
			
		}
		
		//salida
		
		Num = n;
		
	}


}
