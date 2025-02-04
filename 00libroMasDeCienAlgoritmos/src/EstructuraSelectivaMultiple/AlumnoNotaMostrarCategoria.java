package EstructuraSelectivaMultiple;

public class AlumnoNotaMostrarCategoria {
	
	public static void main (String [] args) {
		
		//variables
		
		int n;
		String c = "";
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca la nota media del alumno: ", 0, 20);
		
		//proceso
		
		if (n >= 0 && n <= 5) {
			
			c = "PESIMO";
		
		} else if (n >= 6 && n <= 10) {
			
			
			c = "MALO";
		
		} else if (n >= 11 && n <= 14) {
			
			
			c = "REGULAR";
			
		} else if (n >= 15 && n <= 17) {
			
			
			c = "BUENO";
			
		} else if (n >= 18 && n <= 20) {
			
			
			c = "EXCELENTE";
			
		}
		
		//salida
		
		System.out.println("El alumno es: " + c);
		
	}

}
