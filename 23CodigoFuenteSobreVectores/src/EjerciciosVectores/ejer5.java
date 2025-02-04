package EjerciciosVectores;

/* 2.) Realiza un programa que lea 30 notas (números reales) de los alumnos en un vector 
 * y los nombres de los alumnos (String) en otro vector de igual longitud. 
 * Posteriormente después de haber introducido la información en los dos vectores, 
 * muestra por pantalla el nombre de los alumnos y la nota que tienen. */
 
/* 3.) Modifica el ejercicio 2 para que calcule, una vez introducida la información en los dos vectores, 
  * la nota media de los alumnos. */
  
/* 4.) Modifica el ejercicio 3 para que calcule, una vez introducida la información en los dos vectores,
 *  el alumno que más nota tiene y el que menos. */
 
 /* 5.) Ejercicio de dificultad alta: Modifica el ejercicio 4 para que en caso 
  * de que la nota máxima o mínima la compartan varios alumnos, 
  * muestre el nombre de esos alumnos, por ejemplo: Pepe, Maria y Luis 
  * tienen al nota máxima un 10, y Esteban y Juan tienen la nota mínima un 3.5
  * 
  * Pista: debes usar un vector para almacenar las posiciones de las notas máximas 
  * y otro para el de las posiciones de las notas mínimas.
  * 
  * También sería conveniente guardar en dos contadores el total de máximos 
  * y el total de mínimos. De esta forma sabremos que elementos del vector 
  * de posiciones de las notas máximas y mínimas son válidos. */  

public class ejer5 {

	// número de alumnos o notas
	public final static int N = 7;
		
	
	public static void main (String [] args) {
		
		// ************** EJERCICIO 2 *********
		
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
			
			
		// ************** EJERCICIO 3 *********
		// calcular la nota media
		
		// acumulador que almacenará la suma de todas las notas
		double suma = 0;
		
		for (int i=0; i<notas.length; i++)
			suma += notas[i]; // acumular la nota actual		
		
		// calcular media	
		double media = suma / notas.length;
		
		System.out.println ("\nLa media de las notas es: " + media);
		
		
		// ************** EJERCICIO 4 *********
		// calcular el alumno que más nota tiene y el que menos
		
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
		

		// ************** EJERCICIO 5 ********* 
		// => guardar todos los máximos y mínimos en dos vectores

		// vector de posiciones de máximos
		// como mucho todos son máximos => longitud = N
		int [] pos_max = new int [N];

		// vector de posiciones de mínimos
		// como mucho todos son mínimos => longitud = N
		int [] pos_min = new int [N];

		// el primer candidato a máximo y mínimo es el elemento 1º => indice 0
		int total_max = 1; // contador de máximos
		indice_max = 0; // posición (no valor) del último máximo
		int total_min = 1; // contador de mínimos
		indice_min = 0; // posición (no valor) del último mínimo
		
		// se guardan las posiciones del máximo y el mínimo
		pos_max [0] = pos_min [0] = 0;

		// buscar el máximo y mínimo entre el resto de notas de los alumnos
		// ojo, se empieza en el segundo alumno el de índice 1
		for (int i=1; i<notas.length; i++) {			
			
			// comprobar si hay un nuevo máximo que SUPERA al anterior
			if (notas[i] > notas[indice_max]) {				
				indice_max = i; // posición del último máximo
				total_max = 1; // hay un nuevo máximo => máximos = 1
				pos_max [0] = i; // hay un nuevo máximo (posición 0), sobreescribimos el anterior				
			}
			else 
				// comprobar si hay un máximo que IGUALA al anterior
				if (notas[i] == notas[indice_max]) {
					indice_max = i; // posición del último máximo
					total_max ++; // hay un máximo más
					pos_max [total_max-1] = i; // hay otro máximo repetido					
				}
				
			// comprobar si hay un nuevo mínimo que SUPERA al anterior
			if (notas[i] < notas[indice_min]) {				
				indice_min = i; // posición del último mínimo
				total_min = 1; // hay un nuevo mínimo => mínimos = 1
				pos_min [0] = i; // hay un nuevo mínimo (posición), sobreescribimos el anterior
			}
			else
				// comprobar si hay un mínimo que IGUALA al anterior
				if (notas[i] == notas[indice_min]) {
					indice_min = i; // posición del último mínimo
					total_min ++; // hay un mínimo más
					pos_min [total_min-1] = i; // hay otro mínimo repetido
				}			
					
		} // fin for
		
		// mostrar los máximos por pantalla
		for (int i=0; i < total_max; i++) {
			System.out.println ("Máximo " + i + " = " + notas[pos_max[i]] + " " + alumnos[pos_max[i]]);
		}
		
		// mostrar los mínimos por pantalla
		for (int i=0; i < total_min; i++) {
			System.out.println ("Mínimo " + i + " = " + notas[pos_min[i]] + " " + alumnos[pos_min[i]]);
		}		
		

	}
	
}
