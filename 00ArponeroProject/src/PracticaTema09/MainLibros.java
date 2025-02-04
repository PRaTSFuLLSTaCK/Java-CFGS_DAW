package PracticaTema09;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 
 * Ejercicio 4) Crea una clase denominada Libro que contenga el título del libro y el ISBN de dicho libro,
   crea un programa que cree un ArrayList de objetos de la clase Libro y que contenga al menos 10
   elementos. Después ordena por el título del libro dicho ArrayList, usando el método sort de la clase
   Collections con un comparador (interfaz Comparator)

 * 
 */

public class MainLibros {

	public static void main(String[] args) {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		libros.add(new Libro("Don PinPon me salv� de la cuarentena", "Ids-pisPopD"));
		libros.add(new Libro("Don PinPon me salv� de la cuarentena: el retorno", "pisPopD-Ids"));
		libros.add(new Libro("El Quijote", "Isd-9471"));
		libros.add(new Libro("Camar�n: la verdadera historia", "Cam-91034"));
		libros.add(new Libro("Bel�n Esteban: los or�genes", "BLS-97345"));
		libros.add(new Libro("Truco o Trato", "TOT-943561"));
		libros.add(new Libro("Grand Theft Auto: c�mo se hizo", "GTA-097346"));
		libros.add(new Libro("Star Wars: lo que no te han contado", "SWS-05829"));
		libros.add(new Libro("Neogeo: Gran consola, mejor persona", "NGG-24397"));
		libros.add(new Libro("Sega: el monstruo", "SGE-719345"));
		
		Collections.sort(libros, new TituloComparator());
		
		for (int i = 0; i < libros.size(); i++) {
			System.out.println(libros.get(i));
		}
	}

}
