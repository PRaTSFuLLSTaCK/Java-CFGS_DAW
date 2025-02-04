package buclesAvanzados;

public class StartEjercicio4 {

	public static void main(String[] args) {

		// leer numero
		//int numero = (int)(Math.random()*20+1);//1-20
		int numero = 3;
		// bucle
		while(numero!=0) {
			
			// sacar collatz con *
			int numerin = numero;
			System.out.print("["+numerin+"] *");
			while(numerin>1) {
				
				if(numerin%2==0) {
					
					// par
					numerin/=2;
				}
				else {
					
					// impar
					numerin*=3;
					numerin++;
				}
				System.out.print("*");
			}
			System.out.println();
			// restarle 1 al numero
			numero -= 1;
		}
	}
}
