package EstructuraSecuencial;

public class ConvertirSegundosAHorasMinutosSegundos {
	
	public static void main (String [] args) {
		
		//constantes
		
		final int HORA = 3600;
		final int MINUTO = 60;
		
		//variable
		
		int t, h, m, s;
		
		t = Utilidades.teclado.leer_entero("Introduzca los segundos que desea transformar: ", 0, 32767);
		
		//proceso
		
		h = t / HORA;
		t = t % HORA;
		m = t / MINUTO;
		s = t % MINUTO;
		
		//salida
		
		System.out.println("El tiempo es: ");
		
		System.out.println("Horas: " + h);
		System.out.println("Minutos: " + m);
		System.out.println("Segundos: " + s);
		
	}

}
