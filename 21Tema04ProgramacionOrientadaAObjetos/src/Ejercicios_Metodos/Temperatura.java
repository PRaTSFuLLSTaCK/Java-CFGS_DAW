package Ejercicios_Metodos;

public class Temperatura {
	
	/* E: celsius => grados celsius
	 * S: devuelve los grados celsius transformados a Farenheit */	
	public static double celsiusToFarenheit (double celsius) {		
		double farenheit = 1.8*celsius + 32;
		return farenheit;
	}
	
	/* E: farenheit => grados farenheit
	 * S: devuelve los grados farenheit transformados a celsius */	
	public static double farenheitTocelsius (double farenheit) {		
		double celsius = (farenheit-32) / 1.8;
		return celsius;
	}	
	
	public static void main (String args[]) {
		/* 0 grados Celsius son 32 grados Farenheit
		15 grados Celsius son 59 grados Farenheit
		20 grados Celsius son 68 grados Farenheit
		Realiza las conversiones anteriores al revés*/
		
		System.out.println ("0 grados celsius son: " + celsiusToFarenheit (0) + " grados Farenheit");
		System.out.println ("15 grados celsius son: " + celsiusToFarenheit (15) + " grados Farenheit");
		System.out.println ("20 grados celsius son: " + celsiusToFarenheit (20) + " grados Farenheit");
		
		System.out.println ("32 grados Farenheit son: " + farenheitTocelsius (32) + " grados Celsius");
		System.out.println ("59 grados Farenheit son: " + farenheitTocelsius (59) + " grados Celsius");
		System.out.println ("68 grados Farenheit son: " + farenheitTocelsius (68) + " grados Celsius");		
		
	}
}
