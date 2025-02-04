package EstructuraSelectivaMultiple;

public class FechaCorrecta {
	
	public static void main (String [] args) {
		
		//variables
		
		int d, m, a, dmax = 0;
		String r = "";
		
		//entrada
		
		d = Utilidades.teclado.leer_entero("Introduzca el dia: ");
		m = Utilidades.teclado.leer_entero("Introduzca el mes: ");
		a = Utilidades.teclado.leer_entero("Introduzca el año: ");
		
		//proceso
		
		switch (m) {
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			
			dmax = 31;
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			
			dmax = 30;
			break;
			
		case 2:
			
			if (a % 4 == 0 && (!(a % 100 == 0) || a % 400 == 0)) {
				
				dmax = 29;
				
			} else {
				
				dmax = 28;
				
			}
		
		}
		
		if ((d > 0 && d <= dmax) && (m > 0 && m < 13) && a > 0) {
			
			r = "FECHA CORRECTA";
			
		} else {
			
			r = "FECHA INCORRECTA";
			
		}
			
		//salida
		
		System.out.println(r);
		
	}
	

}
