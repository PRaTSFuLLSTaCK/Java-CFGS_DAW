package Ejercicio01;

public class Patinador {
	
	public String nombre;
	public int dorsal;
	
	private int total_patinadores = 0;
	private float total_puntos = 0;
	private float media_puntos = 0;
	private int puntos;
	
	public void datosJugador () {
		
		//Imprimimos los datos de los jugadores en pantalla.
			
			System.out.println("Nombre: "+ this.nombre);
			System.out.println("Puesto: "+ this.dorsal);
			
		}
	
	public Patinador (String nombre, int dorsal) {
		
		//inicializo con los argumentos las variables del constructor
		
		this.nombre = nombre;
		this.dorsal = dorsal;

		
		Patinador j1 = new Patinador("Javier Fernandez Lopez", 15);
		Puntuacion p1 = new Puntuacion((float) 8.5,10);	
		Patinador j2 = new Patinador("Sonia Lafuente", 15);
		Puntuacion p2 = new Puntuacion((float) 8.5,10);	
		Patinador j3 = new Patinador("Javier Fernandez Lopez",(int) 8.5);
		Puntuacion p3 = new Puntuacion((float) 8.5, 10);	
		
	}
	
	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getDorsal() {
		return dorsal;
	}



	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}



	public int getPuntos() {
		return getPuntos();
	}



	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}



	public static void main(String[] args) {
		
	}

}
