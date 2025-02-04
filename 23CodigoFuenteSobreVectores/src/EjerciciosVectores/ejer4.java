package EjerciciosVectores;

/* 2.) Realiza un programa que lea 30 notas (números reales) de los alumnos en un vector 
 * y los nombres de los alumnos (String) en otro vector de igual longitud. 
 * Posteriormente después de haber introducido la información en los dos vectores, 
 * muestra por pantalla el nombre de los alumnos y la nota que tienen. */
 
/* 3.) Modifica el ejercicio 2 para que calcule, una vez introducida la información en los dos vectores, 
  * la nota media de los alumnos. */
  
/*4.) Modifica el ejercicio 3 para que calcule, una vez introducida la información en los dos vectores,
 *  el alumno que más nota tiene y el que menos. */

public class ejer4 {

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
		
		
		// ejercicio 4 calcular el alumno que más nota tiene y el que menos
		
		// Primer candidato a nota máxima => nota del primer alumno
		double max = notas[0];
		// hay que guardar el índice donde está la nota máxima para saber de qué alumno es la nota máxima
		int indice_max = 0;
		
		// Primer candidato a nota mínima => nota del primer alumno
		double min = notas[0];
		// hay que guardar el índice donde está la nota mínima para saber de qué alumno es la nota mínima
		int indice_min = 0;
		
		
		// buscar el máximo y mínimo entre el resto de notas de los alumnos
		// ojo, se empieza en el segundo alumno el de índice 1
		for (int i=1; i<notas.length; i++) {
			
			// comprobar si hay un nuevo máximo
			if (notas[i] > max) {
				max = notas[i];
				indice_max = i;
			}
			
			// comprobar si hay un nuevo mínimo
			if (notas[i] < min) {
				min = notas[i];
				indice_min = i;
			}			
		}
			
			
		// mostrar al alumno que ha tenido más nota 
		// (podría haber más de uno, aquí solo se muestra a uno)
		System.out.println ("\n" + alumnos[indice_max] + " tiene la nota máxima: " + max);
		
		// mostrar al alumno que ha tenido menos nota 
		// (podría haber más de uno, aquí solo se muestra a uno)
		System.out.println ("\n" + alumnos[indice_min] +" tiene la nota mínima: " + min);
		
		
		
		

	}
	
}
