package utilidades;

public class Ordenacion {

	public static void burbuja(int[] a) {
		int aux;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if(a[j] > a[j+1]) {
					aux = a[j];
					a[j] = a[j+1];
					a[j+1] = aux;
				}
			}
		}
	}

	public static void burbujaMejorada(int[] a) {
		int aux;
		boolean cambio = true;
		for (int i = 0; cambio && i < a.length - 1; i++) {
			cambio = false;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if(a[j] > a[j+1]) {
					aux = a[j];
					a[j] = a[j+1];
					a[j+1] = aux;
					cambio = true;
				}
			}
		}
	}

	public static void insercion(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int aux = a[i];
			int j;
			for (j = i-1; j>=0 && aux < a[j]; j--) {
				a[j+1] = a[j];
			}
			a[j+1] = aux;
		}
	}

	public static void seleccion(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int valorMinimo = a[i];
			int posicionMinimo = i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j] < valorMinimo) {
					valorMinimo = a[j];
					posicionMinimo = j;
				}
			}
			a[posicionMinimo] = a[i];
			a[i] = valorMinimo;
		}
	}

	public static void burbuja(Comparable[] a) {
		Comparable aux;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if(a[j].compareTo(a[j+1]) > 0) {
					aux = a[j];
					a[j] = a[j+1];
					a[j+1] = aux;
				}
			}
		}
	}

	public static void burbujaMejorada(Comparable[] a) {
		Comparable aux;
		boolean cambio = true;
		for (int i = 0; cambio && i < a.length - 1; i++) {
			cambio = false;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if(a[j].compareTo(a[j+1]) > 0) {
					aux = a[j];
					a[j] = a[j+1];
					a[j+1] = aux;
					cambio = true;
				}
			}
		}
	}

	public static void insercion(Comparable[] a) {
		for (int i = 1; i < a.length; i++) {
			Comparable aux = a[i];
			int j;
			for (j = i-1; j>=0 && aux.compareTo(a[j]) < 0; j--) {
				a[j+1] = a[j];
			}
			a[j+1] = aux;
		}
	}

	public static void seleccion(Comparable[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			Comparable valorMinimo = a[i];
			int posicionMinimo = i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j].compareTo(valorMinimo) < 0) {
					valorMinimo = a[j];
					posicionMinimo = j;
				}
			}
			a[posicionMinimo] = a[i];
			a[i] = valorMinimo;
		}
	}
}
