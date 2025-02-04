package Soluciones;

public class Patinador {

	// atributos de instancia => 0,25 ptos
	private String nombre;
	private short dorsal;
	private Puntuacion puntos;
	
	// atributos de clase => 0,25 ptos
	private static int total_patinadores = 0;
	private static float total_puntos = 0;
	private static float media_puntos = 0;
	
	// no lo pide el ejercicio
	public Patinador () {
		nombre = "Sin nombre";
		dorsal = 0;
		puntos = new Puntuacion();
		total_patinadores ++;
		total_puntos += puntos.puntuacion_total();
		media_puntos = total_puntos / (float) total_patinadores;		
	}
	
	// 0,5 ptos
	public Patinador (String nomb, short dor, float dificultad, float estilo) {
		nombre = nomb;
		dorsal = dor;
		puntos = new Puntuacion(dificultad, estilo);
		total_patinadores ++;
		total_puntos += puntos.puntuacion_total();
		media_puntos = total_puntos / (float) total_patinadores;		
	}	
	
	// get y set => 0,25 ptos
	public String get_nombre () {
		return nombre;
	}
	
	public short get_dorsal () {
		return dorsal;
	}
	
	public Puntuacion get_puntos () {
		return puntos;
	}

	public static int get_total_patinadores () {
		return total_patinadores;
	}
	
	public static float get_total_puntos () {
		return total_puntos;
	}
		
	public static float get_media_puntos () {
		return media_puntos;
	}
	
	public void set_nombre (String nomb) {
		nombre = nomb;
	}
	
	public void set_dorsal (short dor) {
		dorsal = dor;
	}
	
	public void set_puntos (float dificultad2, float estilo2) {
		puntos.set_dificultad(dificultad2);
		puntos.set_estilo(estilo2);
	}
	
	// 0,25 ptos
	public void mostrar_patinador() {
		System.out.println ("Patinador: " + get_nombre());
		System.out.println ("Dorsal: " + get_dorsal());
		System.out.println ("Puntuación dificultad: " + puntos.get_dificultad());
		System.out.println ("Puntuación estilo: " + puntos.get_estilo());
		System.out.println ("Puntuación total: " + puntos.puntuacion_total() + "\n");		
	}
	
	// 0,25 ptos
	public static void mostrar_datos_comunes() {
		System.out.println ("Total de patinadores: " + get_total_patinadores());
		System.out.println ("Total puntos de patinadores: " + get_total_puntos());
		System.out.println ("Media de puntuación: " + get_media_puntos()+ "\n");			
	}
	
	// 0,25 ptos
	public static void main (String args[]) {
		Patinador p1 = new Patinador ("Javier Fernández López", (short) 15, 8.5f, 10f);
		Patinador p2 = new Patinador ("Sonia Lafuente", (short) 33, 7.3f, 9.5f);
		Patinador p3 = new Patinador("Natalia López", (short) 21, 9.3f, 8.5f);
		
		p1.mostrar_patinador();
		p2.mostrar_patinador();
		p3.mostrar_patinador();
		mostrar_datos_comunes();
	}
		

} // fin clase Patinador
