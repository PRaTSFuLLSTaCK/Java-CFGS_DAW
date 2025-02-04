package EstructuraDeDatosArreglosVectoresYMatrices;

public class NumeroBuscado {
	
public static void main (String [] args) {
		
		//variables
		
		int nb, p, i;
		String r = "";
		
		//vectores
		
		int n [] = new int [7];
		
		//entrada
		
		n [0] = Utilidades.teclado.leer_entero("Introduzca el primer valor: ");
		n [1] = Utilidades.teclado.leer_entero("Introduzca el segundo valor: ");
		n [2] = Utilidades.teclado.leer_entero("Introduzca el tercer valor: ");
		n [3] = Utilidades.teclado.leer_entero("Introduzca el cuarto valor: ");
		n [4] = Utilidades.teclado.leer_entero("Introduzca el quinto valor: ");
		n [5] = Utilidades.teclado.leer_entero("Introduzca el sexto valor: ");
		n [6] = Utilidades.teclado.leer_entero("Introduzca el septimo valor: ");
		
		nb = Utilidades.teclado.leer_entero("Introduzca el numero a buscar: ");
		
		//proceso
		
		r = "No Existe";
		p = -1;
		
		for ( i = 0; i < n.length; i++) {
			
			if (n [i] == nb) {
				
				r = "Existe";
				p = i;
				break;
				
			}
			
		}
		
		//salida
		
		System.out.println("El numero buscado, " + r);
		System.out.println("Esta en la posicion: " + p);
		
	}

}
