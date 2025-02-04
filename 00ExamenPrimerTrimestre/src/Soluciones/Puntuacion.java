package Soluciones;

public class Puntuacion {
	// 0,25 ptos
	private float dificultad; // nota entre 0 y 10
	private float estilo; // nota entre 0 y 10
	
	// no lo pide el ejercicio este constructor
	public Puntuacion (){
		dificultad = 0;
		estilo = 0;		
	}
	
	// 0,25 ptos
	public Puntuacion (float dif, float est) {
		dificultad = dif;
		estilo = est;
	}
	
	// métodos get y set =>  0,25 ptos
	public float get_dificultad () {
		return dificultad;
	}	
	
	public float get_estilo () {
		return estilo;
	}
	
	public void set_dificultad (float dif) {
		dificultad = dif;
	}
	
	public void set_estilo (float est) {
		estilo = est;
	}
	
	// 0,25 ptos
	public float puntuacion_total () {
		return dificultad + estilo;
	}
	
	
}

