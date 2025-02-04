package EstructuraSelectivaSimpleYDoble;

public class VerClimaSegunTemperaturaIntroducida {
	
	public static void main (String [] args) {
		
		//variables
		
		int t;
		
		String c = "";
		
		//entrada
		
		t = Utilidades.teclado.leer_entero("Introduzca la temperatura: ");
		
		//proceso
		
		if (t < 10) {
			
			c = "FRIO";
			
		} else {
			
			if (t >= 10 && t <= 20) {
				
				c = "NUBLADO";
				
			} else {
				
				if (t >= 21 && t <= 30) {
					
					c = "CALOR";
					
				} else {
					
					c = "TROPICAL";
					
				}
				
			}
			
		}
		
		//salida
		
		System.out.println("El clima que hace es: " + c);
		
	}

}
