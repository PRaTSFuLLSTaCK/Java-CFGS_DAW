package ejerciciosIfs;

public class StartEjercicio7 {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		int numero3;
		
		
		// IN
		numero1 = 8;
		numero2 = 8;
		numero3 = 8;
		
		
		if((numero1>numero2)&&(numero1>numero3)) {
			
			// numero1 es el mayor
			if(numero2>numero3) {
				
				System.out.println(numero1+">"+numero2+">"+numero3);
			}
			else if(numero3>numero2) {
				
				System.out.println(numero1+">"+numero3+">"+numero2);
			}
			else {
				
				System.out.println("Había números repetidos y no cual es mayor");
			}			
		}
		else if((numero2>numero1)&&(numero2>numero3)) {
			
			// numero2 es el mayor
			if(numero1>numero3) {
				
				System.out.println(numero2+">"+numero1+">"+numero3);
			}
			else if(numero3>numero1) {
				
				System.out.println(numero2+">"+numero3+">"+numero1);
			}
			else {
				
				System.out.println("Había números repetidos y no cual es mayor");
			}			
		}		
		else if((numero3>numero1)&&(numero3>numero2)) {
			
			// numero3 es el mayor
			if(numero1>numero2) {
				
				System.out.println(numero3+">"+numero1+">"+numero2);
			}
			else if(numero2>numero1) {
				
				System.out.println(numero3+">"+numero2+">"+numero1);
			}
			else {
				
				System.out.println("Había números repetidos y no cual es mayor");
			}			
		}
		else {
			
			System.out.println("Había números repetidos y no cual es mayor");
		}
	}
}
