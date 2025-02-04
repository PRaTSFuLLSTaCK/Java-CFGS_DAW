package EstructuraSelectivaMultiple;

public class DevolverFechaSiguienteALaIntroducida {
	
	
	public static void main (String [] args) {
		
		//variables
		
		int d, m, a, dmax = 0;
		
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
		
		d++;
		
		if (d > dmax) {
			
			d = 1;
			m++;
			
			if (m == 13) {
				
				m = 1;
				a++;
				
			}
			
		}
			
		//salida
		
		System.out.println("La fecha siguiente sera: ");
		System.out.println("Dia: " + d);
		System.out.println("Mes: " + m);
		System.out.println("Año: " + a);
		
		
		
	}

}
