package ejerciciosAvanzados;

public class StartEjercicio14 {

	public static void main(String[] args) {
		
		
		char letra = 'ú';
		
		switch(letra) {
			
			case 97: 
			case 101: 
			case 105: 
			case 111: 
			case 117: 
			case 65: 
			case 69: 
			case 73: 
			case 79: 
			case 85: 
			case 225: 
			case 233: 
			case 237: 
			case 243: 
			case 250: System.out.println("es vocal"); break;
			default: System.out.println("no es vocal");
		}
	}
}
