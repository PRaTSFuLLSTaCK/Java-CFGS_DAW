package practica1Tema6a;

import java.util.Comparator;

public class PruebaAlumno {

	public static void main(String[] args) {
//		crea los objetos y el vector de objetos necesarios para poder 
//		probar todos y cada uno de los m�todos de la clase Alumno,  
//		ejecuta el m�todo de ordenaci�n para que ordene de todas las 
//		formas posibles, haz uso de los m�todos get y set para cambiar 
//		los valores de los atributos y muestra por pantalla el vector de objetos
		
		//creamos el objeto array de clase alumno 
		
		Alumno[] array = {
			new Alumno(525, "Maria", 5),
			new Alumno(40, "Luis", 10),
			new Alumno(7005, "Pedro", 7),
			new Alumno(89, "Juani", 4),
			new Alumno(100, "Carlos", 9)
		};
		
		//a continuacion mostramos los datos sin ordenar y ordenados por orden ascendente
		//descendente por cada uno de los atributos del objeto.
		
		System.out.println("ARRAY DE ALUMNO NO ORDENADO");
		
		mostrar(array);//mostramos el array sin ordenaro
		
		System.out.println("===========================");
		System.out.println("ARRAY ORDENADO ASC POR MATRICULA");
		
		quickSort(array, 1, 1);//ordenamos el array de forma ascendente por el primer atributo, en este caso matricula
		mostrar(array);//mostramos el array ordenado 
		
		System.out.println("===========================");
		System.out.println("ARRAY ORDENADO DSC POR MATRICULA");
		
		quickSort(array, 2, 1);//ordenamos el array de forma descendente por el primer atributo, en este caso matricula
		mostrar(array);//mostramos el array ordenado
		
		System.out.println("===========================");
		System.out.println("ARRAY ORDENADO ASC POR NOMBRE");
		
		quickSort(array, 1, 2);//ordenamos el array de forma ascendente por el segundo atributo, en este caso nombre
		mostrar(array);//mostramos el array ordenado
		
		System.out.println("===========================");
		System.out.println("ARRAY ORDENADO DSC POR NOMBRE");
		
		quickSort(array, 2, 2);//ordenamos el array de forma descendente por el segundo atributo, en este caso nombre
		mostrar(array);//mostramos el array ordenado
		
		System.out.println("===========================");
		System.out.println("ARRAY ORDENADO ASC POR NOTA");
		
		quickSort(array, 1, 3);//ordenamos el array de forma ascendente por el tercer atributo, en este caso nota
		mostrar(array);//mostramos el array ordenado
		
		System.out.println("===========================");
		System.out.println("ARRAY ORDENADO DSC POR NOTA");
		
		quickSort(array, 2, 3);//ordenamos el array de forma descendente por el tercer atributo, en este caso nota
		mostrar(array);//mostramos el array ordenado
		
		System.out.println("===========================");

	}
	
	//metodo por el que mostramos los valores del objeto por consola
	
	public static void mostrar(Alumno[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
			
		}
	}
	
	//fin del metodo mostrar
	
	//comenzamos con la sobrecarga metodos de ordenacion quickSort
	
	//hacemos una llamada al multicomparator para que nos genere el objeto y que nos ordene por el atributo que deseamos
	
	public static void quickSort(Alumno[] a, int asc, int atributo) {
		MultiComparator comp = new MultiComparator(asc, atributo);
		quickSort(a, comp);
	}
	
	//llamamos al metodo que esta justo debajo
	
	public static void quickSort(Alumno[] a) {
		quickSort(a, null);
	}
	
	//pasamos un array y un comparador 
	
	public static void quickSort(Alumno[] a, Comparator<Alumno> comp) {
		if(a == null) return;//si es nulo no hace nada
		quickSort(a, 0, a.length-1, comp);//si no lo es llamamos al metodo recursivo
	} 
	
	//metodo recursivo, que recibe un array 
	
	private static void quickSort(Alumno[] a, int inicio, int fin, Comparator<Alumno> comp) {
		if (inicio < fin) {
			int i = inicio, j = fin;
			Alumno pivot = a[(i + j) / 2];

			do {
				while (comp == null ? a[i].compareTo(pivot) < 0 : comp.compare(a[i], pivot) < 0)
					i++;
				while (comp == null ? pivot.compareTo(a[j]) < 0 : comp.compare(pivot, a[j]) < 0)
					j--;

				if (i <= j) {
					Alumno tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
					i++;
					j--;
				}

			} while (i <= j);
			
			//llamadas a si mismo para ordenar por partes.

			quickSort(a, inicio, j, comp);
			quickSort(a, i, fin, comp);
		}
	}

}
