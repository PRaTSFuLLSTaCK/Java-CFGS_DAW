package PracticaTema09;

/*
 * 
 * Ejercicio 4) Crea una clase denominada Libro que contenga el título del libro y el ISBN de dicho libro,
   crea un programa que cree un ArrayList de objetos de la clase Libro y que contenga al menos 10
   elementos. Después ordena por el título del libro dicho ArrayList, usando el método sort de la clase
   Collections con un comparador (interfaz Comparator)

 * 
 */

public class Libro {
	private String titulo;
	private String isbn;
	public Libro(String titulo, String isbn) {
		this.titulo = titulo;
		this.isbn = isbn;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return titulo + " (" + isbn + ")";
	}
	
	
}
