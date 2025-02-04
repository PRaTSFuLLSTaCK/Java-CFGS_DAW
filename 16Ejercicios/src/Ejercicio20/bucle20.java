package Ejercicio20;

import utilidades.teclado;

/* 20.) Realizar un algoritmo que lea notas comprendidas entre 0 y 10 y que termine la lectura de dichas notas cuando se introduzca una nota no válida. El programa debe mostrar la nota válida más alta y la nota válida mas baja.*/

public class bucle20 {
	
	public static void main (String args[]) {
		double nota, max, min;
		
		// el compilador exige que se de un valor inicial
		// pero para el program da igual esta instrucción
		max = min = 0;
		
		// controla si hubo alguna nota válida
		boolean alguna_valida = false;
		
		nota = teclado.leer_double ("Introduce una nota válida (incorrecta para terminar): ");
		
		/* comprobar que es correcta la nota leída, 
		   para tener nuestro primer candidato a máximo y mínimo */
		if (nota >=0 && nota <= 10) {		
			max = min = nota;
			alguna_valida = true;
		}				
	
		// leer notas mientras sean correctas
		while (nota >=0 && nota <= 10) {		
			nota = teclado.leer_double ("Introduce una nota válida (incorrecta para terminar): ");
			// actualizar el máximo y mínimo en caso necesario
			if (nota > max)
				max = nota;
			if (nota < min)
				min = nota;								
		}

		// comprobar si se ha leído alguna nota correcta para ver la nota máxima y mínima
		if (alguna_valida == true) {
			System.out.println ("La nota máxima es " + max);
			System.out.println ("La nota mínima es " + min);
		}
		else
			System.out.println ("No se leyó ninguna nota válida, no hay máximo o mínimo."); 	
	} // fin main

} // fin clase bucle20