package practica1Tema6a;

import java.util.Comparator;

//Con este metodo seleccionamos como ordenar los objetos,

//podemos ordenar de forma ascendente, descendente los objetos por el atributo seleccionado

public class MultiComparator implements Comparator<Alumno>{
	
	private int asc;
	private int atributo;
	
	public MultiComparator(int asc, int atributo) {//constructor con argumentos de la clase MultiComparator
		this.asc = asc;
		this.atributo = atributo;
	}

	@Override
	public int compare(Alumno o1, Alumno o2) {//Metodo comparador segun el atributo que seleccionemos
		switch (atributo) {
		case 1://en este caso se ordena por matricula
			if(asc == 1) {
				return o1.compareTo(o2);//por orden ascendente
			}else {
				return -o1.compareTo(o2);//por orden descendente
			}
		case 2://En este caso se ordena por nombre
			if(asc == 1) {
				return o1.getNombre().compareTo(o2.getNombre());//por orden ascendente
			}else {
				return -o1.getNombre().compareTo(o2.getNombre());//por orden descendente
			}
		case 3://en este caso se ordena por nota
			if(asc == 1) {
				return Integer.compare(o1.getNota(), o2.getNota());//por orden ascendente
			}else {
				return -Integer.compare(o1.getNota(), o2.getNota());//por orden descendente
			}
		}
		return 0;
	}

}
