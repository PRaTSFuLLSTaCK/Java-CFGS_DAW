package EstructuraSelectivaMultiple;

public class DevolverEstacionDelAño {
	
	public static void main (String [] args) {
		
		//variables
		
		int n = 0;
		String e = "";
		
		//entradas
		
		n = Utilidades.teclado.leer_entero("Introduzca un numero entre 1 y 4", 1, 4);
		
		//proceso
		
		switch (n) {
		
		case 1:
			
			e = "VERANO";
			break;
			
		case 2:
			
			e = "INVIERNO";
			break;
			
		case 3:
	
			e = "OTOÑO";
			break;
	
		case 4:
	
			e = "PRIMAVERA";
			break;
		
		}
		
		//salida
		
		System.out.println("Estacion: " + e);
		
	}

}
