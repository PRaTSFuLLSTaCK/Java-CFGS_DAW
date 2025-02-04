package EjerciciosTema09;

import java.util.Arrays;

public class EjercicioDos {

	public static void main(String[] args) {
		int [] otroArray = {1, 4, 9, 5, 7, 6};
		int [] miArray1 = {10, 44, 9, 35, 7, 6};
		
		System.out.println(Arrays.toString(otroArray));
		System.out.println(Arrays.toString(miArray1));
		
		System.out.println(otroArray == miArray1);
		System.out.println(Arrays.equals(otroArray, miArray1));
		
		System.arraycopy(miArray1, 0, otroArray, 0, miArray1.length);
		System.out.println(Arrays.toString(otroArray));
		System.out.println(Arrays.toString(miArray1));
		
		System.out.println(otroArray == miArray1);
		System.out.println(Arrays.equals(otroArray, miArray1));
		
		Arrays.fill(otroArray, 9);
		Arrays.fill(miArray1, 12);
		System.out.println(Arrays.toString(otroArray));
		System.out.println(Arrays.toString(miArray1));
	}

}
