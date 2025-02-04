package EjerciciosTema09;

import java.util.Arrays;

public class EjercicioUno {
	public static void main(String[] args) {
		int [] otroArray = {1, 4, 9, 5, 7, 6};
		int [] miArray1 = {1, 4, 9, 5, 7, 6};
		
		System.out.println(Arrays.toString(otroArray));
		System.out.println(Arrays.toString(miArray1));
		
		System.out.println(otroArray == miArray1);
		System.out.println(Arrays.equals(otroArray, miArray1));
		otroArray = miArray1;
		System.out.println();
		System.out.println(otroArray == miArray1);
		System.out.println(Arrays.equals(otroArray, miArray1));
	}
}
