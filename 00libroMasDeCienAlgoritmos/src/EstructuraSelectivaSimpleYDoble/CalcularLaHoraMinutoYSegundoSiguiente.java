package EstructuraSelectivaSimpleYDoble;

public class CalcularLaHoraMinutoYSegundoSiguiente {
	
	public static void main (String [] args) {
		
		//variables
		
		int h, m, s;
		
		//entrada
		
		h = Utilidades.teclado.leer_entero("Introduzca la hora: ");
		m = Utilidades.teclado.leer_entero("Introduzca los minutos: ");
		s = Utilidades.teclado.leer_entero("Introduzca los segundos: ");
		
		s +=1;
		
		if (s == 60) {
			
			s = 0;
			m +=1;
			
			if (m == 60) {
			
				m = 0;
				h +=1;
			
				if (h == 24) {
			
					h = 0;
			
				}
			}
		}
		
		//salida
		
		System.out.println("Hora" + h);
		System.out.println("Minutos" + m);
		System.out.println("Segundos" + s);
		
	}

}
