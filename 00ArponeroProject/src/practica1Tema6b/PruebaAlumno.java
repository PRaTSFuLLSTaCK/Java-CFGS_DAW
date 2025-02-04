package practica1Tema6b;

import java.util.Comparator;

public class PruebaAlumno {

	public static void main(String[] args) {
//		crea los objetos y el vector de objetos necesarios para poder 
//		probar todos y cada uno de los m�todos de la clase Alumno,  
//		ejecuta el m�todo de ordenaci�n para que ordene de todas las 
//		formas posibles, haz uso de los m�todos get y set para cambiar 
//		los valores de los atributos y muestra por pantalla el vector de objetos
		Alumno[] array = {
			new Alumno(525, "Maria", 5),
			new Alumno(40, "Luis", 10),
			new Alumno(7005, "Pedro", 7),
			new Alumno(89, "Juani", 4),
			new Alumno(100, "Carlos", 9)
		};
		
		System.out.println("ARRAY DE ALUMNO NO ORDENADO");
		mostrar(array);
		System.out.println("===========================");
		System.out.println("ARRAY ORDENADO ASC POR MATRICULA");
		quickSortInicial(array, 1, 1);
		mostrar(array);
		System.out.println("===========================");
		System.out.println("ARRAY ORDENADO DSC POR MATRICULA");
		quickSortInicial(array, 2, 1);
		mostrar(array);
		System.out.println("===========================");
		System.out.println("ARRAY ORDENADO ASC POR NOMBRE");
		quickSortInicial(array, 1, 2);
		mostrar(array);
		System.out.println("===========================");
		System.out.println("ARRAY ORDENADO DSC POR NOMBRE");
		quickSortInicial(array, 2, 2);
		mostrar(array);
		System.out.println("===========================");
		System.out.println("ARRAY ORDENADO ASC POR NOTA");
		quickSortInicial(array, 1, 3);
		mostrar(array);
		System.out.println("===========================");
		System.out.println("ARRAY ORDENADO DSC POR NOTA");
		quickSortInicial(array, 2, 3);
		mostrar(array);
		System.out.println("===========================");

	}
	
	public static void mostrar(Alumno[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void quickSort(Alumno[] a, int asc, int atributo) {
		MultiComparator comp = new MultiComparator(asc, atributo);
		quickSort(a, comp);
	}
	
	public static void quickSort(Alumno[] a) {
		quickSort(a, null);
	}
	
	public static void quickSort(Alumno[] a, Comparator<Alumno> comp) {
		if(a == null) return;
		quickSort(a, 0, a.length-1, comp);
	}
	
	private static void quickSort(Alumno[] a, int inicio, int fin, Comparator<Alumno> comp) {
		if (inicio < fin) {
			int i = inicio, j = fin;
			Alumno pivote = a[(i + j) / 2];

			do {
				while (comp == null ? a[i].compareTo(pivote) < 0 : comp.compare(a[i], pivote) < 0)
					i++;
				while (comp == null ? pivote.compareTo(a[j]) < 0 : comp.compare(pivote, a[j]) < 0)
					j--;

				if (i <= j) {
					Alumno tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
					i++;
					j--;
				}

			} while (i <= j);

			quickSort(a, inicio, j, comp);
			quickSort(a, i, fin, comp);
		}
	}
	
	public static void quickSortInicial(Alumno[] a, int asc, int atributo) {
		quickSortInicial(a, 0, a.length-1, asc, atributo);
	}
	
	private static void quickSortInicial(Alumno[] a, int inicio, int fin, int asc, int atributo) {
		if (inicio < fin) {
			int i = inicio, j = fin;
			Alumno pivote = a[(i + j) / 2];

			do {
				if(atributo == 1) {//Matricula
					if(asc == 1) {//ASC
						while(a[i].compareTo(pivote) < 0) i++;
						while(pivote.compareTo(a[j]) < 0) j--;
					}else {//DESC
						while(a[i].compareTo(pivote) > 0) i++;
						while(pivote.compareTo(a[j]) > 0) j--;
					}
				}else if(atributo == 2) {//Nombre
					if(asc == 1) {//ASC
						while(a[i].getNombre().compareTo(pivote.getNombre()) < 0) i++;
						while(pivote.getNombre().compareTo(a[j].getNombre()) < 0) j--;
					}else {//DESC
						while(a[i].getNombre().compareTo(pivote.getNombre()) > 0) i++;
						while(pivote.getNombre().compareTo(a[j].getNombre()) > 0) j--;
					}
				}else {//Nota
					if(asc == 1) {//ASC
						while(Integer.compare(a[i].getNota(), pivote.getNota()) < 0) i++;
						while(Integer.compare(pivote.getNota(), a[j].getNota()) < 0) j--;
					}else {//DESC
						while(Integer.compare(a[i].getNota(), pivote.getNota()) > 0) i++;
						while(Integer.compare(pivote.getNota(), a[j].getNota()) > 0) j--;
					}
				}

				if (i <= j) {
					Alumno tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
					i++;
					j--;
				}

			} while (i <= j);

			quickSortInicial(a, inicio, j, asc, atributo);
			quickSortInicial(a, i, fin, asc, atributo);
		}
	}

}
