package practica1.tema4;

import utilidades.teclado;

public class UsaBasket {
	
	public static void main(String[] args) {
		
		//Creamos un nuevo jugador (JugadorBasket)
		
		JugadorBasket j1 = new JugadorBasket("Rafa", "CEO", 1, 3);
		
		//Mostramos sus datos
		
		j1.datosJugador();
		
		//Al total de sus puntos, le sumamos 2 puntos mas
		
		j1.sumaPuntos(2);
		
		//Volmemos a mostrar los datos de JugadorBasket
		
		j1.datosJugador();
		
		//Creamos dos jugadores nuevos
		
		JugadorBasket j2 = new JugadorBasket();
		JugadorBasket j3 = new JugadorBasket();
		
		//Tomamos los datos de los jugadores recien creados en las siguientes lineas
		
		String nombre1 = teclado.leer_cadena2("Introduce el nombre del jugador 1: ");
		String puesto1 = teclado.leer_cadena2("Introduce el puesto del jugador 1: ");
		int dorsal1 = teclado.leer_entero_error("Introduce el dorsal del jugador 1: ", "Debe introducir un valor num�rico", 1, 50);
		int puntos1 = teclado.leer_entero_error("Introduce el n�mero de puntos del jugador 1: ", "Debe introducir un valor num�rico", 0, Integer.MAX_VALUE);
		
		String nombre2 = teclado.leer_cadena2("Introduce el nombre del jugador 2: ");
		String puesto2 = teclado.leer_cadena2("Introduce el puesto del jugador 2: ");
		int dorsal2 = teclado.leer_entero_error("Introduce el dorsal del jugador 2: ", "Debe introducir un valor num�rico", 1, 50);
		int puntos2 = teclado.leer_entero_error("Introduce el n�mero de puntos del jugador 2: ", "Debe introducir un valor num�rico", 0, Integer.MAX_VALUE);		
		
		//Se termina de solicitar los datos de los dos nuevos jugadores
		
		//Añadimos los datos del jugador 1 de 2 recien añadidos
		
		j2.setNombre(nombre1);
		j2.setPuesto(puesto1);
		j2.setdorsal(dorsal1);
		j2.setpuntos(puntos1);
		
		//Añadimos los datos del jugador 2 de 2 recien añadidos
		
		j3.setNombre(nombre2);
		j3.setPuesto(puesto2);
		j3.setdorsal(dorsal2);
		j3.setpuntos(puntos2);
		
		//Mostramos los datos de los nuevos jugadores
		
		j2.datosJugador();
		j3.datosJugador();
		
	}
	
}
