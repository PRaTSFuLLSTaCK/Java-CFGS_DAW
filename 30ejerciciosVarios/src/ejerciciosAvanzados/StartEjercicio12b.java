package ejerciciosAvanzados;

import java.util.Scanner;

public class StartEjercicio12b {

	public static void main(String[] args) {
		
		// leo un numero
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Inserta un numero");
		int numero = teclado.nextInt();
		teclado.close();		
		
		// hago preguntas
		if(numero==1) {
			
			System.out.println("Lunes");
		}
		else if(numero==2) {
			
			System.out.println("Martes");
		}		
		else if(numero==3) {
			
			System.out.println("Miércoles");
		}		
		else if(numero==4) {
			
			System.out.println("Jueves");
		}		
		else if(numero==5) {
			
			System.out.println("Viernes");
		}		
		else if(numero==6) {
			
			System.out.println("Sábado");
		}		
		else if(numero==7) {
			
			System.out.println("Domingo");
		}	
		else {
		
			System.out.println("dia de la semana incorrecto");
		}
		
	}
}
