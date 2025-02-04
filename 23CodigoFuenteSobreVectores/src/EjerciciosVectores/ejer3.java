package EjerciciosVectores;

/* 2.) Realiza un programa que lea 30 notas (números reales) de los alumnos en un vector 
 * y los nombres de los alumnos (String) en otro vector de igual longitud. 
 * Posteriormente después de haber introducido la información en los dos vectores, 
 * muestra por pantalla el nombre de los alumnos y la nota que tienen. */
 
 /* 3.) Modifica el ejercicio 2 para que calcule, una vez introducida la información en los dos vectores, 
  * la nota media de los alumnos. */

public class ejer3 {

	// número de alumnos o notas
	public final static int N = 5;
	
	public static void main (String [] args) {
		
		// vector de notas
		double [] notas = new double[N];
		
		// vector de alumnos
		String [] alumnos = new String[N];
		
		// introducir la información
		// los dos vectores tienen la misma longitud
		for (int i=0; i<notas.length; i++) {
			alumnos[i] = teclado.leer_cadena ("Nombre alumno " + (i+1) + " : ");
			notas[i] = teclado.leer_double ("Nota de " + alumnos[i] + " : ");			
		}
		
		// mostrar la información		
		for (int i=0; i<notas.length; i++) 
			System.out.println (alumnos[i] + ", nota = " + notas[i]);
			
			
		// ejercicio 3
		// calcular la nota media
		
		// acumulador que almacenará la suma de todas las notas
		double suma = 0;
		
		for (int i=0; i<notas.length; i++)
			suma += notas[i]; // acumular la nota actual		
		
		// calcular media	
		double media = suma / notas.length;
		
		System.out.println ("\nLa media de las notas es: " + media);

	}
	
}
