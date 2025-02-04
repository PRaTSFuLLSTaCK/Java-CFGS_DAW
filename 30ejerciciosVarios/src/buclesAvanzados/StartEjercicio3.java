package buclesAvanzados;

public class StartEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int numero = (int)(Math.random()*50+1);//1-50
		int numero = 8;
		System.out.println("el numero es "+numero);
		
		System.out.print(numero+" ");
		while(numero>1) {
			
			if(numero%2==0) {
				
				// par
				numero/=2;
			}
			else {
				
				// impar
				numero*=3;
				numero++;
			}
			System.out.print(numero+" ");
		}
	}

}
