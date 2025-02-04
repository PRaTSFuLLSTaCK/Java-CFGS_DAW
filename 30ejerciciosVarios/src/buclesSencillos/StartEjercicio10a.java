package buclesSencillos;

import java.util.Scanner;

public class StartEjercicio10a {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("El numero pequeño?");
		int inferior = teclado.nextInt();
			
		System.out.println("El numero grande?");
		int superior = teclado.nextInt();
			
			
		for(int i=inferior;i<=superior;i++) {
				
			System.out.println(i);
		}

	}
}
