package EstructuraDeDatosArreglosVectoresYMatrices;

public class CuantosNumerosSonPrimos {
	
public static void main (String [] args) {
		
		//variables
		
		int j, c = 0, i;
		boolean flag;
		
		//vectores
		
		int n [] = new int [5];
		
		//entrada
		
		n [0] = Utilidades.teclado.leer_entero("Introduzca el primer valor: ");
		n [1] = Utilidades.teclado.leer_entero("Introduzca el segundo valor: ");
		n [2] = Utilidades.teclado.leer_entero("Introduzca el tercer valor: ");
		n [3] = Utilidades.teclado.leer_entero("Introduzca el cuarto valor: ");
		n [4] = Utilidades.teclado.leer_entero("Introduzca el quinto valor: ");
		
		//proceso
		
		for ( i = 0; i < 5; i++) {
			
			flag = true;
			
			for (j = 0; j < n [i] / 2; j++) {
			
				if (n [i] % j == 0) {
			
					flag = false;
					break;
					
				}
			}
			
			if (flag) {
				
				c += 1;
			}
			
		}
		
		//salida
		
		System.out.println("La cantidad de numeros primos es: " + c);
		
	}

}
