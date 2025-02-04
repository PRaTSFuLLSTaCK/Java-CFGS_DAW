package EstructuraSelectivaMultiple;

public class EstacionDelAñoSegunMes {
	
	public static void main (String [] args) {
		
		//Variables
		
		int m = 0;
		String e = "";
		
		//entrada
		
		m = Utilidades.teclado.leer_entero("Introduzca el numero de mes: ", 1, 12);
		
		//proceso
		
		switch (m) {
		
		case 1:
		case 2:
		case 3:
			e = "VERANO";
			break;
		
		case 4:
		case 5:
		case 6:
			e = "OTOÑO";
			break;
			
		case 7:
		case 8:
		case 9:
			e = "INVIERNO";
			break;
			
		case 10:
		case 11:
		case 12:
			e = "PRIMAVERA";
			break;
		
		}
		
		//salida
		
		System.out.println("La estacion es: " + e);
		
	}

}
