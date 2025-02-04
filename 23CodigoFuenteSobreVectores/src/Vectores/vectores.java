package Vectores;

public class vectores {
	
	public static void main (String args[]) {
		
		// Un vector es un array de una solo dimensión
		
		// Una matriz es un array de más de una dimensión
		
		// Declaración de un vector de enteros
		// Temperatura media de cada día de la semana
		int [] temperaturas = {15, 17, 12, 11, 14, 13, 10}; // valor inicial del vector
		
		/* El tamaño del vector temperaturas es 7, 
		 * el compilador de Java lo deduce a partir del nº de elementos */
		
		// longitud del vector => propiedad length
		int longitud = temperaturas.length;
		
		// recorrer el vector de temperaturas y mostrar sus valores
		// un vector se recorre con un índice que va desde 0 hasta su longitud-1 		
		for (int i=0; i<longitud; i++)
			// 0 => Lunes, 1 => Martes, ....., 6 => Domingo
			System.out.println ("Temperatura " + i + " = " + temperaturas[i]); 
		
		
		// También se puede declarar un vector sin darle un valor inicial
		// Ejemplo, almacenar para cada día de mes el número de espectadores de una sala de cine
		// el vector nos debe valer para cualquier mes => nº elementos = 31 
		
		// creado un vector de 31 enteros
		int [] espectadores = new int[31];		
		
		// por defecto al crear un vector de enteros Java lo inicializa a cero		
		
		// longitud del vector => propiedad length
		longitud = espectadores.length;
		
		
		System.out.println ("Por defecto al crear un vector de enteros se inicializa a cero: \n");
		
		// recorrer el vector de espectadores y mostrar sus valores
		// un vector se recorre con un índice que va desde 0 hasta su longitud-1 		
		for (int i=0; i<longitud; i++)			
			System.out.println ("Nº espectadores el día de mes " + (i+1) + " = " + espectadores[i]); 
		
		
		// El número de espectadores del día 1 es 200 (el día 1 es con índice 0)
		espectadores [0] = 200;
		
		// El número de espectadores del día 31 es 170 (el día 31 es con índice 30)
		espectadores [30] = 170;
		
		// recorrer el vector de espectadores y mostrar sus valores
		// un vector se recorre con un índice que va desde 0 hasta su longitud-1 		
		for (int i=0; i<longitud; i++)			
			System.out.println ("Nº espectadores el día de mes " + (i+1) + " = " + espectadores[i]); 
		
		
		
		// Se pueden introducir todos los datos del vector desde teclado
		for (int i=0; i<longitud; i++) {
			int num = teclado.leer_entero("Introduce el nº espectadores del día de mes " + (i+1) + " : ");
			espectadores[i] = num;
			
			// se podía haber realizado así:
			// espectadores[i] = teclado.leer_entero("Introduce el nº espectadores del día de mes " + (i+1));			 
		}
		
		
		// recorrer el vector de espectadores y mostrar sus valores
		// un vector se recorre con un índice que va desde 0 hasta su longitud-1 		
		for (int i=0; i<longitud; i++)			
			System.out.println ("Nº espectadores el día de mes " + (i+1) + " = " + espectadores[i]); 
		
		
		
		// Vector de reales
		// Sueldo de 5 empleados
		double [] empleados = new double[5];
		
		// un vector de reales o númerico Java lo inicializa a cero		
		System.out.println ("Por defecto al crear un vector de reales se inicializa a cero: \n");
		for (int i=0; i<empleados.length; i++)
			System.out.println ("Sueldo " + (i+1) + " = " + empleados[i]);
			
		
		// Introducir el sueldo de los empleados
		for (int i=0; i<empleados.length; i++)
			empleados[i] = teclado.leer_double("Introduce sueldo " + (i+1) + " : "); 
		
		// Mostrar el sueldo de los empleados
		for (int i=0; i<empleados.length; i++)
			System.out.println ("Sueldo " + (i+1) + " = " + empleados[i]);
			
			
		// Vector de String
		// Nombre de los 5 empleados
		String [] nombres = new String[5];
		
		// un vector de String u objetos Java lo inicializa a null
		System.out.println ("Por defecto al crear un vector de String u objetos se inicializa a null: \n");
		for (int i=0; i<nombres.length; i++)
			System.out.println ("Nombre: " + (i+1) + " = " + nombres[i]);
			
		
		// Introducir el nombre de los empleados
		for (int i=0; i<nombres.length; i++)
			nombres[i] = teclado.leer_cadena("Introduce nombre " + (i+1) + " : "); 
		
		// Mostrar el nombre y sueldo de los empleados
		for (int i=0; i<empleados.length; i++)
			// se pueden recorrer los dos vectores a la vez porque
			// tienen el mismo número de elementos (5 en este caso)
			System.out.println ("Sueldo " + nombres[i] + " = " + empleados[i]);
		
		
		// ERROR => si accedes a un elemento fuera del vector (con un índice incorrecto)
		// Java provoca una excepción o error
		// El empleado 5 se accede con el índice 4
		
		// Descomenta la siguiente línea de código para provocar el error
		
		// System.out.println ("Sueldo " + nombres[5] + " = " + empleados[5]);		
		
	}
}

