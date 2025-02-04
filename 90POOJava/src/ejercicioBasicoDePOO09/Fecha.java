package ejercicioBasicoDePOO09;

///////////////////////////////////////////////////////////////////////////////////////////
//Clase Fecha
///////////////////////////////////////////////////////////////////////////////////////////


/*
 * 
 * Crea una clase Persona con los siguientes atributos: nombre, dirección, códigoPostal, ciudad y fechaNacimiento.
 * 
El atributo fechaNacimiento es un objeto de la clase Fecha creada en esta entrada.

Las clases Persona y Fecha tienen por tanto una relación de composición.

 * A la clase Fecha que ya tenemos le añadiremos un método boolean esMayorQue(Fecha f) que nos será útil en este ejercicio.
 *  
 * Este método devuelve true si la fecha que contiene el objeto es mayor que la fecha que recibe como parámetro y false en caso contrario.
 * 
La clase Persona contendrá los siguientes métodos:

Constructor

Métodos get y set

Método boolean esMayorDeEdad() que devuelve true si la persona es mayor de edad y false en caso contrario. 

Para sabre si la persona es mayor de edad se comparará la fecha de nacimiento con la fecha actual obtenida del sistema.
 * 
 */

public class Fecha {

	private int dia;
	private int mes;
	private int año;

	//Constructor por defecto
	public Fecha() {
	}

	//Constructor con parámetros
	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	//Métodos get y set
	public void setDia(int d) {
		dia = d;
	}

	public void setMes(int m) {
		mes = m;
	}

	public void setAño(int a) {
		año = a;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAño() {
		return año;
	}

	//Comprobar si la fecha es correcta
	public boolean fechaCorrecta() {
		boolean diaCorrecto, mesCorrecto, añoCorrecto;
		añoCorrecto = año > 0;
		mesCorrecto = mes >= 1 && mes <= 12;
		switch (mes) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = dia >= 1 && dia <= 29;
			} else {
				diaCorrecto = dia >= 1 && dia <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = dia >= 1 && dia <= 30;
			break;
		default:
			diaCorrecto = dia >= 1 && dia <= 31;
		}
		return diaCorrecto && mesCorrecto && añoCorrecto;
	}

	//Comprobar si el año es bisiesto
	//Método privado invocado desde el método fechaCorrecta
	private boolean esBisiesto() {
		return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
	}

	public void diaSiguiente() {
		dia++;
		if (!fechaCorrecta()) {
			dia = 1;
			mes++;
			if (!fechaCorrecta()) {
				mes = 1;
				año++;
			}

		}
	}

	//Método para comprobar si la fecha es mayor que la que se recibe
	public boolean esMayorQue(Fecha f){
		if(año > f.año) {
			return true;
		}
		else if(año==f.año && mes > f.mes) {
			return true;
		}
		else if(año==f.año && mes == f.mes && dia > f.dia) {
			return true;
		}
		return false;
	}

	//Método para mostrar la fecha
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (dia < 10) {
			sb.append("0");
		}
		sb.append(dia);
		sb.append("-");
		if (mes < 10) {
			sb.append("0");
		}
		sb.append(mes);
		sb.append("-");

		sb.append(año);
		return sb.toString();
	}
} //Final de la Clase Fecha
