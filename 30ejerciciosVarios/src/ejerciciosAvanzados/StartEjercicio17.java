package ejerciciosAvanzados;

import java.util.Scanner;

public class StartEjercicio17 {

	public static void main(String[] args) {
		
		
		// leo un numero
		Scanner teclado = new Scanner(System.in);
				
		// el primer numero
		System.out.println("Inserta un numero (1)");
		int numero1 = teclado.nextInt();
		
		
		// el segundo numero
		System.out.println("Inserta un numero (2)");
		int numero2 = teclado.nextInt();
		
		
		// el tercer numero
		System.out.println("Inserta un numero (3)");
		int numero3 = teclado.nextInt();
				

		
		if(numero3==(numero1%numero2)) {
			
			System.out.println("el "+numero3+" es el % del "+numero1+"/"+numero2);
		}
		else if(numero3==(numero2%numero1)) {
			
			System.out.println("el "+numero3+" es el % del "+numero2+"/"+numero1);
		}
		else {
			
			System.out.println("el numero3 NO es % numero1/numero2 NI numero2/numero1");
		}
		
		
		teclado.close();
	}
}
