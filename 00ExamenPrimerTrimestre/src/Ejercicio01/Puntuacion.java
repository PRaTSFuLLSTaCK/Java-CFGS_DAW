package Ejercicio01;

public class Puntuacion {
	
	public float estilo=0;
	public float dificultad=0;
	
	



	public Puntuacion(float estilo, float dificultad ) {

		this.estilo = estilo;
		this.dificultad = dificultad;
		
		
		
	}


	public float getEstilo() {
		return estilo;
	}







	public void setEstilo(float estilo) {
		this.estilo = estilo;
	}







	public float getDificultad() {
		return dificultad;
	}







	public void setDificultad(float dificultad) {
		this.dificultad = dificultad;
	}


	public void puntuacion_total () {
		
		this.estilo+= estilo;
		this.dificultad+= dificultad;
		
		System.out.println("La suma de la puntuacion en estilos es:" + estilo);
		System.out.println("La suma de la puntuacion en la dificultad es:" + dificultad);
		
	}

}
