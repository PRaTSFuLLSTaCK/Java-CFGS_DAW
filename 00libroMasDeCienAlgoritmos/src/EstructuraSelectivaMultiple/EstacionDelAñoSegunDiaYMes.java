package EstructuraSelectivaMultiple;

public class EstacionDelAñoSegunDiaYMes {
	
	public static void main (String [] args) {
		
		//variables
		
		int d, m;
		
		String e = "";
		
		//entrada 
		
		d = Utilidades.teclado.leer_entero("Introduzca el dia: ", 1, 31);
		m = Utilidades.teclado.leer_entero("Introduzca el mes: ", 1, 12);
		
		//proceso
		
		switch (m) {
		
		case 1:
		case 2:
		case 3:
			e = "VERANO";
			
			if (m == 3 && d > 20) 
				
				e = "OTOÑO";
			
			break;
			
		case 4:
		case 5:
		case 6:
			e = "OTOÑO";
			
			if (m == 6 && d > 21) 
				
				e = "INVIERNO";
			
			break;
			
		case 7:
		case 8:
		case 9:
			e = "INVIERNO";
			
			if (m == 9 && d > 22) 
				
				e = "PRIMAVERA";
			
			break;
			
		case 10:
		case 11:
		case 12:
			e = "PRIMAVERA";
			
			if (m == 12 && d > 20) 
				
				e = "VERANO";
			
			break;
		
		}
		
		//salida
		
		System.out.println("La estacion es: " + e);
		
	}

}
