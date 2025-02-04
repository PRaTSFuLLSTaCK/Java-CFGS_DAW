package EstructuraSelectivaSimpleYDoble;

public class DevolverNumeroMayorDeDosIntroducidos {
	
	public static void main (String [] args) {
		
		//variables
		
		int n1, n2, m=0;
		
		//entrada
		
		n1 = Utilidades.teclado.leer_entero("Introduzca el primer numero entero: ");
		n2 = Utilidades.teclado.leer_entero("Introduzca el segundo numero entero: ");
		
		//proceso
		
		if (n1 > n2)
			
			m = n1;
		if (n1 < n2)
			
			m = n2;
			
		//salida
		
		System.out.println("El numeo mayor es: " + m);
	}

}
