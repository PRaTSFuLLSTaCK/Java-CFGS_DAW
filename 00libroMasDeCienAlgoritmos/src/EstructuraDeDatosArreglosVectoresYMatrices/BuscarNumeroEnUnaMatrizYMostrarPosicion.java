package EstructuraDeDatosArreglosVectoresYMatrices;

public class BuscarNumeroEnUnaMatrizYMostrarPosicion {
	
public static void main (String [] args) {
		
		//variables
		
		int nb, i, j, p1 = 0, p2 = 0;
		String r = "";
		
		//matriz
		
		int n [] [] = new int [4] [3];
		
		//entrada
		
		n [0] [0]= Utilidades.teclado.leer_entero("Introduzca el primer valor: ");
		n [0] [1] = Utilidades.teclado.leer_entero("Introduzca el segundo valor: ");
		n [0] [2] = Utilidades.teclado.leer_entero("Introduzca el tercer valor: ");
		n [1] [0]= Utilidades.teclado.leer_entero("Introduzca el cuarto valor: ");
		n [1] [1] = Utilidades.teclado.leer_entero("Introduzca el quinto valor: ");
		n [1] [2] = Utilidades.teclado.leer_entero("Introduzca el sexto valor: ");
		n [2] [0]= Utilidades.teclado.leer_entero("Introduzca el septimo valor: ");
		n [2] [1] = Utilidades.teclado.leer_entero("Introduzca el octavo valor: ");
		n [2] [2] = Utilidades.teclado.leer_entero("Introduzca el novemo valor: ");
		n [3] [0]= Utilidades.teclado.leer_entero("Introduzca el decimo valor: ");
		n [3] [1] = Utilidades.teclado.leer_entero("Introduzca el decimo primer valor: ");
		n [3] [2] = Utilidades.teclado.leer_entero("Introduzca el decimo segundo valor: ");
		
		nb = Utilidades.teclado.leer_entero("Introduzca el numero a buscar: ");
		
		//proceso
		
		for ( i = 0; i < 4; i++) {
			
			for (j = 0; j < 3; j++) {
				
				if (n [i] [j] == nb) {
					
					r = "Si existe. ";
					p1 = i;
					p2 = j;
					break;
					
				}
				
			}
			
			if ( r == "Si existe. ")
				
				break;
		}
		
		if ( r == "Si existe. ") {
			
			System.out.println("El numero, " + r);
			System.out.print("la posicion es: " + p1);
			System.out.println(" " + p2);
			
		} else
			
			System.out.println("No se ha encontrado el numero seleccionado. ");
		
		
		
	}

}
