package EstructuraSelectivaMultiple;

public class AccesoUniversidadSegunNota {
	
	public static void main (String [] args) {
		
		//variables
		
		int p;
		String f = "";
		
		//entrada
		
		p = Utilidades.teclado.leer_entero("Introduzca su nota de acceso; ", 0, 100);
		
		//proceso
		
		if (p >= 70 && p <= 79)
			
			f = "CIENCIAS";
		
		else if (p >= 80 && p <= 89)
			
			f = "INDUSTRIAL";
		
		else if (p >= 90 && p <= 99)
			
			f = "SISTEMAS";
		
		else if (p >= 100)
			
			f = "SISTEMAS";
		
		else 
	
			f = "NINGUNA PRINGADO";
		
		
		//salida
		
		System.out.println("La facultad a la que puede acceder es: " + f);
	}

}
