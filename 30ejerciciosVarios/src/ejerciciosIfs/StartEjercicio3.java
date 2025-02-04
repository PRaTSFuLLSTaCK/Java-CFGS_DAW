package ejerciciosIfs;

public class StartEjercicio3 {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		
		// IN
		numero1 = 8;
		numero2 = 8;

		
		if(numero1%numero2==0) {
			
			System.out.println(numero1+" es multiplo "+numero2);
		}
		if(numero2%numero1==0) {
		
			System.out.println(numero2+" es multiplo "+numero1);
		}	
		
	}

}
