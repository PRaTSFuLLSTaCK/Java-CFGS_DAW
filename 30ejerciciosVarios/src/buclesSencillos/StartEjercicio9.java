package buclesSencillos;

import java.util.Scanner;

public class StartEjercicio9 {

	public static void main(String[] args) {

		int cuantosMultiplos = 0;

		// recorro desde el 4 hasta el 100 
		// pq hasta el 4 no son multiplos
		for(int numero=4;numero<=100;numero++) {
		
			// si es multiplo de 2 o de 3, lo cuento
			if((numero%2==0)|(numero%3==0)) {
				
				cuantosMultiplos++;
			}
		}
		
		System.out.println("Había "+cuantosMultiplos+ " multiplos");
	}
}
