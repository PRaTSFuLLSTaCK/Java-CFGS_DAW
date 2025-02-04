package EstructuraSelectivaMultiple;

// vamos a mostrar los dias que tiene ese año el mes que deseamos y lo mostraremos en letra

public class DecirMesYAñoYMostrarMesEnLetra {
	
	public static void main (String [] args) {
		
		//variables
		
		int m, a, d = 0;
		String ml = "";
		
		//entrada
		
		m = Utilidades.teclado.leer_entero("Introduzca el mes que desea revisar: ", 1, 12);
		
		a = Utilidades.teclado.leer_entero("Introduzca el año que desea revisar: ", 1000, 32767);
		
		// proceso
		
		switch (m) {
		
		case 1:
			
			d = 31;
			ml = "ENERO";
			break;
		
		case 2:
			
			if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0))
				
				d = 29;
			
			else 
				
				d = 28;
			
			ml = "FEBRERO";
			break;
			
		case 3:
			
			d = 30;
			ml = "MARZO";
			break;
			
		case 4:
	
			d = 31;
			ml = "ABRIL";
			break;
	
		case 5:
	
			d = 30;
			ml = "MAYO";
			break;
	
		case 6:
	
			d = 31;
			ml = "JUNIO";
			break;
	
		case 7:
	
			d = 30;
			ml = "JULIO";
			break;
	
		case 8:
	
			d = 31;
			ml = "AGOSTO";
			break;
	
		case 9:
	
			d = 30;
			ml = "SEPTIEMBRE";
			break;
			
		case 10:
			
			d = 31;
			ml = "OCTUBRE";
			break;
			
		case 11:
			
			d = 30;
			ml = "NOVIEMBRE";
			break;
			
		case 12:
			
			d = 31;
			ml = "DICIEMBRE";
			break;
			
		}
		
		//salida
		
		System.out.print("El mes seleccionado del año " + a );
		System.out.println(" Es " + ml);
		System.out.println("Y tiene " + d + " Ese año.");
	}

}
