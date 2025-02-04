package EstructuraDeDatosArreglosVectoresYMatrices;

public class OrdenadcionPorBurbuja {
	
public static void main (String [] args) {
		
		//variables
		
		int tmp, i, j, LI, LS;
		
		//vectores
		
		int n [] = new int [4];
		
		//entrada
		
		System.out.println("Valores para el vector a: ");
		
		n [0] = Utilidades.teclado.leer_entero("Introduzca el primer valor: ");
		n [1] = Utilidades.teclado.leer_entero("Introduzca el segundo valor: ");
		n [2] = Utilidades.teclado.leer_entero("Introduzca el tercer valor: ");
		n [3] = Utilidades.teclado.leer_entero("Introduzca el cuarto valor: ");
		
		//proceso
		
		LI = 0;
		LS = n.length -1;
		
		for ( i = LI; i < LS; i++) {
			
			for (j = LI; j < LS; j++) {
				
				if (n [j] > n [j + 1]) {
				
					tmp = n [j];
					n [j] = n [j + 1];
					n [j + 1] = tmp;
				
				}
			}
			
		}
		
		//salida
		
		System.out.println("El vector ordenado queda asi: ");
		
		System.out.println(n [0]);
		System.out.println(n [1]);
		System.out.println(n [2]);
		System.out.println(n [3]);
		
		
	}


}
