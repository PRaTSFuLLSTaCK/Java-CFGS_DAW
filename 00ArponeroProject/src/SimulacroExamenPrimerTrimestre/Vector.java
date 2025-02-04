package SimulacroExamenPrimerTrimestre;

public class Vector {
	
	public static void main (String [] args) {
		
		int [] a = { 5,3,6,21,4,9,8,10,7};
		int [] b = { 5,3,8,6,29,12,4,9,8,10,7};
		
		int maxA = maximo (a);
		int maxB = maximo (b);
		
		System.out.println("El maximo de a es: " + maxA);
		System.out.println("El maximo de b es: " + maxB);
		
	}
				
	public static int maximo (int [] v) {
			
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < v.length; i++) {
			
			if (v[i] > max) {
				
				max = v [i];
				
			}
		}
		
		return max;
			
	}

}
