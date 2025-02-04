package buclesSencillos;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class StartEjercicio7 {
	
	/**
	 * Ejercicio 7 
	 */
	public static void main(String[] args) {
		
		int numero = (int)(Math.random()*10000+2);
		System.out.println("el numero es "+numero);

		boolean esPrimo = true;
		int divisor = 2;
		
		// miro dividores mientras que no sea primo
		while(esPrimo==true) {
			
			// si encuentro un divisor, levanto la bandera
			if(numero%divisor==0) {
				
				esPrimo=false;
			}
			// el caso contrario avanzo el dividor
			else divisor++;
		}
		
		System.out.print("He encontrado que al numero "
							+numero+" lo divide el numero "+divisor);
		if(numero==divisor) {
			
			System.out.println(" y por tanto es PRIMO");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}