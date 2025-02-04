package EjerciciosVectoresBidimensionales;

/* 2.) Realiza un programa que defina una matriz denominada "horario" de 7 filas y 5 columnas de
String (cadenas de caracteres), que nos servirá para almacenar el horario de un grupo de alumnos
del instituto. Además hay que definir un vector denominado "dias" de 5 String que contendrá los los
valores "Lunes", "Martes", "Miércoles", "Jueves" y "Viernes" y otro vector denominado "horas" de
7 String para las horas, que contendrá los siguientes valores:
16:45 - 17:45
17:45 - 18:45
18:45 - 19:45
19:45 - 20:00
20:00 - 21:00
21:00 - 22:00
22:00 - 23:00
La matriz tendrá asignada un valor inicial de "Recreo" para la 4a fila (de 19:45 a 20:00 horas) y en
todos los días, por lo que a esa hora no se puede cambiar la matriz "horario".
El programa debe permitir introducir el horario en la matriz "horario", ayudándose de los vectores
"dias" y "horas".
Por ejemplo, debe empezar a pedir el horario del lunes, desde la primera hora hasta la última, de
esta manera:
Horario del Lunes
Lunes 16:45 - 17:45 (introduce asignatura): Asignatura_introducida1
Lunes 17:45 - 18:45 (introduce asignatura): Asignatura_introducida2
Lunes 18:45 - 19:45 (introduce asignatura): Asignatura_introducida3
Lunes 19:45 - 20:00 => recreo (se muestra el valor pero no se puede cambiar)
Lunes 20:00 - 21:00 (introduce asignatura): Asignatura_introducida4
Lunes 21:00 - 22:00 (introduce asignatura): Asignatura_introducida5
Lunes 22:00 - 23:00 (introduce asignatura): Asignatura_introducida6
Y de forma similar se deberán introducir el horario para el resto de días hasta el Viernes
El programa después de introducir el horario será capaz de mostrarlo por pantalla.
*/


public class ejer2 {
	
	// visualizar matrices de String
	// permite ver matrices con filas de longitud variable
	public static void ver_matriz (String [][] matriz) {
		
		System.out.println ("");
		// recorrer filas
		for (int f=0; f<matriz.length; f++) {
			// recorrer columnas
			for (int c=0; c<matriz[f].length; c++)
				System.out.print (matriz[f][c] + "\t"); // \t => para tabular
			
			System.out.println(""); // salto de línea para ir a la siguiente fila
			
		}
	}
	
	// visualizar horario
	public static void ver_horario (String [][] horario, String [] horas, String [] dias) {
		
		// Escribir los días => columnas
		System.out.print ("\t\t");
		for (int c=0; c<dias.length; c++)
			System.out.print (dias[c] + "\t");
					
		System.out.println (""); // salto de línea	
		
		
		// recorrer las horas => filas
		for (int f=0; f<horario.length; f++) {
			
			// escribir la hora
			System.out.print (horas[f] + "\t");
			
			// recorrer todas las horas => columnas
			for (int c=0; c<horario[f].length; c++)			
				System.out.print (horario[f][c] + "\t");
				
			System.out.println (""); // salto de línea
		}
				
	}
	
	
	
	
	
	public static void main (String args[]) {
		// definir una matriz denominada "horario" de 7 filas y 5 columnas
		String [][] horario = new String [7][5];
		
		// vector con los días de lunes a viernes
		String [] dias = {"Lunes", "Martes", "Miér.", "Jueves", "Viernes"};
		
		// vector con las horas
		String [] horas = {"16:45 - 17:45", "17:45 - 18:45", "18:45 - 19:45", 
							"19:45 - 20:00", "20:00 - 21:00", "21:00 - 22:00",	
							"22:00 - 23:00"};
		
		// La matriz tendrá asignada un valor inicial de "Recreo" para la 4ª fila 
		// (de 19:45 a 20:00 horas)
		// horario[3].length => número de columnas de la fila 4ª
		for (int col = 0; col < horario[3].length; col++)
			horario[3][col] = "Recreo";
							
		
		ver_matriz (horario);
		
		
		// introducir el horario
		
			
		// recorrer las columnas => días de la semana de lunes a viernes
		for (int c=0; c<horario[0].length; c++) 
			for (int f=0; f<horario.length; f++) 
				// ojo => si es a 4ª hora es el recreo y no se puede introducir nada
				if (f==3)
					System.out.println (dias[c] + ". " + horas[f] + ": " + horario[f][c]);
				else
					horario[f][c] = teclado.leer_cadena (dias[c] + ". " + horas[f] + " asignatura: ");			
	
		
		ver_matriz (horario);
		ver_horario (horario, horas, dias);
		
	}
}

