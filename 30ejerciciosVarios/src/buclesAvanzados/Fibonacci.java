package buclesAvanzados;

public class Fibonacci {

	public static void main(String[] args) {
		
		// los dos primeros numeros de la serie
		long fibonacci1 = 0;
		long fibonacci2 = 1;
		
		// los imprimo
		System.out.print(fibonacci1+" "+fibonacci2);

		// calculo el resto de numeros
		for(int i=3;i<=10;i++) {
			
			// hago el calculo
			long fibonacci3 = fibonacci1+fibonacci2;
			System.out.print(" "+fibonacci3);
			
			// actualizo para generar el nuevo de la serie
			fibonacci1 = fibonacci2;
			fibonacci2 = fibonacci3;
		}
	}
}