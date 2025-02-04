package EstructuraSelectivaMultiple;

public class CalificarPuntosLanzamientoDados {
	
	public static void main (String [] args) {
		
		//variables
		
		int d1, d2, d3;
		String p = "";
		
		//entrada
		
		d1 = Utilidades.teclado.leer_entero("Intruduzca el resultado del primer dado: ", 1, 6);
		d2 = Utilidades.teclado.leer_entero("Intruduzca el resultado del segundo dado: ", 1, 6);
		d3 = Utilidades.teclado.leer_entero("Intruduzca el resultado del tercer dado: ", 1, 6);
		
		//proceso
		
		if ( d1 == 6 && d2 == 6 && d3 == 6) {
			
			p = "ORO";
			
		} else if ((d1 == 6 && d2 == 6) || (d1 == 6 && d3 == 6) || (d3 == 6 && d2 == 6)) {
			
			p= "PLATA";
			
		} else if (d1 == 6 || d2 == 6 || d3 == 6) {
			
			p = "BRONCE";
			
		} else {
			
			p = "PERDIO";
			
		}
		
		System.out.println("Premio obtenido en la tirada: " + p);
		
	}

}
