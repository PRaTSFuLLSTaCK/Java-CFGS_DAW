package practica1Tema6b;

import java.util.Comparator;

public class Alumno implements Comparable<Alumno>{ //creamos la clase alumno con complemento comparable
	
	private int matricula;
	private String nombre;
	private int nota;
	
	//declaracion del constructor para la clase alumno
	
	public Alumno(int matricula, String nombre, int nota) { 
		this.matricula = matricula;
		this.nombre = nombre;
		this.nota = nota;
	}
	
	//fin del constructor
	
	//generacion de los get & set para poder operar con los atributos del objeto Alumno

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	//fin de los get & set de la clase alumno

	@Override
	
	//metodo en el cual comparamos que dos objetos no sean iguales, en este caso comparamos por el atributo matricula
	//ya que entendemos que dos alumnos no pueden tener el mismo numero de matricula
	
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Alumno other = (Alumno) obj;
		if (matricula != other.matricula)
			return false;
		return true;
	}
	
	//fin del metodo de revision de matricula unica

	@Override
	
	//Con este metodo convertimos a cadena de caracteres cualquier objeto 
	public String toString() {
		return "Matricula " + matricula + " => " + nombre + ": " + nota + "puntos";
	}

	@Override
	
	//Con este metodo ordenamos por un atributo los objetos 
	
	public int compareTo(Alumno o) {
		return Integer.compare(this.matricula, o.matricula);
	}
	

}
