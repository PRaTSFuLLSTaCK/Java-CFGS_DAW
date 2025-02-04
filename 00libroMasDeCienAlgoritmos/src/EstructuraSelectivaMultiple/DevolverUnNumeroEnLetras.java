package EstructuraSelectivaMultiple;

public class DevolverUnNumeroEnLetras {
	
	public static void main (String [] args) {
		
		//variables
		
		int n = 0;
		
		String l = "";
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca un valor entre 0 y 9: ", 0, 9); 
		
		//proceso
		
		switch (n) {
		
		case 0:
			l = "CERO";
			break;
			
		case 1:
			l = "UNO";
			break;
			
		case 2:
			l = "DOS";
			break;
			
		case 3:
			l = "TRES";
			break;
			
		case 4:
			l = "CUATRO";
			break;
			
		case 5:
			l = "CINCO";
			break;
			
		case 6:
			l = "SEIS";
			break;
			
		case 7:
			l = "SIETE";
			break;
			
		case 8:
			l = "OCHO";
			break;
			
		case 9:
			l = "NUEVE";
			break;
		
		}
		
		//salida
		
		System.out.println("Letra" + l);
		
	}

}
