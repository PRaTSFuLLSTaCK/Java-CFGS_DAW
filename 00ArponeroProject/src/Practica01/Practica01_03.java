package Practica01;
//importar teclado
import utilidades.teclado;

public class Practica01_03 {
// Inicializaci�n variables
	private static int acumulado = 0;
	private static int max = 100;
	private static int turno = (int)(Math.random()*2+1);
	
	public static void main(String[] args) {
// Imprimir en pantalla una presentaci�n
		System.out.println("Juego de alcanzar 100.");
		System.out.println("Creado por Alberto Cort�s y Jos� Antonio Prats.");
// Hacemos que comience jugador 1 o 2 de forma aleatoria en cada nueva partida
		while (acumulado < max ) {
			if (turno == 1) {
				turno = 2;
			}else {
				turno = 1;
			}
/* Leer un n�mero entre 1 y 9. Dar� error si es menor que 1 o
 * mayor que 9 desde la clase "teclado.java" (en leer_entero).
 */
			
			int n = teclado.leer_entero("Jugador " + turno + ", introduce un numero entre 1 y 9: ", 1, 9);
			acumulado += n;
		}
// Una vez alcanzado 100, imprimir en pantalla el jugador ganador
		System.out.println("��Ha ganado el jugador " + turno + "!!");
		
	}
}
