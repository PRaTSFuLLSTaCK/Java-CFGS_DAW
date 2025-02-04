package ejerciciosAvanzados;

import java.util.Scanner;

public class StartEjercicio12 {

	public static void main(String[] args) {
		
		// leo un numero
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Inserta un numero");
		int numero = teclado.nextInt();
		teclado.close();
		
		// hago preguntas
		switch(numero) {
			case 1: System.out.println("lunes"); break;
			case 2: System.out.println("martes"); break;
			case 3: System.out.println("miercoles"); break;
			case 4: System.out.println("jueves"); break;
			case 5: System.out.println("viernes"); break;
			case 6: System.out.println("sabado"); break;
			case 7: System.out.println("domingo"); break;
			default: System.out.println("dia de la semana incorrecto");
		}
		
	}
}
