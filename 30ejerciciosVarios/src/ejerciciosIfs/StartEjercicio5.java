package ejerciciosIfs;

public class StartEjercicio5 {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		
		// IN
		numero1 = 6;
		numero2 = 6;
		
		if(numero1>numero2) {
			
			System.out.println("1) Es mayor "+numero1+" que "+numero2);
		}
		else if(numero2>numero1) {
			
			System.out.println("2) Es mayor "+numero2+" que "+numero1);
		}
		else {
			
			System.out.println("Son iguales");
		}

	}

}
