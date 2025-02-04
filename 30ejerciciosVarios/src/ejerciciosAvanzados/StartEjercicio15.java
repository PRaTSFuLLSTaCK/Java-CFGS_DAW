package ejerciciosAvanzados;

import java.util.Scanner;

public class StartEjercicio15 {

	public static void main(String[] args) {

		// leo un numero
		Scanner teclado = new Scanner(System.in);
		int maximo, minimo;
		
		// el primer numero
		System.out.println("Inserta un numero (1)");
		int numero1 = teclado.nextInt();

		maximo = numero1;
		minimo = numero1;
		
		
		
		System.out.println("Inserta un numero (2)");
		int numero2 = teclado.nextInt();
		
		if(numero2>maximo) {
			
			maximo = numero2;
		}
		if(numero2<minimo) {
			
			minimo = numero2;
		}
		
		
		
		System.out.println("Inserta un numero (3)");
		int numero3 = teclado.nextInt();
		
		if(numero3>maximo) {
			
			maximo = numero3;
		}
		if(numero3<minimo) {
			
			minimo = numero3;
		}		
		
		
		
		System.out.println("Inserta un numero (4)");
		int numero4 = teclado.nextInt();
		
		if(numero4>maximo) {
			
			maximo = numero4;
		}
		if(numero4<minimo) {
			
			minimo = numero4;
		}			
		
		
		
		System.out.println("Inserta un numero (5)");
		int numero5 = teclado.nextInt();
		
		if(numero5>maximo) {
			
			maximo = numero5;
		}
		if(numero5<minimo) {
			
			minimo = numero5;
		}		
		
		
		
		System.out.println("maximo ="+maximo);
		System.out.println("minimo ="+minimo);
				
		
		teclado.close();
	}

}
