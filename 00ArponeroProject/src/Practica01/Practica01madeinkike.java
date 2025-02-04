package Practica01;

import utilidades.teclado;

public class Practica01madeinkike {

	private static int acumulado = 0;
	private static int max = 100;
	private static int turno = (int)(Math.random()*2+1);
	
	public static void main(String[] args) {
		cabecera();
		nucleo();
		resultado();
	}
	private static void resultado() {
		System.out.println("��Ha ganado el jugador " + turno + "!!");
	}
	private static void cabecera() {
		System.out.println("Juego de alcanzar 100.");
		System.out.println("Creado por Alberto Cort�s y Jos� Antonio Prats.");
	}
	private static void nucleo() {
		while (acumulado < max ) {
			cambiarTurno();
			int n = teclado.leer_entero("Jugador " + turno + ", introduce un numero entre 1 y 9: ", 1, 9);
			acumulado += n;
		}
	}
	private static void cambiarTurno() {
		if (turno == 1) {
			turno = 2;
		}else {
			turno = 1;
		}
	}
}
