package utilidades;

public class BusquedaArray {

	public static int busquedaLineal(int[] array, int clave) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == clave) {
				return i;
			}
		}
	return -1;
	}
	
	public static int busquedaLineal(Comparable[] array, Comparable clave) {
		for (int i = 0; i < array.length; i++) {
			if(array[i].compareTo(clave) == 0) {
				return i;
			}
		}
	return -1;
	}

	public static int busquedaBinaria(int[]array, int clave) {
		int inicio = 0;
		int fin = array.length -1;
		int mitad;
		
		while(inicio <= fin) {
			mitad = (inicio+fin) / 2;
			if(clave == array[mitad]) {
				return mitad;
			}
			if(clave < array[mitad]) {
				fin = mitad - 1;
			}else {
				inicio = mitad + 1;
			}
		}
		return -1;
	}
	
	public static int busquedaBinaria(Comparable[] array, Comparable clave) {
		int inicio = 0;
		int fin = array.length -1;
		int mitad;
		
		while(inicio <= fin) {
			mitad = (inicio+fin) / 2;
			if(clave.compareTo(array[mitad]) == 0) {
				return mitad;
			}
			if(clave.compareTo(array[mitad]) < 0) {
				fin = mitad - 1;
			}else {
				inicio = mitad + 1;
			}
		}
		return -1;
	}
	
	
	
	
}