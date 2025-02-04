package EjerciciosTema09;

import java.util.Arrays;
import java.util.Random;

public class EjercicioTres {

	public static void main(String[] args) {
		double [] otroArray = new double [10];
		Random rnd = new Random();
		
		for (int i = 0; i < otroArray.length; i++) {
			otroArray[i] = rnd.nextDouble()*10;
		}
		System.out.println(Arrays.toString(otroArray));
		double [] miArray1 = {1.0, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9};
		Arrays.sort(miArray1);
		System.out.println(Arrays.toString(miArray1));
		
		System.out.println(Arrays.binarySearch(miArray1, 1.4));
	}

}
