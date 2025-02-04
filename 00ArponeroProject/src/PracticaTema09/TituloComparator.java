package PracticaTema09;

import java.util.Comparator;

/*
 * 
 * Ejercicio 4) Crea una clase denominada Libro que contenga el título del libro y el ISBN de dicho libro,
   crea un programa que cree un ArrayList de objetos de la clase Libro y que contenga al menos 10
   elementos. Después ordena por el título del libro dicho ArrayList, usando el método sort de la clase
   Collections con un comparador (interfaz Comparator)

 * 
 */

public class TituloComparator implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getTitulo().compareTo(o2.getTitulo());
	}
	
}
