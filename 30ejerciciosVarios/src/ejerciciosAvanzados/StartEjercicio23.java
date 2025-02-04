package ejerciciosAvanzados;

import java.util.Scanner;

public class StartEjercicio23 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una litros consumidos");
		int litros = teclado.nextInt();
		float precio;

		
		if(litros<=100) {
			
			precio = litros * 0.15f;
		}
		else if(litros<=500) {
			
			precio = 100*0.15f + (litros-100)*0.20f;
		}
		else if(litros<=1000) {
			
			precio = 100*0.15f + 400*0.20f + (litros-500)*0.35f;
		}
		else {
			
			precio = 100*0.15f + 400*0.20f + 500*0.35f + (litros-1000)*0.80f;
		}
		
		System.out.println("El precio por consumir "+litros+"l es "+precio+"€");
		
		

	}

}
