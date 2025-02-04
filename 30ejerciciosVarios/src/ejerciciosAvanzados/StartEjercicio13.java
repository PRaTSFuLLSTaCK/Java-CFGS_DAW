package ejerciciosAvanzados;

import java.util.Scanner;

public class StartEjercicio13 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		// leo el reloj
		System.out.println("Inserta las horas");
		int horas = teclado.nextInt();
		
		System.out.println("Inserta las minutos");
		int minutos = teclado.nextInt();
		
		System.out.println("Inserta las segundos");
		int segundos = teclado.nextInt();
		
		teclado.close();
		System.out.println(horas+":"+minutos+":"+segundos);
		
		
		// avanzo los segundos
		segundos++;
		
		
		if(segundos==60) {
			
			segundos = 0;
			minutos++;
			
			if (minutos==60) {
				
				minutos = 0;
				horas++;
			
				if(horas==24) {
					
					horas = 0;
				}
			}		
		}


		
		System.out.println("Un segundo despues son las...");
		System.out.println(horas+":"+minutos+":"+segundos);
				
	}

}
