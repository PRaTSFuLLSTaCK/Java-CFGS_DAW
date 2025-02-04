package buclesSencillos;

import java.util.Scanner;

public class StartEjercicio6b {

	public static void main(String[] args) {

		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("¿Cuántos números quieres leer?");
		int veces = teclado.nextInt();
		
		
		int positivos = 0, negativos = 0;
		
		int i=1;
		while(i<=veces) {
			
			System.out.println("Escribe un numero");
			int numero = teclado.nextInt();
			
			if(numero>0) {
				// sumar un positivo
				positivos++;
			}
			else if(numero<0) {
				// contar que es negativo
				negativos++;
			}
			i++;
		}

		
		System.out.println("Había positivos = "+positivos);
		System.out.println("Había negativos = "+negativos);
	
	}
}
